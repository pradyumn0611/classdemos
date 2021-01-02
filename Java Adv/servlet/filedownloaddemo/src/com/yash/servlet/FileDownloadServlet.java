package com.yash.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FileDownloadServlet")
public class FileDownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String filename="tax.txt";
	String filePath="F:\\uploads/";
	response.setContentType("Application/OCTET-STREAM");
	response.setHeader("Content-Disposition","attachment; filename=\""+ filename+"\"");
	FileInputStream fileInputStream=new FileInputStream(filePath+filename);
	//now we need to read data bit by bit.
	int i;
	while((i=fileInputStream.read())!=-1)
	{
		out.write(i);
	}
	fileInputStream.close();
	out.close();
	}

}
