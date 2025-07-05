package com.example.springdi;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    public String getStudentName() {
        return "🎓 Veena - Spring Learner";
    }
}
