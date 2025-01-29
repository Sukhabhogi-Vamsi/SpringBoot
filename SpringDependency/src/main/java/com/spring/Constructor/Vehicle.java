package com.spring.Constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String brand;
    private String model;
    private Insurance insurance;

    @Value("${vehicle.brand}")
    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Value("${vehicle.model}")
    public void setModel(String model) {
        this.model = model;
    }

    //no need of Autowired
    public Vehicle(Insurance insurance){
        super();
        this.insurance = insurance;
    }
    public void showInsurance(){
        System.out.println("printing Insurance for vehicle");
        System.out.println(insurance.getType());
    }
}
