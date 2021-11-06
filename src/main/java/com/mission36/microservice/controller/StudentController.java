package com.mission36.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mission36.microservice.dto.StudentCreateDTO;
import com.mission36.microservice.dto.StudentUpdateDTO;
import com.mission36.microservice.entity.Cource;
import com.mission36.microservice.entity.Student;
import com.mission36.microservice.service.CourceService;
import com.mission36.microservice.service.StudentService;

/*
  sample comment checkin from intellij
 */

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

	@GetMapping("/allstudents")
	public List<Student> getAllStudents() {
		return studService.getAllStudent();
	}

	@GetMapping("/students")
	public Cource registerASudentToCource() {

		Student student = new Student();
		student.setName("KevinSmith");
		student.setJpa(0.0);

		return courceService.registerAStudentCource(student, 910L);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Long> createStudent(@RequestBody StudentCreateDTO studentCrateDTO) {
		return new ResponseEntity<Long>(studService.createStudent(studentCrateDTO), HttpStatus.CREATED);

	}
	
	
	@PostMapping("/updatestudent")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public ResponseEntity<Long> updateStudent(@RequestBody StudentUpdateDTO studentUpdateDTO) throws Exception{
		return new ResponseEntity<Long>(studService.updateStudent(studentUpdateDTO), HttpStatus.ACCEPTED);
	}

}
