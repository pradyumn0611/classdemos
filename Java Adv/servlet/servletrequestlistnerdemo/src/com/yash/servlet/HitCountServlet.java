package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.listener.MyServletRequestListener;

public class HitCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public void init() throws ServletException
    {
    	System.out.println("init method is created in "+this.getClass().getName());
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h2> This is target servlet</h2>");
		out.println("<h2> no of hits for this application is </h2>"+MyServletRequestListener.count);
		
	}
	public void deestroy()
	{
		System.out.println("destroy method is called in "+this.getClass().getName());
	}

}
