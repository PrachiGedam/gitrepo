package com.BikkadIt.AutowiredAnnotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.BikkadIt.AutowiredAnnotation.Model.Student;
import com.BikkadIt.AutowiredAnnotation.service.StudentService;
@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	public StudentController() {
	System.out.println("Student class constructuor");
	}
	public Student saveStudControllerr(Student stu) {
		System.out.println(stu);
		
		//StudentService studentService = new StudentService();
		Student stu1 =studentService.saveStuService(stu);
		return stu1;
	}

}
