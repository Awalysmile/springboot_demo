package com.miles.springboot.springboot_demo_one.mycontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Value("${come.name}")
    private String name;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("调用了controller"+name);
        return "hello springboot";
    }
}
