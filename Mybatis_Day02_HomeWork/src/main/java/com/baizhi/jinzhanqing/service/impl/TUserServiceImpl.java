package com.baizhi.jinzhanqing.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baizhi.jinzhanqing.dao.TUserDao;
import com.baizhi.jinzhanqing.entity.TUser;
import com.baizhi.jinzhanqing.service.TUserService;
import org.springframework.stereotype.Service;

/**
 * (TUser)表服务实现类
 *
 * @author makejava
 * @since 2023-07-09 17:38:11
 */
@Service("tUserService")
public class TUserServiceImpl extends ServiceImpl<TUserDao, TUser> implements TUserService {

}

