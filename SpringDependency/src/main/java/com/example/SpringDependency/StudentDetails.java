package com.example.SpringDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentDetails {
    private String studentName;

    @Autowired
    private Course course;

    public String getStudentName() {
        return studentName;
    }
    @Value("${student.studentName}")
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public List<String> showCourses(String type){
        System.out.println("showing courses for "+ type);
        return course.getAll(type);
    }
}