package com.moonlightqz.mymall.controller;

import com.moonlightqz.mymall.entity.PmsBrand;
import com.moonlightqz.mymall.model.dto.PageDto;
import com.moonlightqz.mymall.model.dto.PmsBrandDto;
import com.moonlightqz.mymall.model.vo.Result;
import com.moonlightqz.mymall.service.PmsBrandService;
import io.swagger.annotations.ApiOperation;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/brand")
public class PmsBrandController {

    @Autowired
    private PmsBrandService pmsBrandService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

    @ApiOperation(value = "创建Brand")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Result createBrand(@Validated @RequestBody PmsBrandDto pmsBrandDto) {

        boolean flag = pmsBrandService.createBrand(pmsBrandDto);
        if(flag) {
            return Result.successWithMsg("创建Brand成功");
        } else {
            return Result.failedWithMsg("创建Brand失败");
        }
    }

    @ApiOperation(value = "按照Id更新Brand")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Result update(@PathVariable("id") Long id,
                         @Validated @RequestBody PmsBrandDto pmsBrandDto) {

        boolean flag = pmsBrandService.updateBrand(id, pmsBrandDto);
        if (flag) {
            return Result.successWithMsg("更新Brand成功");
        } else {
            return Result.failedWithMsg("更新Brand失败");
        }
    }

    @ApiOperation(value = "根据Id批量更新Status")
    @RequestMapping(value = "/update/showStatus", method = RequestMethod.POST)
    @ResponseBody
    public Result updateShowStatus(@RequestParam("ids") List<Long> ids,
                                   @RequestParam("showStatus") Integer showStatus) {
        boolean flag = pmsBrandService.updateShowStatus(ids, showStatus);
        if (flag) {
            return Result.successWithMsg("更新显示状态成功");
        } else {
            return Result.failedWithMsg("更新显示状态失败");
        }
    }

    @ApiOperation(value = "展示所有Brand")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public Result<List<PmsBrand>> getBrandList() {
        return Result.successWithData(pmsBrandService.listAllBrand());
    }

    @ApiOperation(value = "根据Id获取Brand")
    @RequestMapping(value = "/list/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result<PmsBrand> getBrandById(@PathVariable Long id) {
        return Result.successWithData(pmsBrandService.getBrandById(id));
    }

    @ApiOperation(value = "分页展示Brand")
    @RequestMapping(value = "/listPage", method = RequestMethod.GET)
    @ResponseBody
    public Result<PageDto<PmsBrand>> getList(@RequestParam(value = "keyword", required = false) String keyword,
                                             @RequestParam(value = "showStatus",required = false) Integer showStatus,
                                             @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                             @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        List<PmsBrand> brandList = pmsBrandService.listBrand(keyword,showStatus,pageNum, pageSize);
        return Result.successWithData(PageDto.restPage(brandList));
    }

    @ApiOperation(value = "根据Id删除Brand")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result delete(@PathVariable("id") Long id) {
        boolean flag = pmsBrandService.deleteBrand(id);
        if (flag) {
            return Result.successWithMsg("删除Brand成功");
        } else {
            return Result.failedWithMsg("删除Brand失败");
        }
    }

    @ApiOperation(value = "根据Id批量删除Brand")
    @RequestMapping(value = "/delete/batch", method = RequestMethod.POST)
    @ResponseBody
    public Result deleteBatch(@RequestParam("ids") List<Long> ids) {
        boolean flag = pmsBrandService.deleteBrand(ids);
        if (flag) {
            return Result.successWithMsg("批量删除Brand成功");
        } else {
            return Result.failedWithMsg("批量删除Brand失败");
        }
    }

}

