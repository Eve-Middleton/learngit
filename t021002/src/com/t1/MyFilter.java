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

		String Filstr = request.getParameter("name");

		if ("法轮功".equals(Filstr)) {
			response.sendRedirect("error.jsp");
			// request.getRequestDispatcher("error.jsp").forward(request,response);
			// 数据共享时使用第二种
		} else {
			// response.sendRedirect("result.jsp");
			// request.getRequestDispatcher("result.jsp").forward(request,response);
			chain.doFilter(request, response);
		}
	}
}
