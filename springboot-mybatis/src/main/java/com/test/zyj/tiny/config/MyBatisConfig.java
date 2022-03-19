package com.test.zyj.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan("com.test.zyj.tiny.mbg.mapper")
public class MyBatisConfig {
}
