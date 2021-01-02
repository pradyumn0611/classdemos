package com.yash.listner;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;



public class CountUserListner implements HttpSessionListener{

	ServletContext ctx=null;
	static int totalUserCount=0,currentUserCount=0;	
    
    public void sessionCreated(HttpSessionEvent httpSessionEvent)  { 
    	System.out.println("sessionCreated method has been called in"+this.getClass().getName());
    	totalUserCount++;
    	currentUserCount++;
    	
    	ctx=httpSessionEvent.getSession().getServletContext();
    	ctx.setAttribute("totalusers", totalUserCount);
    	ctx.setAttribute("currentusers", totalUserCount);
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent)  { 
    	System.out.println("session destroy is called in"+this.getClass().getName());
    	currentUserCount--;
    	ctx.setAttribute("currentusers",currentUserCount) ;
    }



	
	
}
