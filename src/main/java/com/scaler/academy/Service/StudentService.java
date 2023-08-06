package com.scaler.academy.Service;

import com.scaler.academy.Models.Student;
import com.scaler.academy.Repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepo studentRepo ;
    public static void addStudent(Student std) {
    }

    public static void updateStudent(Student std) {
    }

    public static void getStudent(int id) {
    }

    public static void deleteStudent(int id) {
    }
}
