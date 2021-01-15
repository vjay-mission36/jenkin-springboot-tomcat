package com.mission36.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mission36.microservice.entity.Student;
import com.mission36.microservice.repo.StudentRepositary;

@Service
public class StudentService {

	@Autowired
	StudentRepositary studentRepo;

	public Student finfById(Long id) {
		return studentRepo.findById(id).get();
	}

	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

	public List<Student> getAllStudentByName(String s_name) {
		return studentRepo.retriveByName(s_name);
	}

	public Student registerStudent(Student student) {
		return studentRepo.save(student);
	}

}
