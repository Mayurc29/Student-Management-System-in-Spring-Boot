	package com.studentmanagementsystem.sms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.studentmanagementsystem.sms.entity.Student;
import com.studentmanagementsystem.sms.repository.StudentRepository;

@SpringBootTest
class SMSRepoTest {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	void isStudentExitById()
	{
		//added student data
		Student student =  new Student("Mayur","Chaudhari","Mayur@gmail.com");
		
		studentRepository.save(student);
		// Tested that student data is available in repo
		Boolean actualResult = studentRepository.existsById(student.getId());
		assertThat(actualResult).isTrue();
		
		//Boolean actualResult = studentRepository.existsById((long)8);
		//assertThat(actualResult).isTrue();
	}
}