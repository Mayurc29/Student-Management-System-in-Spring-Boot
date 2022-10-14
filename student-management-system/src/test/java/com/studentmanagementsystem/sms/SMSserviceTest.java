package com.studentmanagementsystem.sms;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;

import com.studentmanagementsystem.sms.repository.StudentRepository;
import com.studentmanagementsystem.sms.service.StudentService;
import com.studentmanagementsystem.sms.service.impl.StudentServiceImpl;

//Unit testing on service layer with Mockito

@ExtendWith(MockitoExtension.class)
class SMSserviceTest {

	@Mock
	private StudentRepository studentRepository;
	
	//@Autowired
	private StudentService studentService;
	
	
	
	@BeforeEach
	void setUp()
	{
		this.studentService =new StudentServiceImpl(this.studentRepository);
	}
	
	@Test
	void getAllStudent()
	{
		studentService.getAllStudents();
		
		verify(studentRepository).findAll();
	}
	
	
	

}
