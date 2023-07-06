package com.baizhi.jinzhanqing.service;

import com.baizhi.jinzhanqing.entity.User;
import com.baizhi.jinzhanqing.entity.vo.Pagination;

import java.util.List;

public interface UserService {
    public String login(User user);
    public void register(User user);
    public Pagination queryByPage(int size, int page);
    public void removeById(int id);
    public User queryById(int id);
    public List<User> queryLikeUsername(String username);
}
