package com.miles.springboot.springboot_demo_two.service;

import com.miles.springboot.springboot_demo_two.entity.Student;

import java.util.List;

public interface IStuService {
    int insert(Student student);

    List<Student> queryAll();
}
