package com.mission36.microservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mission36.microservice.entity.Topic;

@Repository
public interface TopicRepo extends JpaRepository<Topic, Long> {

}
