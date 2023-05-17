package com.moonlightqz.mymall.service.Impl;

import com.moonlightqz.mymall.entity.AdminUserDetails;
import com.moonlightqz.mymall.entity.UmsAdmin;
import com.moonlightqz.mymall.entity.UmsPermission;
import com.moonlightqz.mymall.service.UmsAdminService;
import com.moonlightqz.mymall.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UmsAdminService umsAdminService;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {

        UmsAdmin admin = umsAdminService.getAdminByUsername(name);
        if (admin != null) {
            List<UmsPermission> permissionList = umsAdminService.getPermissionList(admin.getId());
            return new AdminUserDetails(admin, null, permissionList);
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }
}
