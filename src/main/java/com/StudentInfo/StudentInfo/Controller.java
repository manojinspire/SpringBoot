package com.StudentInfo.StudentInfo;


import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {
    private service service = com.StudentInfo.StudentInfo.service.getService() ;

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student) {
        service.addStudent(student) ;
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable int id   ) throws StudentnotPresentException{

        try {
            return service.getStudentbyId(id);
        }
        catch(Exception e){
            throw new StudentnotPresentException("no student available") ;
        }
    }

    @PutMapping("/changeSection/{id}/{sec}")
    public void changeSection(@PathVariable int id , @PathVariable String sec) throws StudentnotPresentException{

        try {
            service.changeSection(id, sec);
        }
        catch(Exception e ){
            throw new StudentnotPresentException("no student available") ;
        }
    }

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable int id) throws StudentnotPresentException{

        try{
            service.deleteStudent(id) ;
        }
        catch(Exception e){
            throw new StudentnotPresentException("no student available") ;
        }
    }








}
