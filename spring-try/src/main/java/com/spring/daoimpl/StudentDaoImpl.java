package com.spring.daoimpl;

import com.spring.aspectannotation.SayHello;
import com.spring.dao.StudentDao;
import com.spring.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
@Repository
public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> getAll() {
        Student student = new Student();
        student.setNumber("AP88282828");
        student.setName("Ali");
        student.setLastName("Veli");
        student.setDepartment("Computer Engineering");
        student.setAge(21);

        Student student2 = new Student();
        student2.setNumber("AP99188111");
        student2.setName("Ayşe");
        student2.setLastName("Fatma");
        student2.setDepartment("Computer Engineering");
        student2.setAge(23);

        return Arrays.asList(student, student2);
    }
}
