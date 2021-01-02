package com.yash.springconstructordi;
/**
 * Employee Information is stored here.
 * @author pradyumn
 *
 */
public class Employee {
	/**
	 * Unique id of the employee
	 */
	int id;
	/**
	 * Name of the Employee.
	 */
	String name;
	/**
	 * Salary of the Employee.
	 */
	int salary;
	/**
	 * parametarised constructor for getting values.
	 * @param id
	 * @param name
	 * @param salary
	 */
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	/**
	 * Default Constructor.
	 */
	public Employee() {
		super();
	}
/**
 * Getters and Setters of above fields.
 */
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
/**
 * To string method to display as string in other classes.
 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

