package com.yash.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MyHttpSessionListener implements HttpSessionListener {

    
    public void sessionCreated(HttpSessionEvent se)  { 
        System.out.println("session created method is called in "+se.getClass().getName());
        HttpSession session=se.getSession();
        
        System.out.println(session+" created");
        System.out.println(" session id = "+session.getId()+" session max in active interval= "+session.getMaxInactiveInterval());
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	  HttpSession session=se.getSession();
    	System.out.println(session+" destroyed");
    	System.out.println(" session id = "+session.getId()+" session max in active interval= "+session.getMaxInactiveInterval());
      
    }
	
}
