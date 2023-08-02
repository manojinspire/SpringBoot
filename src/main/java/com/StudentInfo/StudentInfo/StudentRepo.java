package com.StudentInfo.StudentInfo;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentRepo {


    public static StudentRepo studentRepo ;



    public List<Student> students ;

    private StudentRepo(){

        students = new ArrayList<>() ;
    }

    public static StudentRepo getStudentRepo(){

        if(studentRepo == null) {


            synchronized (StudentRepo.class){

                if(studentRepo == null){
                    studentRepo = new StudentRepo();
                }
            }
        }
        return studentRepo ;
    }

    public List<Student> getStudents() {
        return students;
    }


}
