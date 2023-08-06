package com.scaler.academy.Controllers;


import com.scaler.academy.Models.Batch;
import com.scaler.academy.Models.Student;


import com.scaler.academy.Service.BatchService;
import com.scaler.academy.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class version1 {




    @Autowired
    StudentService StudentService ;

    @Autowired
    BatchService BatchService ;

    @PostMapping("/Student")
    public void addStudent(Student std){
        StudentService.addStudent(std) ;
    }

    @PostMapping("/batch")
    public void addBatch(Batch batch){
        BatchService.addBatch(batch) ;
    }


    @PutMapping("/Student")
    public void updateStudent(Student std){
        StudentService.updateStudent(std) ;
    }


    @PutMapping("/batch")
    public void updateBatch(Batch batch){
        BatchService.updateBatch(batch) ;
    }

    @GetMapping("/Student")
    public void getStudent(int id){
        StudentService.getStudent(id) ;
    }


    @GetMapping("/batch")
    public void getBatch(int id){
        BatchService.getBatch(id) ;
    }

    @DeleteMapping("/Student")
    public void deleteStudent(int id){
        StudentService.deleteStudent(id) ;
    }


    @DeleteMapping("/batch")
    public void deleteBatch(int id){
        BatchService.deleteBatch(id);
    }
}
