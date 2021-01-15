package com.mission36.microservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Topic_tbl")
public class Topic {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String topic_name;
	private Double grades;
	
	
	@ManyToOne
	@JoinColumn(name = "cource_id", nullable = false)
	private Cource cource;

	public Topic() {
	}

	public Topic(Long id, String topic_name, Double grades) {
		super();
		this.id = id;
		this.topic_name = topic_name;
		this.grades = grades;
	}

	public Long getId() {
		return id;
	}

	public String getTopic_name() {
		return topic_name;
	}

	public Double getGrades() {
		return grades;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTopic_name(String topic_name) {
		this.topic_name = topic_name;
	}

	public void setGrades(Double grades) {
		this.grades = grades;
	}
	
	
}
