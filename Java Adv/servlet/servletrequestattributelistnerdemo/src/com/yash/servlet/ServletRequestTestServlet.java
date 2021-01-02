package com.yash.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletRequestTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void init() throws ServletException
	{
		System.out.println("init method is called in "+this.getClass().getName());
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		sleep();
		request.setAttribute("companyname", "google");
		sleep();
		request.setAttribute("companyname", "facebook");
		sleep();
		request.removeAttribute("companyname");
	}
	private void sleep()
	{
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{e.printStackTrace();}
	}

	public void destroy()
	{
		System.out.println("destroy method is called in "+this.getClass().getName());
	}
}
