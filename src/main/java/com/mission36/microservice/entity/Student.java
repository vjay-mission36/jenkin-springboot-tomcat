package com.mission36.microservice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_tbl")
public class Student {

	@Id
	private Long id;

	@Column(name = "student_name")
	private String name;

	@Column(name = "student_jpa")
	private Double jpa;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cource_id")
	private Cource cource;

	public Student() {
	}

	public Student(Long id, String name, Double jpa) {
		super();
		this.id = id;
		this.name = name;
		this.jpa = jpa;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getJpa() {
		return jpa;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setJpa(Double jpa) {
		this.jpa = jpa;
	}

	public Cource getCource() {
		return cource;
	}

	public void setCource(Cource cource) {
		this.cource = cource;
	}

}
