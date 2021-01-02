

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init()
	{
		System.out.println(" init is method is called in"+this.getClass().getName());
	}
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" do get method is called in"+this.getClass().getName());
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("hello world<br> ");
	}
public void destroy()
{
	System.out.println("destroy method is called in"+this.getClass().getName());}
}
