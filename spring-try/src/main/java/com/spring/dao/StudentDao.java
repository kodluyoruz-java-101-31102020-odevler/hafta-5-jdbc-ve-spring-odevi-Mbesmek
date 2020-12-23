package com.spring.dao;

import com.spring.entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentDao {

    public List<Student> getAll();
}
