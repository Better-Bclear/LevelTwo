package com.baizhi.jinzhanqing.service;

import com.baizhi.jinzhanqing.dao.UserDao;
import com.baizhi.jinzhanqing.dao.impl.UserDaoImpl;
import com.baizhi.jinzhanqing.entity.User;
import com.baizhi.jinzhanqing.entity.vo.PaginationVO;

public class UserServiceImpl implements UserService{
    UserDao userDao = new UserDaoImpl();
    @Override
    public PaginationVO queryByPage(int size,int page) {
        return userDao.queryByPage(size, page);
    }

    @Override
    public String login(String username, String password) {
        User user = userDao.queryByUsername(username);
        if (user==null || user.getUserName()==null){
            return "账号错误";
        }else{
            if (!user.getUserPwd().equals(password)){
                return "密码错误";
            }else{
                if (user.getUserRole()==1){
                    return "管理员登录";
                }else{
                    return "登陆成功";
                }
            }
        }
    }
}
