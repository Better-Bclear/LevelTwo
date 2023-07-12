package com.baizhi.jinzhanqing.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baizhi.jinzhanqing.dao.TProductDao;
import com.baizhi.jinzhanqing.entity.TProduct;
import com.baizhi.jinzhanqing.service.TProductService;
import org.springframework.stereotype.Service;

/**
 * (TProduct)表服务实现类
 *
 * @author makejava
 * @since 2023-07-09 17:38:11
 */
@Service("tProductService")
public class TProductServiceImpl extends ServiceImpl<TProductDao, TProduct> implements TProductService {

}

