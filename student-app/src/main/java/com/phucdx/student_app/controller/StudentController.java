package com.phucdx.student_app.controller;

import com.phucdx.student_app.model.Student;
import com.phucdx.student_app.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepo repo;

    @GetMapping("students")
    public List<Student> getStudents() {
        return repo.findAll();
    }

    @RequestMapping("addStudents")
    public void addStudent() {
        Student student = new Student();
        student.setName("John Doe");
        student.setAge(30);

        repo.save(student);
    }
}
