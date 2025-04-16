package com.BikkadIt.AutowiredAnnotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIt.AutowiredAnnotation.Model.Student;
import com.BikkadIt.AutowiredAnnotation.dao.StudentDao;
@Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;
	
	public StudentService() {
		super();
		System.out.println("studentService constructore");
	}

	public Student saveStuService(Student stu) {
		System.out.println(stu);
		//StudentDao studentDao= new StudentDao();
		Student stu1 =studentDao.saveStuDao(stu);//returning data from dao to service
		
		return stu1;
	}

}
