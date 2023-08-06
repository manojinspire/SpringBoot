package com.scaler.academy.Entities;


import com.scaler.academy.Models.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
public class BatchEntity {


    @GeneratedValue
    @Id
    int id ;

    String batchname ;


    int totalStudents ;

    @OneToMany
    List<StudentEntity> students;




}
