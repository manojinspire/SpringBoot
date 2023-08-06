package com.StudentInfo.StudentInfo;

import org.springframework.stereotype.Service;


public interface ServiceInterface {

    public void addStudent(Student student) ;

    public Student  getStudentbyId(int id) throws Exception ;

    public void changeSection(int id , String sec) throws Exception;
    public void deleteStudent(int id) ;

}
