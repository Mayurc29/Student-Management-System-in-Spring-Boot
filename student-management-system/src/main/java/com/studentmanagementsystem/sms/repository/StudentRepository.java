package com.studentmanagementsystem.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentmanagementsystem.sms.entity.Student;

//@Respository annotation is already added in JpaRespository declaration
//Here Student is Entity class name and Long is data type of Primary key
public interface StudentRepository extends JpaRepository<Student, Long>{

	
}
