package com.baizhi.jinzhanqing.dao;

import com.baizhi.jinzhanqing.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baizhi.jinzhanqing.entity.Course;

import java.util.List;

/**
 * (Course)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-11 17:37:13
 */
public interface StudentDao {
    public List<Student> queryAll();
    public void deleteRelation(int id);
    public void deleteStudent(int id);
}

