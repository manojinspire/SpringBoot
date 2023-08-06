package com.scaler.academy.Service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.scaler.academy.Entities.BatchEntity;
import com.scaler.academy.Entities.StudentEntity;
import com.scaler.academy.Models.Student;

import com.scaler.academy.Repository.StudentRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@NoArgsConstructor(force = true)

public class StudentService {

    @Autowired
    StudentRepo studentRepo ;
    private final ObjectMapper objectMapper = new ObjectMapper();
    public  void addStudent(Student std) {


        System.out.println("service" + std.getName())  ;
        StudentEntity studentEntity = objectMapper.convertValue(std, StudentEntity.class);

        studentRepo.save(studentEntity);
    }

    public  void updateStudent(Student std) {
    }

    public  Student getStudent(int id) {
        return null;
    }

    public  void deleteStudent(int id) {
    }
}
