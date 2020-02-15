package com.t1.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import com.t1.service.MianJiService;

public class MianJiServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String strid = req.getParameter("id");
        int id = Integer.parseInt(strid);
        MianJiService mjs = new MianJiService();
        int mj = mjs.getMianJi(id);
        req.setAttribute("mianji", mj + "");
        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }
}
