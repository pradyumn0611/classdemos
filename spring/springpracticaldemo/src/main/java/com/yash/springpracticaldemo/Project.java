package com.yash.springpracticaldemo;

import org.springframework.stereotype.Component;

@Component
public class Project  {

	int id;
	String name;
	
	public Project() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
	

}
