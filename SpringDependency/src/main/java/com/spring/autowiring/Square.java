package com.spring.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Square implements IShape{
    @Override
    public void area(Double x, Double y) {
        System.out.println("Sq "+(x*x));
    }
}
