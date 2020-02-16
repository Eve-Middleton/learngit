package com.t1.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.t1.service.StudentService;

public class StudentServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String bhao = req.getParameter("banhao");
        StudentService stug = new StudentService();
        double scor=stug.getAve(bhao);
        req.setAttribute("scor",scor+"");
        req.getRequestDispatcher("result.jsp").forward(req,resp);
    }
}
