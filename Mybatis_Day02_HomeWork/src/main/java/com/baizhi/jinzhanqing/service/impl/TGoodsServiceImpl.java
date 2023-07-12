package com.baizhi.jinzhanqing.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baizhi.jinzhanqing.dao.TGoodsDao;
import com.baizhi.jinzhanqing.entity.TGoods;
import com.baizhi.jinzhanqing.service.TGoodsService;
import org.springframework.stereotype.Service;

/**
 * (TGoods)表服务实现类
 *
 * @author makejava
 * @since 2023-07-09 17:38:11
 */
@Service("tGoodsService")
public class TGoodsServiceImpl extends ServiceImpl<TGoodsDao, TGoods> implements TGoodsService {

}

