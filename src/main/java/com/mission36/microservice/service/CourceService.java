package com.mission36.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mission36.microservice.entity.Cource;
import com.mission36.microservice.entity.Student;
import com.mission36.microservice.repo.CourceRepo;
import com.mission36.microservice.repo.StudentRepositary;

@Service
public class CourceService {

	@Autowired
	CourceRepo courceRep;

	@Autowired
	StudentService sudentService;

	public Cource registerAStudentCource(Student student, Long cource_id) {
		// TODO Auto-generated method stub

		Cource cource = null;

		if (cource_id != null) {
			cource = courceRep.findById(cource_id).orElse(new Cource());
			student.setCource(cource);
			student = sudentService.registerStudent(student);
		}
		return null;
	}

}
