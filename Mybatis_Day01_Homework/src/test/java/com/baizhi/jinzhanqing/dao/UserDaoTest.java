package com.baizhi.jinzhanqing.dao;

import com.baizhi.jinzhanqing.entity.User;
import com.baizhi.jinzhanqing.util.MyBatisUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

@Slf4j
public class UserDaoTest {
    private final SqlSession sqlSession = MyBatisUtil.getSession();
    private final UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    @Test
    public void testQueryByUserName(){
        User user = new User();
        user.setUserName("jinzhanqing");
        user.setUserPwd("123456");
        userMapper.queryByUserName(user);
    }
    @Test
    public void testInsert(){
        User user = new User();
        user.setUserName("jinzhanqing");
        user.setUserPwd("123456");
        user.setUserRole(1);
        user.setUserHeadImg("dsafhasjfh");
        user.setUserEmail("sadjfhaj@sdkfjask");
        userMapper.insert(user);
        sqlSession.commit();
    }
    @Test
    public void testQueryAll(){
        userMapper.queryAll(10,0);
    }
    @Test
    public void testDelete(){
        userMapper.deleteById(130);
        sqlSession.commit();
    }
    @Test
    public void testQueryById(){
        userMapper.queryById(131);
    }
    @Test
    public void testQueryLikeUserName(){
        userMapper.queryLikeUserName("adm");
    }
    @Test
    public void testCount(){
        userMapper.countOfUser();
    }
}
