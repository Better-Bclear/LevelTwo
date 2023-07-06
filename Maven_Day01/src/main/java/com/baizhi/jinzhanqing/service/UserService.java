package com.baizhi.jinzhanqing.service;

import com.baizhi.jinzhanqing.entity.vo.PaginationVO;

public interface UserService {
    public PaginationVO queryByPage(int size, int page);
    public String login(String username, String password);
}
