package com.baizhi.jinzhanqing.dao.impl;

import com.baizhi.jinzhanqing.dao.UserDao;
import com.baizhi.jinzhanqing.entity.User;
import com.baizhi.jinzhanqing.entity.vo.PaginationVO;
import com.baizhi.jinzhanqing.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public PaginationVO queryByPage(int size,int page) {
        PaginationVO vo = new PaginationVO();
        vo.setSize(size);
        vo.setPage(page);
        vo.setTotal(this.getTotal());
        vo.setPages(this.getPages(size, vo.getTotal()));
        Connection connection = JDBCUtil.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<User> users = new ArrayList<>();
        try {
            String sql = "select * from user limit ?,?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, (page - 1) * size);
            preparedStatement.setInt(2, size);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                User user = new User();
                user.setUserId(resultSet.getLong("user_id"));
                user.setUserName(resultSet.getString("user_name"));
                user.setUserPwd(resultSet.getString("user_pwd"));
                user.setUserEmail(resultSet.getString("user_email"));
                user.setUserRole(resultSet.getInt("user_role"));
                user.setUserHeadImg(resultSet.getString("user_head_img"));
                users.add(user);
            }
            vo.setUsers(users);

        }catch (Exception e){
            e.printStackTrace();
        }
        return vo;
    }

    @Override
    public User queryByUsername(String username) {
        Connection connection = JDBCUtil.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        User user = null;
        try {
            String sql = "select * from user where user_name=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                user = new User();
                user.setUserId(resultSet.getLong("user_id"));
                user.setUserName(resultSet.getString("user_name"));
                user.setUserPwd(resultSet.getString("user_pwd"));
                user.setUserEmail(resultSet.getString("user_email"));
                user.setUserRole(resultSet.getInt("user_role"));
                user.setUserHeadImg(resultSet.getString("user_head_img"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    public int getTotal(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int total = 0;
        try{
            connection = JDBCUtil.getConnection();
            String sql = "select count(*) from user";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                total = resultSet.getInt(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return total;
    }
    public int getPages(int size,int total){
        return total%size==0?total/size:total/size+1;
    }
}
