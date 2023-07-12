package com.baizhi.jinzhanqing.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (TCategory)表实体类
 *
 * @author makejava
 * @since 2023-07-09 17:38:08
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class TCategory extends Model<TCategory> {
    //类别编号
    private Integer categoryId;
    //类别名
    private String categoryName;
    //类别说明
    private String description;



    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.categoryId;
    }
    }

