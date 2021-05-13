package com.example.demo.service;


import com.example.demo.dao.StudentMapping;
import com.example.demo.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author : JJ Zheng
 * @create 2021/5/12 16:18
 */
@Service
public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentMapping studentMapping;
    @Override
    public List<Student> searchAllStudent(Integer id) {
        return studentMapping.searchAllStudent(id);
    }

    @Override
    public int updateOneStudent(Student student) {
        return studentMapping.updateOneStudent(student);
    }

    @Override
    public int deleteOneStudent(int id) {
        return studentMapping.deleteOneStudent(id);
    }

    @Override
    public int addOneStudent(Student student) {
        return studentMapping.addOneStudent(student);
    }

    @Override
    public List<Student> search(Date startDate, Date endDate, String keyWords) {
        return studentMapping.search(startDate,endDate,keyWords);
    }
}
