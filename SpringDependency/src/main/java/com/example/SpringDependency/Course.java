package com.example.SpringDependency;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Course {
    public List<String> getAll(String type){
        if (type.equals("frontend")){
            return Arrays.asList("Html","CSS","React");
        }
        if (type.equals("backend")){
            return Arrays.asList("Java","spring","Microservices");
        }
        if (type.equals("database")){
            return Arrays.asList("MySql","MongoDB");
        }
        else{
            return Arrays.asList("No Courses Available");
        }
    }
}