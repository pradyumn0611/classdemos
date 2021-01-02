package com.yash.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListner implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent servletContextEvent )  { 
    	System.out.println("contextDestroyed method id called in"+this.getClass().getName());
    	ServletContext servletContext=servletContextEvent.getServletContext();
    	System.out.println(servletContext+" is distroyed ");
        
    }

	
    public void contextInitialized(ServletContextEvent servletContextEvent )  { 
    	System.out.println(" contextInitialized method id called in"+this.getClass().getName());
    	ServletContext servletContext=servletContextEvent.getServletContext();
    	System.out.println(servletContext+" is initialized or created");
        
         
    }
	
}
