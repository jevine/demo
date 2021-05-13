package com.example.demo.dao;


import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author JJ Zheng
 */
@Mapper
public interface StudentMapping {

    List<Student> searchAllStudent(@Param("student_id") Integer id);


    int updateOneStudent(Student student);


    int deleteOneStudent(@Param("student_id") int id);


    int addOneStudent(Student student);

    List<Student> search(@Param("startDate") Date startDate, @Param("endDate")Date endDate, @Param("keyWords")String keyWords);









}
