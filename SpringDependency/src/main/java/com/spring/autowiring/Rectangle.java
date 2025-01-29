package com.spring.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements IShape{

    @Override
    public void area(Double x, Double y) {
        System.out.println("Rect "+(x*y));
    }
}
