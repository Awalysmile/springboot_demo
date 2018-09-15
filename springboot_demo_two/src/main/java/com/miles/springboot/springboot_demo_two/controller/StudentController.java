package com.miles.springboot.springboot_demo_two.controller;

import com.miles.springboot.springboot_demo_two.entity.Student;
import com.miles.springboot.springboot_demo_two.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private IStuService stuService;

    @RequestMapping("/queryall")
    public String queryAll(Model model){
        List<Student> stus = stuService.queryAll();
        System.out.println(stus.toString());
        model.addAttribute("stus", stus);
        return "studentlist";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(){
        Student stu = new Student();
        stu.setName("小小明明");
        stu.setAge(23);
        stu.setCid(2);
        return stuService.insert(stu);
    }
}
