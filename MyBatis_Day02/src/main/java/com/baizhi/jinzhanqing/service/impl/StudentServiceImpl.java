package com.baizhi.jinzhanqing.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baizhi.jinzhanqing.dao.StudentDao;
import com.baizhi.jinzhanqing.entity.Student;
import com.baizhi.jinzhanqing.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2023-07-11 17:37:22
 */
@Service("studentService")
public class StudentServiceImpl extends ServiceImpl<StudentDao, Student> implements StudentService {

}

