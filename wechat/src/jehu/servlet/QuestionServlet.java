package  jehu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import  jehu.domain.Question;
import  jehu.service.QuestionService;

public class QuestionServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String subject = req.getParameter("subject");
		QuestionService queser = new QuestionService();
		List alist = (List) queser.getKey(subject);
		req.setAttribute("alist", alist);
		req.getRequestDispatcher("result.jsp").forward(req, resp);
	}
}
