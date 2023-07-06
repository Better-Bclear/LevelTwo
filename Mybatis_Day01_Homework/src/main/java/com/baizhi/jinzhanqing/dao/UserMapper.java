package com.baizhi.jinzhanqing.dao;

import com.baizhi.jinzhanqing.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
//    查所有
    public List<User> queryAll();
//    根据id删除
    public void deleteById(int id);
//    根据用户名模糊查
    public List<User> queryByName(String name);
//    根据用户名和密码查询
    public User queryByUsernameAndPwd(@Param("userName") String username, @Param("passWord") String password);
}
