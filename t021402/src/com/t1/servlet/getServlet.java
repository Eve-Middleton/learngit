package com.t1.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class getServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String schang = req.getParameter("chang");
        String skuan = req.getParameter("kuan");
        int ichang = Integer.parseInt(schang);
        int ikuan = Integer.parseInt(skuan);
        int mj = ichang * ikuan;
        req.setAttribute("smj", mj + "");
        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }
}
