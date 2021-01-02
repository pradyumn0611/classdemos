package com.yash.springpracticaldemo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
/**
 * Default id for this will be Component("employee") by default just the first letter small.
 * 
 * Its non qualified and de capitalized.
 * 
 * primary if there is any ambiguity we can use this.When 2 classes are implementing same thing.
 * @author pradyumn
 *
 */
@Component   

public class Employee  {
	
	
	@Autowired
	private Project project;
	
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
 
	int id;
	String name;
	String Designation;
	public Employee(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		Designation = designation;
	}
	public Employee() {
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


	public String getDesignation() {
		return Designation;
	}


	public void setDesignation(String designation) {
		Designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Designation=" + Designation  + "]";
	}
	
	
	
}
