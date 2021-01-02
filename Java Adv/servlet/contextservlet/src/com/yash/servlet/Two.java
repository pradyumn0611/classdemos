package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Two extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig sc= getServletConfig();
		PrintWriter out=response.getWriter();
				String value3=sc.getInitParameter("p3");
		out.println(value3);
		String value4=sc.getInitParameter("p4");
		out.println(value4);
		String value1=sc.getInitParameter("p1");
		out.println(value1);
		String value2=sc.getInitParameter("p2");
		out.println(value2);
		ServletContext scontext=getServletContext();	
		String p5=scontext.getInitParameter("p5");
		out.println(p5);
	}

}
