package com.example.jpa_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDemoApplication {

public static void main(String[] args) {
    SpringApplication.run(JpaDemoApplication.class, args);
}

@Bean
public CommandLineRunner dataLoader(StudentRepository repo) {
    return args -> {
        repo.save(new Student("Veena", "veena@example.com"));
        repo.save(new Student("Suba", "suba@example.com"));
        repo.save(new Student("Siva", "siva@example.com"));
    };
}
}
