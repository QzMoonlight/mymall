package com.moonlightqz.mymall.service;


import com.moonlightqz.mymall.entity.PmsBrand;
import com.moonlightqz.mymall.model.dto.PmsBrandDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PmsBrandService {

    /**
     * 查询所有Brand
     */

    List<PmsBrand> listAllBrand();

    /**
     * 根据Id访问Brand
     */
    PmsBrand getBrandById(Long id);

    /**
     * 创建品牌
     */
    boolean createBrand(PmsBrandDto pmsBrandDto);

    /**
     * 修改品牌
     */
    @Transactional
    boolean updateBrand(Long id, PmsBrandDto pmsBrandDto);

    /**
     * 批量修改显示状态
     */
    boolean updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * 删除品牌
     */
    boolean deleteBrand(Long id);

    /**
     * 批量删除品牌
     */
    boolean deleteBrand(List<Long> ids);

    /**
     * 分页查询品牌
     */
    List<PmsBrand> listBrand(String keyword, Integer showStatus, int pageNum, int pageSize);
//

//
//    /**
//     * 修改厂家制造商状态
//     */
//    int updateFactoryStatus(List<Long> ids, Integer factoryStatus);
}
