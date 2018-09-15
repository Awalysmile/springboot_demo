package com.miles.springboot.springboot_demo_two.service.impl;

import com.miles.springboot.springboot_demo_two.dao.IStuDao;
import com.miles.springboot.springboot_demo_two.entity.Student;
import com.miles.springboot.springboot_demo_two.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StuServiceImpl implements IStuService {

    @Autowired
    private IStuDao stuDao;

    @Override
    @Transactional
    public int insert(Student student) {
        int resutl = stuDao.insert(student);
//        System.out.println(1/0);
        return resutl;

    }

    @Override
    public List<Student> queryAll() {
        return stuDao.queryAll();
    }
}
