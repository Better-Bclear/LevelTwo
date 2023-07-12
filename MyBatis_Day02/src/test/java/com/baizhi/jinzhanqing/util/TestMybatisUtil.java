package com.baizhi.jinzhanqing.util;

import org.junit.Test;

public class TestMybatisUtil {
    @Test
    public void testConnection(){
        System.out.println(MyBatisUtil.getSession().getConnection());
    }
}
