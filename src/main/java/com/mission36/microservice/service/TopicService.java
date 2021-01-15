package com.mission36.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mission36.microservice.repo.TopicRepo;

@Service
public class TopicService {

	@Autowired
	TopicRepo topicRepo;

}
