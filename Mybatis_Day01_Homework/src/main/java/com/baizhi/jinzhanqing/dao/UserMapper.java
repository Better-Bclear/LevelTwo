package com.baizhi.jinzhanqing.dao;

import com.baizhi.jinzhanqing.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //根据username查一个  用于登录
    public User queryByUserName(User u);

    //增加方法  用于注册
    public void insert(User u);

    //查询所有  用于展示表
//    public List<User> queryAll();
    //分页查询
    public List<User> queryAll(@Param("size") int size,@Param("start") int start);
    //删除方法 用于删除员工
    public void deleteById(int id);

    //根据id差一个 用处查看特定员工信息
    public User queryById(int id);

    //重载第一个方法 根据名字差一个
    public List<User> queryLikeUserName(String str);

    //查询用户的个数
    public int countOfUser();
}
