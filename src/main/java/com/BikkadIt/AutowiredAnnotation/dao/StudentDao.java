   package com.BikkadIt.AutowiredAnnotation.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.BikkadIt.AutowiredAnnotation.Model.Student;

import jakarta.websocket.server.ServerEndpoint;

@Repository
public class StudentDao {

	public StudentDao() {
		super();
		System.out.println("StudentDao constructor");
	}

	public Student saveStuDao(Student stu) {
		System.out.println(stu);
		//logic to save ddata
		return stu;
	}
}
