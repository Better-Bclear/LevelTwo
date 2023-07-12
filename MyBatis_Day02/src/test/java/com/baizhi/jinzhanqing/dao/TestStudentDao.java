package com.baizhi.jinzhanqing.dao;

import com.baizhi.jinzhanqing.entity.Student;
import com.baizhi.jinzhanqing.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestStudentDao {
    private final SqlSession sqlSession = MyBatisUtil.getSession();
    private final StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
    @Test
    public void testQueryAll(){
        List<Student> list = studentDao.queryAll();
    }
}
