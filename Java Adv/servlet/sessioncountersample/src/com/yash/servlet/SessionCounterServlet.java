package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SessionCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step 1 create the session.
		boolean create=true;
		HttpSession session=request.getSession(create);
		
		//step2: get session data
		Integer counter=(Integer)session.getAttribute("myCounter");
		if(counter==null)
		{
			counter=1;
		}
		else
		{
			counter++;
		}
		session.setAttribute("myCounter", counter);
		//step3: get the output
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>session tracking</title></head><body>You arrived here"+counter+" times <br>"
				+ "your session cookie= "+request.getHeader("cookie")+"<br>your session id ="+session.getId()
				+ "</body></html>");

	}
	
	
}
