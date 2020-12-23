package com.spring.app;

import com.spring.entity.Student;
import com.spring.service.StudentService;
import com.spring.serviceimpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConsoleRunner implements CommandLineRunner {

    @Autowired
    private StudentServiceImpl studentService;


    @Override
    public void run(String... args) throws Exception {
        List<Student> studentList = studentService.getAll();

        for(Student student : studentList) {
            System.out.println(student);
        }
    }
}
