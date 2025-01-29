package com.spring.Constructor;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Car {
    public List<String> getAllBrands(){
        return List.of("Audi","Honda","Mahindra","Hyundai");
    }
}
