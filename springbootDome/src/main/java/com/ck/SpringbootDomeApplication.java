package com.ck;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot 启动类
 *
 * @author CK
 */
@MapperScan("com.ck.mapper")
@SpringBootApplication
public class SpringbootDomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDomeApplication.class, args);
    }

}
