package com.example.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIApp {
public static void main(String[] args) {
ApplicationContext context = new AnnotationConfigApplicationContext(DIConfig.class);
StudentService studentService = context.getBean(StudentService.class);
studentService.printStudent();
}
}
