package com.scaler.academy.Entities;


import com.scaler.academy.Models.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class BatchEntity {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id ;

    String batchname ;


    int totalStudents ;
    public BatchEntity(String batchname){
        this.batchname = batchname ;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "batch_id" , referencedColumnName = "id")
    List<StudentEntity> students = new ArrayList<>();




}
