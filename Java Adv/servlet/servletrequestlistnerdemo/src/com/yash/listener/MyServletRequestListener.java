package com.yash.listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyServletRequestListener
 *
 */
@WebListener
public class MyServletRequestListener implements ServletRequestListener {
	public static int count=0;
    public void requestDestroyed(ServletRequestEvent arg0)  { 
        count++;
        System.out.println("request initialized method is called in "+this.getClass().getName());
        
        ServletRequest servletRequest=arg0.getServletRequest();
        System.out.println(servletRequest+" is created or Initialized:");
    }

	
    public void requestInitialized(ServletRequestEvent arg0)  { 
    	System.out.println(" request method is destroyed is called in "+this.getClass().getName());
    	ServletRequest servletRequest=arg0.getServletRequest();
        System.out.println(servletRequest+" is destroyed");
        
    }
	
}
