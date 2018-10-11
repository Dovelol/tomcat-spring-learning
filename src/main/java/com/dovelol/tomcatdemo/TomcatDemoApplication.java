package com.dovelol.tomcatdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan
@ComponentScan
@MapperScan("com.dovelol.tomcatdemo.mapper")
public class TomcatDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TomcatDemoApplication.class, args);
    }
}
