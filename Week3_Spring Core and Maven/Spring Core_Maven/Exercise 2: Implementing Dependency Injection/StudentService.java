package com.example.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

@Autowired
private StudentRepository studentRepository;

public void printStudent() {
    System.out.println(studentRepository.getStudentName());
}
}
