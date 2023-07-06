package com.baizhi.jinzhanqing.entity.vo;

import com.baizhi.jinzhanqing.entity.User;
import lombok.Data;

import java.util.List;

@Data
public class Pagination {
    private int page;
    private int pages;
    private int total;
    private int size;
    private List<User> list;
}
