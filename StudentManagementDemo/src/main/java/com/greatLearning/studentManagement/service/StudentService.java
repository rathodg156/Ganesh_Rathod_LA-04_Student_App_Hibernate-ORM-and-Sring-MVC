package com.greatLearning.studentManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatLearning.studentManagement.entity.Student;
@Service
public interface StudentService {
	
    public List<Student> findAll();
		
	public Student findById(int id); // Read operation
	
	public void save(Student student); // save or update
	
	public void deleteById(int id);  // delete operation

}
