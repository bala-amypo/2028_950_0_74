package com.example.demo.controller;

@RestController
public class Studentcontroller{
     @Autowired
     Servicecontroller ser;
     public Student getAdd(Student var){
        return ser.saveDate(var);
     }
     /* public List<Student>  */

}