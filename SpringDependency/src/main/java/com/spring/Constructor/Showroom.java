package com.spring.Constructor;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Showroom {
    private Car car;

    public Showroom(Car car){
        super();
        this.car = car;
    }

    public List<String> showBrands(){
        return car.getAllBrands();
    }

}
