package com.yash.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HttpSessionTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	public void init() throws ServletException
	   {
		   System.out.println("\n init method is called in"+this.getClass().getName());
	   }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");	
	sleep();
	HttpSession httpSession =request.getSession();
	sleep();
	httpSession.invalidate();
	}
	private void sleep() {

		try
		{
			Thread.sleep(10000);//in milisec
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}



}
