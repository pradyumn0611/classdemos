package com.yash.lifecycledemobeaninterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
		Restaurant restaurant=(Restaurant)context.getBean("restaurant");
		restaurant.customer();
		((AbstractApplicationContext)context).registerShutdownHook();
	}
}


