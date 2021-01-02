package com.yash.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class LitnerRequestAttribute
 *
 */
@WebListener
public class LitnerRequestAttribute implements ServletRequestAttributeListener {

	 public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
	    	System.out.println(" attributeRemoved called in "+this.getClass().getName());
	    	System.out.println(" attribute removed : "+arg0.getName()+" value "+arg0.getValue());
	       
	    }

		
	    public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
	    	System.out.println(" attributeAdded called in "+this.getClass().getName());
	    	System.out.println(" attribute added : "+arg0.getName()+" value "+arg0.getValue());
	    }

		
	    public void attributeReplaced(ServletRequestAttributeEvent arg0)  { 
	    	System.out.println(" attributeReplaced called in "+this.getClass().getName());
	    	System.out.println(" attribute replaced : "+arg0.getName()+" value "+arg0.getValue());
	    }
		
}
