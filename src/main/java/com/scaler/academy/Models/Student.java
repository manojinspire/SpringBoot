package com.scaler.academy.Models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    int id ;
    String name ;

    Batch batch ;


    int leaderboardposition ;


}
