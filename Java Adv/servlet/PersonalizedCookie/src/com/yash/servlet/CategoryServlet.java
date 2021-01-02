package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CategoryServlet")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Cookie [] cookies=request.getCookies();
		if(cookies!=null)
		{
			for (Cookie cookie : cookies) {
				getServletContext().getRequestDispatcher("/"+cookie.getValue()+".html").forward(request, response);
				return;
				
			}
		}
		getServletContext().getRequestDispatcher("/topCatagory.html").forward(request, response);
	}
}
