package com.scaler.academy.Entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {


    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Id
    int id ;
    @JsonProperty("name")
    String name ;



    @JsonProperty("leaderboardposition")
    int leaderboardposition ;
    public StudentEntity(String name){
        this.name  = name ;
    }





}
