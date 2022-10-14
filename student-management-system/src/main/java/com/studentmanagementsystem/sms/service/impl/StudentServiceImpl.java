package com.studentmanagementsystem.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagementsystem.sms.entity.Student;
import com.studentmanagementsystem.sms.repository.StudentRepository;
import com.studentmanagementsystem.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{
    
	@Autowired
	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl() {
		super();

	}


	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() 
	{
		//System.out.println(studentRepository.findAll().get(2));
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudentById(Long id)
	{		
		studentRepository.deleteById(id);
	}
	
}
