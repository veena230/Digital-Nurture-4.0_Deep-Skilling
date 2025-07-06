package com.example.jpa_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        studentRepository.save(new Student(1, "Veena", 90));
        studentRepository.save(new Student(2, "Suba", 85));
        studentRepository.save(new Student(3, "Siva", 80));
        System.out.println("Data inserted successfully.");
    }
}
