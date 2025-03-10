package com.example.vamsi.spring_boot_basics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String studentName;
    private int studentId;

    public int getStudentId() {
        return studentId;
    }

    @Value("${student.studentId}")
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    @Value("${student.studentName}")
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void printDetails(){
        System.out.println("Name : "+studentName);
        System.out.println("Id : "+studentId);
    }
}
