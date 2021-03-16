package com.mission36.microservice.dto;

public class StudentUpdateDTO {

	private Long id;
	private String courceName;

	public StudentUpdateDTO() {
		super();
		this.id = null;
		this.courceName = null;
	}

	public StudentUpdateDTO(Long id, String courceName) {
		super();
		this.id = id;
		this.courceName = courceName;
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

	@Override
	public String toString() {
		return "StudentUpdateDTO [id=" + id + ", courceName=" + courceName + "]";
	}
	
	

}
