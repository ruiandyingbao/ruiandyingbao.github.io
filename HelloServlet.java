package com.example.reskill;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/loginServlet")
public class HelloServlet extends HttpServlet {

    //用doGet方法可以自动处理乱码
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name =req.getParameter("name");
        req.getSession().setAttribute("SessionListener",new SessionListener(name));
        resp.sendRedirect("welcome.jsp");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doGet(req,resp);
    }
}