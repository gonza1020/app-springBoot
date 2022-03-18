package com.springboot.app.web;


import com.springboot.app.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

@RestController
public class StudentController {

    // get http request

    @GetMapping("/student")
    public Student getStudent(){
        return  new Student("Gonzalo", "Zoloaga");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student>  students = new ArrayList<>();

        students.add(new Student("Fernando","Zoloaga"));
        students.add(new Student("Franco","Zoloaga"));
        students.add(new Student("Luciana","Zoloaga"));
        students.add(new Student("Valentina","Zoloaga"));
        students.add(new Student("Neida","Ojeda"));
        students.add(new Student("Nando","Zoloaga"));

        return students;
    }

}
