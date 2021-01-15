package com.mission36.microservice.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cource_tbl")
public class Cource {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cource_name;

	@OneToMany(mappedBy = "cource")
	private Set<Student> student_registered;

	@OneToMany(mappedBy = "cource")
	private Set<Topic> topics;

	public Cource() {
		super();
		cource_name = "dummy";
	}

	public Long getId() {
		return id;
	}

	public String getCource_name() {
		return cource_name;
	}

	public Set<Student> getStudent_registered() {
		return student_registered;
	}

	public Set<Topic> getTopics() {
		return topics;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCource_name(String cource_name) {
		this.cource_name = cource_name;
	}

	public void setStudent_registered(Set<Student> student_registered) {
		this.student_registered = student_registered;
	}

	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}

}
