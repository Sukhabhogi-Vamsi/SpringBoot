package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {

    //autowiring by type
//    @Autowired
//    @Qualifier("rectangle")
    private IShape shape;

    @Autowired
    private IShape square;  //square = new square();//autowiring by name i.e., names should same

    private IShape nshape;   //nshape = new Rectangle();
    public ShapeFactory( @Qualifier("rectangle") IShape nshape){
        super();
        this.nshape = nshape;
    }
    
    @Autowired
    public void setShape( @Qualifier("triangle") IShape shape) {
        this.shape = shape;

    }

    public void printArea(double x, double y){
        shape.area(x,y);
        square.area(x,y);
        nshape.area(x,y);
    }
}
