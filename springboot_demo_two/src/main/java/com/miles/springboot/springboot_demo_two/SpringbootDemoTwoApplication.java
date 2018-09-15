package com.miles.springboot.springboot_demo_two;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.miles.springboot.springboot_demo_two.dao")
@SpringBootApplication
@EnableTransactionManagement
public class SpringbootDemoTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoTwoApplication.class, args);
    }
}
