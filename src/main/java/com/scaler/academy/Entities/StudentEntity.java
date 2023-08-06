package com.scaler.academy.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class StudentEntity {


    @GeneratedValue
    @Id
    int id ;
    String name ;
    int leaderboardposition ;


    @ManyToOne
    BatchEntity batch ;

}
