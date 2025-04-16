package com.BikkadIt.AutowiredAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIt.AutowiredAnnotation.Model.Student;
import com.BikkadIt.AutowiredAnnotation.controller.StudentController;

@SpringBootApplication
public class AutowiredAnnotationApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(AutowiredAnnotationApplication.class, args);
	StudentController  studentController = context.getBean(StudentController.class); //important
		
		Student stu = new Student();
		stu.setSid(1);
		stu.setSname("prachi");
		stu.setSaddr("pune");
		
		//StudentController studentController = new StudentController();
		Student stu1= studentController.saveStudControllerr(stu);
		System.out.println(stu1);
		
	}

}
