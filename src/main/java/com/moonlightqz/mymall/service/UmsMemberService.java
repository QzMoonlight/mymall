package com.moonlightqz.mymall.service;

import com.moonlightqz.mymall.model.vo.Result;

public interface UmsMemberService {
    Result generateAuthCode(String telephone);

    Result verifyAuthCode(String telephone, String authCode);
}
