package com.spring.serviceimpl;

import com.spring.aspectannotation.MethodRunningTime;
import com.spring.aspectannotation.SayHello;
import com.spring.dao.StudentDao;
import com.spring.entity.Student;
import com.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentHibernateDao;

    @Override
    @MethodRunningTime( active = true )
    @SayHello(active = true)
    public List<Student> getAll() {
        return studentHibernateDao.getAll();
    }
}
