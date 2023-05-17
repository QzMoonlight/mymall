package com.moonlightqz.mymall.service;

import com.moonlightqz.mymall.entity.UmsAdmin;
import com.moonlightqz.mymall.entity.UmsPermission;
import com.moonlightqz.mymall.model.dto.UmsAdminDto;

import java.util.List;

public interface UmsAdminService {


    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdminDto umsAdminDto);

    /**
     * 登录功能
     *
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);

    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);
}

