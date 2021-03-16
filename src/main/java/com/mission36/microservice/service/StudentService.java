package com.mission36.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.mission36.microservice.dto.StudentCreateDTO;
import com.mission36.microservice.dto.StudentUpdateDTO;
import com.mission36.microservice.entity.Cource;
import com.mission36.microservice.entity.Student;
import com.mission36.microservice.repo.CourceRepo;
import com.mission36.microservice.repo.StudentRepositary;

@Service
public class StudentService {

	@Autowired
	StudentRepositary studentRepo;

	@Autowired
	CourceRepo courceRepo;

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

	public Long createStudent(StudentCreateDTO studentCreateDTO) {

		Student student = new Student();
		Cource cource = courceRepo.getCourceByCourceName(studentCreateDTO.getCourceName()).stream()
				.filter(p -> p.getCourceName().equals(studentCreateDTO.getCourceName())).findFirst()
				.orElse(new Cource());

		student.setId(new Long(1001));
		student.setName(studentCreateDTO.getName());
		student.setCource(cource);
		studentRepo.save(student);
		return student.getId();
	}

	public Long updateStudent(StudentUpdateDTO studentUpdateDTO) throws Exception {

		Student student = studentRepo.findById(studentUpdateDTO.getId()).orElse(new Student());

		if (student.getId().longValue() != studentUpdateDTO.getId().longValue()) {
			throw new Exception(" Student is not valid student object !!!");
		}
		
		Cource cource = courceRepo.getCourceByCourceName(studentUpdateDTO.getCourceName()).stream()
				.filter(p -> p.getCourceName().equals(studentUpdateDTO.getCourceName())).findFirst()
				.orElse(new Cource());
		
		student.setCource(cource);
		return student.getId();
	}

}
