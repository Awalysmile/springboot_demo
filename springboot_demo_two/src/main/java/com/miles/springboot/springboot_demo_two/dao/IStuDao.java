package com.miles.springboot.springboot_demo_two.dao;

import com.miles.springboot.springboot_demo_two.entity.Student;

import java.util.List;

public interface IStuDao {
    List<Student> queryAll();

    int insert(Student student);
}
