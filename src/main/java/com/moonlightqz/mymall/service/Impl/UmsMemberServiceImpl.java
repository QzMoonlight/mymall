package com.moonlightqz.mymall.service.Impl;

import cn.hutool.core.util.StrUtil;
import com.moonlightqz.mymall.model.vo.Result;
import com.moonlightqz.mymall.service.RedisService;
import com.moonlightqz.mymall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    RedisService redisService;

    @Value("${redis.key.prefix.authCode}")
    private String REDIS_KEY_PREFIX_AUTH_CODE;
    @Value("${redis.key.expire.authCode}")
    private Long AUTH_CODE_EXPIRE_SECONDS;

    @Override
    public Result generateAuthCode(String telephone) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10));
        }
        //验证码绑定手机号并存储到redis
        redisService.set(REDIS_KEY_PREFIX_AUTH_CODE + telephone, sb.toString());
        redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE + telephone, AUTH_CODE_EXPIRE_SECONDS);
        return Result.successWithData(sb.toString());
    }

    @Override
    public Result verifyAuthCode(String telephone, String authCode) {
        if (StrUtil.isEmpty(authCode)) {
            return Result.failedWithMsg("请输入验证码");
        }
        String realAuthCode = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + telephone);
        boolean result = authCode.equals(realAuthCode);
        if (result) {
            return Result.successWithMsg("验证码校验成功");
        } else {
            return Result.failedWithMsg("验证码不正确");
        }
    }
}
