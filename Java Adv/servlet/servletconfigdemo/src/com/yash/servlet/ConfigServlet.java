package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//first we will configure web.xml	
ServletConfig servletConfig=getServletConfig(); 
	String cEmail=servletConfig.getInitParameter("email");
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("<h2> Company Email="+cEmail+"</h2>");
	}
}
