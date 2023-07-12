package com.baizhi.jinzhanqing.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (Student)表实体类
 *
 * @author makejava
 * @since 2023-07-11 17:37:18
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class Student extends Model<Student> {
    
    private Integer id;
    
    private String name;
    
    private Integer classId;



    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    }

