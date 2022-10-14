package com.studentmanagementsystem.sms;

//import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.studentmanagementsystem.sms.repository.StudentRepository;
import com.studentmanagementsystem.sms.service.StudentService;
import com.studentmanagementsystem.sms.service.impl.StudentServiceImpl;

@ExtendWith(MockitoExtension.class)

class GetStudentByIdTest {

	
	//@Mock
	private StudentRepository studentRepository;
	
	//@Autowired
	private StudentService studentService;
	
	
	
	@BeforeEach
	void setUp()
	{
		this.studentService =new StudentServiceImpl(this.studentRepository);
	}
	
	
	@Test
	void getStudentById()
	{
		studentService.getStudentById((long)17 );
		
		verify(studentRepository).findById((long) 17).get();
	}

}
