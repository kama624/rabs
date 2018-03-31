package rabs.com.filter;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;


public class HTMLTagFilter implements Filter{

	
	@SuppressWarnings("unused")
	private FilterConfig filterConfig;
	
	public void init(FilterConfig filterConfig) throws ServletException {
		
		this.filterConfig = filterConfig;		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		chain.doFilter(new HTMLTagFilterRequestWrapper((HttpServletRequest)request), response);		
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}


}
