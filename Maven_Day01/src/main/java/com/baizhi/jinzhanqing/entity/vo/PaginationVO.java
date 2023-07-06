package com.baizhi.jinzhanqing.entity.vo;

import com.baizhi.jinzhanqing.entity.User;

import java.util.List;

public class PaginationVO {
    private Integer page;
    private Integer size;
    private Integer total;
    private List<User> users;
    private Integer pages;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "PaginationVO{" +
                "page=" + page +
                ", size=" + size +
                ", total=" + total +
                ", users=" + users +
                '}';
    }
}
