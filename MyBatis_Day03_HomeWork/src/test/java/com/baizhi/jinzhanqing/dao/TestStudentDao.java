package com.baizhi.jinzhanqing.dao;

import com.baizhi.jinzhanqing.entity.Student;
import com.baizhi.jinzhanqing.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestStudentDao {
    private final SqlSession session = MyBatisUtil.getSession();
    private final StudentDao studentDao = session.getMapper(StudentDao.class);
    @Test
    public void testConnection(){
        SqlSession session = MyBatisUtil.getSession();
        System.out.println(session.getConnection());
    }
    @Test
    public void testQueryAll(){
        List<Student> list = studentDao.queryAll();
        list.forEach(System.out::println);
    }
}
