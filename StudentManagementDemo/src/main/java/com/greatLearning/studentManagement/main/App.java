package com.greatLearning.studentManagement.main;


import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.greatLearning.studentManagement.entity.Student;
import com.greatLearning.studentManagement.service.StudentService;
import com.greatLearning.studentManagement.service.StudentServiceImpl;

public class App {

	public static void main(String[] args) {
		
		// create Session factory Object
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// create StudentServiceImp object and pass it to session factory
		StudentService studentService = new StudentServiceImpl(sessionFactory);
		
		List<Student> students = studentService.findAll();
		
		for(Student student:students) {
		System.out.println(student);
		
		}
	}
}