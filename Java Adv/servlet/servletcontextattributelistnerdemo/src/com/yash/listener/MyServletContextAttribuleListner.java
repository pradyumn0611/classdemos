package com.yash.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextAttribuleListner implements ServletContextAttributeListener {

   
    public void attributeAdded(ServletContextAttributeEvent arg0)  {
    	System.out.println("\n attribute add method is called in"+this.getClass().getName());
    	
    	System.out.println(" newly added attribute name:"+arg0.getName()+"\n value ="+arg0.getValue());
         
    }

	
    public void attributeRemoved(ServletContextAttributeEvent arg0)  { 
    	System.out.println("\n attribute remove method is called in"+this.getClass().getName());
    	System.out.println(" Removed attribute name:"+arg0.getName()); 
    }

	
    public void attributeReplaced(ServletContextAttributeEvent arg0)  { 
    	System.out.println("\n attribute replace method is called in"+this.getClass().getName());
    	System.out.println(" replaced attribute name:"+arg0.getName()+"\n value ="+arg0.getValue()); 
    }
	
}
