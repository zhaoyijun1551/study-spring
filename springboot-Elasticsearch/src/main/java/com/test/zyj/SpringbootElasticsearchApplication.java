package com.test.zyj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@MapperScan("com.test.zyj.tiny.mbg.mapper")
@SpringBootApplication
public class SpringbootElasticsearchApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootElasticsearchApplication.class,args);
    }
}
