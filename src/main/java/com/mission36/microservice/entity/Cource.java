package com.mission36.microservice.entity;

import java.util.Set;

import javax.persistence.Column;
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
	
	@Column(name = "courcename")
	private String  courceName;

	@OneToMany(mappedBy = "cource")
	private Set<Student> student_registered;

	@OneToMany(mappedBy = "cource")
	private Set<Topic> topics;

	public Cource() {
		super();
		courceName = "dummy";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourceName() {
		return courceName;
	}

	public void setCourceName(String courceName) {
		this.courceName = courceName;
	}

	public Set<Student> getStudent_registered() {
		return student_registered;
	}

	public void setStudent_registered(Set<Student> student_registered) {
		this.student_registered = student_registered;
	}

	public Set<Topic> getTopics() {
		return topics;
	}

	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}

	@Override
	public String toString() {
		return "Cource [id=" + id + ", courceName=" + courceName + ", student_registered=" + student_registered
				+ ", topics=" + topics + "]";
	}



}
