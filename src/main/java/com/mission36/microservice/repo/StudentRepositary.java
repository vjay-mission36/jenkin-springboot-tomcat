package com.mission36.microservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mission36.microservice.entity.Student;

@Repository
public interface StudentRepositary extends JpaRepository<Student, Long> {
	
	
	@Query(nativeQuery = true, value="SELECT ID, STUDENT_NAME, STUDENT_JPA from STUDENT_TBL where lower(student_name) like (%:sname%)")
	List<Student> retriveByName(String sname);
	
	

}
