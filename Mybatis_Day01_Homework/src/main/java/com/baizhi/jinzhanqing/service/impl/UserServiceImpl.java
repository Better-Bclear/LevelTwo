package com.baizhi.jinzhanqing.service.impl;

import com.baizhi.jinzhanqing.dao.UserMapper;
import com.baizhi.jinzhanqing.entity.User;
import com.baizhi.jinzhanqing.entity.vo.Pagination;
import com.baizhi.jinzhanqing.service.UserService;
import com.baizhi.jinzhanqing.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final SqlSession sqlSession = MyBatisUtil.getSession();
    private final UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

    @Override
    public String login(User user) {
        User user1 = userMapper.queryByUserName(user);
        if (user1 == null || user1.getUserName() == null){
            return "用户不存在";
        }else {
            if (user1.getUserPwd().equals(user.getUserPwd())){
                if (user1.getUserRole()==1){
                    return "管理员登陆";
                }else{
                    return "登陆成功";
                }
            }else {
                return "密码错误";
            }
        }
    }

    @Override
    public void register(User user) {
        try{
            userMapper.insert(user);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Pagination queryByPage(int size, int page) {
        int total = userMapper.countOfUser();
        int start = (page-1)*size;
        Pagination pagination = new Pagination();

        pagination.setPage(page);
        pagination.setSize(size);
        pagination.setTotal(total);
        pagination.setPages(this.getPages(total,size));
        pagination.setList(userMapper.queryAll(size,start));
        return pagination;
    }

    @Override
    public void removeById(int id) {
        userMapper.deleteById(id);
        sqlSession.commit();
    }

    @Override
    public User queryById(int id) {
        return userMapper.queryById(id);
    }

    @Override
    public List<User> queryLikeUsername(String username) {
        return userMapper.queryLikeUserName(username);
    }
    public int getPages(int total,int size){
        return total%size==0?total/size:total/size+1;
    }
}
