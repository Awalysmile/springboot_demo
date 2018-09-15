package com.miles.springboot.springboot_demo_one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootDemoOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoOneApplication.class, args);
    }
}
