package com.mission36.microservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mission36.microservice.entity.Topic;
import com.mission36.microservice.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	
	
	public List<Topic> getAllTopic(){
		return new ArrayList<Topic>();
	}

}
