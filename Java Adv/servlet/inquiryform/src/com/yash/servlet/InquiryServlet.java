package com.yash.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InquiryServlet
 */
@WebServlet("/InquiryServlet")
public class InquiryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration parameters=request.getParameterNames();
		StringBuilder sbCourse=new StringBuilder();
		while(parameters.hasMoreElements())
		{
			Object obj=parameters.nextElement();
			String param=(String)obj;
			String parValue=request.getParameter(param);
			if (param.equals("course"))
			{
				String[] courses=request.getParameterValues(param);
				for(String co:courses)
				{
					sbCourse.append(co+" ");
					System.out.println("param :"+param+"value"+parValue);
					
				}
				System.out.println("selected courses:"+sbCourse);
			}
		}
		
	}

	

}
