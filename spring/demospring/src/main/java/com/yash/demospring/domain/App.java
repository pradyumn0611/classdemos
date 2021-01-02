package com.yash.demospring.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
Message message=(Message)context.getBean("Message1");
String m=message.show();
System.out.println(m);

	}

}
