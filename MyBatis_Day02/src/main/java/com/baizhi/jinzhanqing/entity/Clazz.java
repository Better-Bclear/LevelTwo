package com.baizhi.jinzhanqing.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Clazz)实体类
 *
 * @author makejava
 * @since 2023-07-07 17:06:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clazz implements Serializable {
    private static final long serialVersionUID = -81705890567689925L;
    
    private Integer id;
    
    private String name;
    
    private Integer studentId;
}

