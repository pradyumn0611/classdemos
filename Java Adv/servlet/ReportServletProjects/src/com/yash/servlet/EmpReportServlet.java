package com.yash.servlet;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class EmpReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
				response.setContentType("text/html");
				PrintWriter out=response.getWriter();
				try{
					Class.forName("com.mysql.jdbc.Driver");
					String sql="select * from empdb";
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","root");
					PreparedStatement pstm=con.prepareStatement(sql);
					ResultSet rs=pstm.executeQuery();
					out.println("<html>  ");
					out.println(" <head><title> emp info</title></head> ");
					out.println(" <body> ");
					out.println(" <table border='1'> ");
					
					out.println(" <tr> ");
					out.println(" <td>id</td> ");
					out.println(" <td>name</td> ");
					out.println(" <td> salary</td>");
					out.println("</tr>");
					while(rs!=null && rs.next())
					{
						out.println(" <tr> ");
						out.println(" <td>"+rs.getInt("id")+"</td> ");
						out.println(" <td>"+rs.getString("name")+"</td> ");
						out.println(" <td>"+rs.getInt("salary")+"</td>");
						out.println("</tr>");
					}
					
					out.println("</table>");
					out.println("</head>");
					out.println("</body>");
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}finally
				{
					out.close();
				}
			}

}
