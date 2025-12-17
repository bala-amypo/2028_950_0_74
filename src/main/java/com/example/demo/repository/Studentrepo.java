// package com.example.demo.repository;
// import org.springframework.web.bind.annotation.*;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.repository;

// @Repository
// public interface Studentrepo extends JpaRepository<Student,Integer>{

// }
package com.example.sql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sql.Entitydata.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    
}