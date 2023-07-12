package com.baizhi.jinzhanqing.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Student{
    private int id;
    private String name;
    private List<Course> course;
}
