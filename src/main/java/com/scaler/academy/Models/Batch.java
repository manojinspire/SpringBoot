package com.scaler.academy.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Batch {

    int id ;

    String batchname ;


    int totalStudents ;


    List<Student> students ;

}
