package com.yash.servlet;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormBasedServlet
 */
@WebServlet("/ers")
public class FormBasedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormBasedServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empName=request.getParameter("name");
		String empEmail=request.getParameter("email");
		String empContact=request.getParameter("contact");
		String empSalary=request.getParameter("salary");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/personal","root","root");
			PreparedStatement st=con.prepareStatement("insert into data values(?,?,?,?)");
			st.setString(1, empName);
			st.setString(2, empEmail);
			st.setString(3, empContact);
			st.setString(4, empSalary);
			st.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.println("<html>"
				+ "<head>"
				+ "<title> Employee Servlet Output </title>"
				+ "<body>");
		out.println("<h1> thank you for your ragistration</h1><hr>");
		
		out.println("<h2> Name:"+empName+"</h2>");
		out.println("<h2> Email:"+empEmail+"</h2>");
		out.println("<h2> Contact:"+empContact+"</h2>");
		out.println("<h2> Salary:"+empSalary+"</h2>");
		out.println("</hr></body> "
				+ "</head>"
				+ "</html>");	}

}
