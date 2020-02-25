package com.t1.servlet;

import com.t1.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String number = req.getParameter("number");
        String password = req.getParameter("password");
        UserService stug = new UserService();
        boolean result = stug.getSelect(number, password);
        System.out.println(result);
        Boolean qresult = new Boolean(result);
        req.setAttribute("qresult", qresult);
        req.getRequestDispatcher("get.jsp").forward(req, resp);
    }
}
