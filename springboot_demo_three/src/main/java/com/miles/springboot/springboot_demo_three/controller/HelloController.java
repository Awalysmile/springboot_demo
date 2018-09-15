package com.miles.springboot.springboot_demo_three.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hell(Model model){
        System.out.println("调用了此方法");
        model.addAttribute("name", "小明是");
        model.addAttribute("age", 17);
        model.addAttribute("address", "SaiLiNenZhenGDChina");

        List<String> strus = new ArrayList<>();
        strus.add("足球");
        strus.add("足dad");
        strus.add("dgd");
        strus.add("莫不");
        model.addAttribute("datas", strus);

        model.addAttribute("birthday", new Date());
        return "hello";
    }
}
