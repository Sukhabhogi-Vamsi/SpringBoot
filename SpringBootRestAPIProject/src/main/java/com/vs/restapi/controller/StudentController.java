package com.vs.restapi.controller;
import java.util.*;

import com.vs.restapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.vs.restapi.entity.Student;

@RestController
public class StudentController {
    @Autowired
    StudentRepository repo;

    //get all the students
    //local:8080/students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> students = repo.findAll();
        return students;
    }
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id){
        Student student= repo.findById(id).get();
        return student;
    }

    @PostMapping("/student/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createStudent(@RequestBody Student student){
        repo.save(student);
    }

    @PutMapping("/student/update/{id}")
    public Student updateStudents(@PathVariable int id){
        Student student = repo.findById(id).get();
        student.setName("Vamsi");
        student.setPercentage(92);
        repo.save(student);
        return student;
    }

    @DeleteMapping("/student/delete/{id}")
    public void removeStudent(@PathVariable int id){
        Student student = repo.findById(id).get();
        repo.delete(student);
    }

}
