package com.studentmanagementsystem.sms.service;

import java.util.List;

import com.studentmanagementsystem.sms.entity.Student;

public interface StudentService {

	List<Student>getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	//Student getStudentByName(String name);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);

	
}
