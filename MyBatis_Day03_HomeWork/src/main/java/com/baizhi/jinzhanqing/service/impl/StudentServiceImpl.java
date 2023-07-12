package com.baizhi.jinzhanqing.service.impl;

import com.baizhi.jinzhanqing.dao.StudentDao;
import com.baizhi.jinzhanqing.entity.Student;
import com.baizhi.jinzhanqing.service.StudentService;
import com.baizhi.jinzhanqing.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * (StudentCourse)表服务实现类
 *
 * @author makejava
 * @since 2023-07-11 17:37:22
 */
public class StudentServiceImpl implements StudentService {
    private final SqlSession session = MyBatisUtil.getSession();
    private final StudentDao studentDao = session.getMapper(StudentDao.class);
    @Override
    public List<Student> queryAll() {
        return studentDao.queryAll();
    }

    @Override
    public void deleteRelation(int id) {
        try {
            studentDao.deleteRelation(id);
            studentDao.deleteStudent(id);
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

