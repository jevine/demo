package com.example.demo.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 对数据库进行封装
 *
 * @author glodon
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private int student_id;
    private String name;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birth;
    private String area;
    private Boolean sex;

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", area='" + area + '\'' +
                ", sex=" + sex +
                '}';
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
