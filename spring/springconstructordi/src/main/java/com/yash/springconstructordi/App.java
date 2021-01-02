package com.yash.springconstructordi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Execution of App begins from here.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("Employee.xml");
    	Employee employee=(Employee)context.getBean("employee");
    	System.out.println(employee.toString());
    }
}
