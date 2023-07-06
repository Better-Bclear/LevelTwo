package com.baizhi.jinzhanqing.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户表(User)实体类
 *
 * @author makejava
 * @since 2023-07-06 11:35:24
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 984640626909917733L;
    
    private Long userId;
    
    private String userName;
    
    private String userPwd;
    
    private String userEmail;
    
    private Integer userRole;
    
    private String userHeadImg;




}

