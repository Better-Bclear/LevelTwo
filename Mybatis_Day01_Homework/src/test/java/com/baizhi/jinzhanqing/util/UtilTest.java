package com.baizhi.jinzhanqing.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class UtilTest {
    @Test
    public void testConnection(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("config/mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            System.out.println(sqlSession.getConnection());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
