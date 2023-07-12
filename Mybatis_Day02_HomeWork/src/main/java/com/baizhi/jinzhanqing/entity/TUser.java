package com.baizhi.jinzhanqing.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (TUser)表实体类
 *
 * @author makejava
 * @since 2023-07-09 17:38:11
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class TUser extends Model<TUser> {
    
    private Integer userId;
    
    private String userName;
    
    private String password;
    
    private String mobile;
    
    private String sex;
    
    private Integer age;
    
    private String description;



    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.userId;
    }
    }

