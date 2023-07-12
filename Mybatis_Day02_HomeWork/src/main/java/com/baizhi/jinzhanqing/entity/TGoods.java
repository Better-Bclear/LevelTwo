package com.baizhi.jinzhanqing.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (TGoods)表实体类
 *
 * @author makejava
 * @since 2023-07-09 17:38:11
 */
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = true)
@Data
public class TGoods extends Model<TGoods> {
    //商品编号
    private Integer goodsId;
    //商品名称
    private String goodsName;
    //商品库存
    private Integer stock;
    //进货价
    private Double costPrice;
    //零售价
    private Double retailPrice;
    //折扣
    private Double discount;
    //状态：1上架 0下架
    private Integer status;
    //类别id
    private Integer categoryId;
    //上架时间
    private Date listTime;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
    //商品介绍
    private String introduction;



    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.goodsId;
    }
    }

