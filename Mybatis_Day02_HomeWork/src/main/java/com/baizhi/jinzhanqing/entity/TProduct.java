package com.baizhi.jinzhanqing.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (TProduct)表实体类
 *
 * @author makejava
 * @since 2023-07-09 17:38:11
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class TProduct extends Model<TProduct> {
    
    private Integer productId;
    
    private String productName;
    
    private Double productPrice;
    
    private Integer productCount;
    
    private Integer productStatus;
    
    private Date productOnDate;



    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.productId;
    }
    }

