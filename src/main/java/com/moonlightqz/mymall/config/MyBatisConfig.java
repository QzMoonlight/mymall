package com.moonlightqz.mymall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.moonlightqz.mymall.mapper")
public class MyBatisConfig {
}