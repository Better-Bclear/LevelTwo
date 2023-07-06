package com.baizhi.jinzhanqing.dao;

import com.baizhi.jinzhanqing.entity.User;
import com.baizhi.jinzhanqing.entity.vo.PaginationVO;

public interface UserDao {
    public PaginationVO queryByPage(int size, int page);
    public User queryByUsername(String username);
}
