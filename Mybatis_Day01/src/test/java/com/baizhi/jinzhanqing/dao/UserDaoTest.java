package com.baizhi.jinzhanqing.dao;

import com.baizhi.jinzhanqing.entity.User;
import com.baizhi.jinzhanqing.util.MyBatisUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Slf4j
public class UserDaoTest {
    private final SqlSession session = MyBatisUtil.getSession();
    private final UserMapper userMapper = session.getMapper(UserMapper.class);
    @Test
    public void testSelectAll() {

////            读取mybatis的配置文件
//            InputStream resourceAsStream = Resources.getResourceAsStream("config/mybatis-config.xml");
////            获取工厂创建对象
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
////            创建工厂对象
//            SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
////            创建sqlSession
//            SqlSession sqlSession = build.openSession();
////            获取UserMapper接口
//            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
////            执行方法
//            List<User> users = mapper.queryAll();
////            输出
        List<User> users = userMapper.queryAll();
    }
    @Test
    public void testDeleteById(){
        userMapper.deleteById(103);
        session.commit();
    }
    @Test
    public void testSelectByUsername(){
        List<User> tzax = userMapper.queryByName("tz");
    }
    @Test
    public void testQueryByUsernameAndPwd(){
        userMapper.queryByUsernameAndPwd("1' or '1'='1","1' or '1'='1");
    }
}
