package com.example.demo.service;


import com.example.demo.pojo.Student;

import java.util.Date;
import java.util.List;

/**
 * @Author : JJ Zheng
 * @create 2021/5/12 16:11
 */

public interface StudentService {
    List<Student> searchAllStudent(Integer id);


     int updateOneStudent(Student student);


    int deleteOneStudent(int id);


    int addOneStudent(Student student);

    List<Student> search(Date startDate, Date endDate,String keyWords);
}
