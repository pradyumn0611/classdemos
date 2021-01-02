package com.yash.springpracticaldemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * annotation component auto wired primary qualifier
 * @author pradyumn
 *
 */
public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(com.yash.springpracticaldemo.Config.class);
		Employee employee=context.getBean(com.yash.springpracticaldemo.Employee.class);
		employee.setId(1);
		employee.setName("pradyumn");
		employee.setDesignation("Full Stack Developer");
		System.out.println(employee.toString());
		
		Project project=employee.getProject();
		project.setId(33);
		project.setName("nutrition app");
		System.out.println(project.toString());
		
		
		//collection
		List<Employee> list=new ArrayList<>();
		for(int i=0;i<10;i++)
		{
		employee.setId(2);
		employee.setName("Mahendra Singh Dhoni");
		employee.setDesignation("Cricketer");
		
		list.add(employee);
		}
		System.out.println(list);
		
		//System.out.println(employee1.getEmployeeList());
		
		
	}

}
