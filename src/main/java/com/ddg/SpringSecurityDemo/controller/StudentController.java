package com.ddg.SpringSecurityDemo.controller;


import com.ddg.SpringSecurityDemo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {
    List<Student> students = new ArrayList<>(Arrays.asList(

            new Student(1, "John", "Doe"),
            new Student(2, "Jane", "Doe"),
            new Student(3, "John", "Smith"),
            new Student(4, "Jane", "Smith")
    ));

    @GetMapping("students")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("student")
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

}
