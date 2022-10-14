package com.studentmanagementsystem.sms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.studentmanagementsystem.sms.entity.Student;
import com.studentmanagementsystem.sms.repository.StudentRepository;
import com.studentmanagementsystem.sms.service.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentControllerTest 
{
	@Autowired
	private StudentService studentService;
	
	@MockBean
	private StudentRepository studentRepository;
	
	@Test
	void getAllStudentsTest()
	{
		when(studentRepository.findAll()).thenReturn(Stream.of(new Student("Mayur", "Chaudhari","mayur@gmail.com")).collect(Collectors.toList()));
		assertEquals(1,studentService.getAllStudents().size());
	}
	
//	@Test
//	void getStudentByIdTest()
//	{
//		Long studentID = 8l;
//		when(studentRepository.findById(studentID)).thenReturn(Stream.of(new Student("Mayur", "Chaudhari","mayur@gmail.com")).collect(Collectors.toList()));
//		assertEquals(1,studentService.getStudentById(studentID));
//	}
	
	@Test
	public void saveStudentTest()
	{
		Student student1 = new Student("Aditya","Patil","aditya@gmail.com");
		
		when(studentRepository.save(student1)).thenReturn(student1);
		assertEquals(student1,studentService.saveStudent(student1));
	}
	
//	public void deleteStudentTest()
//	{
//		Student student1 = new Student("Aditya","Patil","aditya@gmail.com");
//		studentService.deleteStudentById(3l);
//		verify(studentRepository,studentService.deleteStudentById(3l));
//	}
	

}
