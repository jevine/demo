package com.example.demo.controller;


import com.alibaba.fastjson.JSON;

import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    @Qualifier("studentServiceImp")
    private StudentService studentService;

    @RequestMapping(value = "/search",produces = "text/html;charset=UTF-8")
    String search(String startDate,String endDate,String keyWords){
        DateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
        List<Student> list = null;
        try {
            list=studentService.search(dateFormat.parse(startDate),dateFormat.parse(endDate),keyWords);
        }catch (Exception e){
            e.printStackTrace();
        }
        return JSON.toJSONStringWithDateFormat(list,"yyyy-MM-dd");
    }

    @RequestMapping(value = "/searchAllStudent",produces = "text/html;charset=UTF-8")
    String searchAllStudent(String id){
        List<Student> list;
        if (id!=null&&!"".equals(id)){
            list=studentService.searchAllStudent(Integer.parseInt(id));
        }else {
            list=studentService.searchAllStudent(null);
        }
      return JSON.toJSONStringWithDateFormat(list,"yyyy-MM-dd");
    }
    @RequestMapping("/updateOneStudent")
    String updateOneStudent(Student student){
        return String.valueOf(studentService.updateOneStudent(student));

    }
    @RequestMapping("/deleteOneStudent")
    String deleteOneStudent(int id){
        return String.valueOf(studentService.deleteOneStudent(id));
    }
    @RequestMapping("/addOneStudent")
    String addOneStudent(Student student){
        return String.valueOf(studentService.addOneStudent(student));
    }



}
