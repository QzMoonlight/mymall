//package com.moonlightqz.mymall.controller;
//
//import com.moonlightqz.mymall.entity.UmsAdmin;
//import com.moonlightqz.mymall.entity.UmsPermission;
//import com.moonlightqz.mymall.model.dto.UmsAdminDto;
//import com.moonlightqz.mymall.model.dto.UmsAdminLoginDto;
//import com.moonlightqz.mymall.model.vo.Result;
//import com.moonlightqz.mymall.service.UmsAdminService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Controller
//@Api(tags = "UmsAdminController", description = "后台用户管理")
//@RequestMapping("/admin")
//public class UmsAdminController {
//
//    @Autowired
//    private UmsAdminService umsAdminService;
//    @Value("${jwt.tokenHeader}")
//    private String tokenHeader;
//    @Value("${jwt.tokenHead}")
//    private String tokenHead;
//
//    @ApiOperation(value = "用户注册")
//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    @ResponseBody
//    public Result<UmsAdmin> register(@RequestBody UmsAdminDto umsAdminDto, BindingResult result) {
//        UmsAdmin umsAdmin = umsAdminService.register(umsAdminDto);
//        if (umsAdmin == null) {
//            Result.failedWithMsg("用户名已存在");
//        }
//        return Result.successWithMsg("注册成功");
//    }
//
//    @ApiOperation(value = "登录以后返回token")
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    @ResponseBody
//    public Result login(@RequestBody UmsAdminLoginDto umsAdminLoginDto, BindingResult result) {
//        String token = umsAdminService.login(umsAdminLoginDto.getUsername(), umsAdminLoginDto.getPassword());
//        if (token == null) {
//            return Result.failedWithMsg("账户名或密码错误");
//        }
//        Map<String, String> tokenMap = new HashMap<>();
//        tokenMap.put("token", token);
//        tokenMap.put("tokenHead", tokenHead);
//        return Result.successWithData(tokenMap);
//    }
//
//    @ApiOperation("获取用户所有权限（包括+-权限）")
//    @RequestMapping(value = "/permission/{adminId}", method = RequestMethod.GET)
//    @ResponseBody
//    public Result<List<UmsPermission>> getPermissionList(@PathVariable Long adminId) {
//        List<UmsPermission> permissionList = adminService.getPermissionList(adminId);
//        return Result.successWithData(permissionList);
//    }
//}
