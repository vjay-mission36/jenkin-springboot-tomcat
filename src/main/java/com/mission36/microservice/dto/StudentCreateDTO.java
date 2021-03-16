package com.mission36.microservice.dto;

public class StudentCreateDTO {

	private String name;
	private String courceName;

	public StudentCreateDTO() {
		super();

		this.name = null;
		this.courceName = null;
	}

	public StudentCreateDTO(String name, String courceName) {
		super();
		this.name = name;
		this.courceName = courceName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourceName() {
		return courceName;
	}

	public void setCourceName(String courceName) {
		this.courceName = courceName;
	}

	@Override
	public String toString() {
		return "StudentCreateDTO [name=" + name + ", courceName=" + courceName + "]";
	}

}
