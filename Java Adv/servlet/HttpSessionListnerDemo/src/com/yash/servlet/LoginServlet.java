package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   public void init() throws ServletException
   {
	   System.out.println("init method id called in"+this.getClass().getName());
	   
   }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String userName=request.getParameter("username");
		HttpSession session=request.getSession();
		session.setAttribute("uname", userName);
		 ServletContext ctx=getServletContext();
		 int totalUsers=(Integer)ctx.getAttribute("totalusers");
		 int currentUsers=(Integer)ctx.getAttribute("currentusers");
		 
		 out.println("<br>Total users = "+totalUsers);
		 out.println("<br>current users = "+currentUsers);
		 
		 out.println("<br><a href='LogoutServlet'>logout</a>");
		 out.close();
		 
		
		
	}
	public void destroy()
	{
		System.out.println("destroy method is called in"+this.getClass().getName());
		
	}

}
