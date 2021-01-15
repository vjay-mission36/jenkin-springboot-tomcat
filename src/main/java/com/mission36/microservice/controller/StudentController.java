package com.mission36.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mission36.microservice.entity.Cource;
import com.mission36.microservice.entity.Student;
import com.mission36.microservice.service.CourceService;
import com.mission36.microservice.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studService;

	@Autowired
	CourceService courceService;

	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable Long id) {
		return studService.finfById(id);
	}

	@GetMapping("/students/{s_name}")
	public List<Student> getStudentByName(@PathVariable String s_name) {
		return studService.getAllStudentByName(s_name);
	}

	@GetMapping("/students")
	public Cource registerASudentToCource() {
		
		Student student = new Student();
		student.setName("KevinSmith");
		student.setJpa(0.0);
		
		return courceService.registerAStudentCource(student, 910L);
	}

}
