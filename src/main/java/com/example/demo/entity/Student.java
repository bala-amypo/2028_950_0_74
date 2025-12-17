package com.example.demo.entity;

@Entity

public class Student{
    @id
    @Genera
    private int id;
    private String name;
    private String email;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getName(){
        return name;
    }
    public void setName(){
       this.name=name;   
    }
    public int getEmail(){
        return email;
    }
    public void setEmail(){
        this.email=email;
    }
    public Student(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
}