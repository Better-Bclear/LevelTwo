package com.baizhi.jinzhanqing.service;

import com.baizhi.jinzhanqing.entity.Student;

import java.util.List;

/**
 * (StudentCourse)表服务接口
 *
 * @author makejava
 * @since 2023-07-11 17:37:22
 */
public interface StudentService {
    public List<Student> queryAll();
    public void deleteRelation(int id);
}

