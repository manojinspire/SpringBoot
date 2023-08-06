package com.StudentInfo.StudentInfo;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class service implements ServiceInterface {


    private  StudentRepo studentRepo = StudentRepo.getStudentRepo() ;
    public static service service ;
    private service(){

    }

    public static service getService(){


        if(service == null){

            synchronized(service.class){
                if(service == null) {

                    service  =new service() ;
                }
            }

        }
        return service ;

    }
    public void addStudent(Student student) {

        studentRepo.getStudents().add(student) ;
    }

    public Student getStudentbyId(int id) throws Exception {


         return studentRepo.getStudents().stream().filter((Student s) -> s.id == id).findFirst().orElseThrow(() -> new Exception()) ;

    }

    public void changeSection(int id , String sec) throws Exception {


        Student st = studentRepo.getStudents().stream().filter((Student s) -> s.id==id).findFirst().orElseThrow(() -> new Exception()) ;
        st.setSection(sec);

    }

    public void deleteStudent(int id){

            List<Student> newRepo = studentRepo.getStudents().stream().filter((Student s) -> s.id != id).collect(Collectors.toList());

            studentRepo.students = newRepo ;
    }
}
