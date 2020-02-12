package com.t1;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		
		request.setCharacterEncoding("utf-8");

		String uname = request.getParameter("name");

		String[] Sensitive = { "法轮功", "习近平" };

		for (int i = 0; i <= Sensitive.length - 1; i++) {
			if (uname.equals(Sensitive[i])) {
				response.sendRedirect("error.jsp");
			} else {
				chain.doFilter(request, response);
			}
		}
	}
}
