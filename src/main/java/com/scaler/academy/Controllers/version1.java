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
    public void addStudent(@RequestBody Student std){
        System.out.println("controller" + std.getName());
        StudentService.addStudent(std) ;
    }

    @PostMapping("/batch")
    public void addBatch(@RequestBody  Batch batch){
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

    @GetMapping("/Student/{id}")

    public Student getStudent(   @PathVariable  int id){
        return StudentService.getStudent(id) ;
    }


    @GetMapping("/batch/{id}")
    public Student getBatch(@PathVariable  int id){
        return BatchService.getBatch(id) ;
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
