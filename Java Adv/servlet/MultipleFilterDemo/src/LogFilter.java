

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;



public class LogFilter implements Filter {

	 
	public void destroy() {
		System.out.println("destroy is called in"+this.getClass().getName());
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	System.out.println("do filter method is called in "+this.getClass().getName());
	PrintWriter out=response.getWriter();
	HttpServletRequest req=(HttpServletRequest)request;
	//get the ip address of client machine
	String ipAddress=req.getRemoteAddr();
	//log the ip address and current time stamp
	out.println("ip address is"+ipAddress+"time"+new Date().toString());
	out.println("logfilter is invoked before<br>");
	chain.doFilter(request, response);
	out.println("logfilter is invoked after <br>");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init is clled in "+this.getClass().getName());
		
	}

}
