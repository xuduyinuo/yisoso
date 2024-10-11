package com.xudu.yisoso;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xudu.yisoso.mapper")
public class YisosoApplication {

    public static void main(String[] args) {
        SpringApplication.run(YisosoApplication.class, args);
    }

}
