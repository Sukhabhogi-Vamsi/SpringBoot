package com.example.vamsi.spring_boot_basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBasicsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicsApplication.class, args);
	}
//	@Autowired
//	ApplicationContext context;
	@Autowired
	private Student student;
	public void setStudent(Student student){
		this.student = student;
	}

	@Override
	public void run(String... args) throws Exception {
//		String[] beannames = context.getBeanDefinitionNames();
//		for (String bean :beannames){
//			System.out.println(bean);
//		}
//		Student student = context.getBean(Student.class);
		student.printDetails();
	}
}
