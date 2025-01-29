package com.example.SpringDependency;
import com.spring.Constructor.Showroom;
import com.spring.Constructor.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.SpringDependency","com.spring.Constructor");
        Employee employee = context.getBean(Employee.class);

//        Employee employee = new Employee();
//        employee.setEmpId(22);
//        employee.setEmpName("Vamsi");
//        //create address object
//        Address address = new Address();
//        address.setCity("Vijayawada");
//        address.setState("AP");
//        //set address to employee
//        employee.setAddress(address);

        //call the method
        //employee.printDetails();
        //StudentDetails details = context.getBean(StudentDetails.class);
        //details.showCourses("backend").forEach(System.out::println);
        //System.out.println();
//        Vehicle vehicle = context.getBean(Vehicle.class);
//        vehicle.showInsurance();

        Showroom showroom = context.getBean(Showroom.class);
        showroom.showBrands().forEach(System.out::println);


    }
}