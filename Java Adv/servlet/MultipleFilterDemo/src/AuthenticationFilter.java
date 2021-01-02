

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AuthenticationFilter implements Filter {

	public void destroy() {
		System.out.println("destroy is called in"+this.getClass().getName());	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("do filter method is called in "+this.getClass().getName());
		PrintWriter out=response.getWriter();
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		
		String userName=req.getParameter("username");
		String passWord=req.getParameter("password");
		if(!(userName.equalsIgnoreCase("pradyumn") && passWord.equals("pradyumn")))
		{
			System.out.println("Unauthorised user");
			res.sendRedirect("index.html");
		}
		else
		{
			chain.doFilter(request, response);
		}
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init is clled in "+this.getClass().getName());
	
	}

}
