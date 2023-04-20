package com.example.reskill; /**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangrui
 * @version:1.0
 * @Description:
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginOutServlet", value = "/LoginOutServlet")
public class LoginOutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //注销方法
        request.getSession().invalidate();
        System.out.println("注销");
        response.sendRedirect("loginOut.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
