package com.CinephileLog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.CinephileLog.mapper")
public class CinephileLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinephileLogApplication.class, args);
    }

}
