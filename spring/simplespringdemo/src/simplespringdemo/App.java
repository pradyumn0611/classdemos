package simplespringdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Message message=(Message)context.getBean("message");
		System.out.println(message.show());
		

	}

}
