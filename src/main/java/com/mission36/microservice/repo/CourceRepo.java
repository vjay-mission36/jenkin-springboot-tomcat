package com.mission36.microservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mission36.microservice.entity.Cource;

@Repository
public interface CourceRepo extends JpaRepository<Cource, Long>{
	
	// you might need to write couple of the methods 
	public List<Cource> getCourceByCourceName(String name);

}
