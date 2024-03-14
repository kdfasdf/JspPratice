package com.edu.test;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class InitParamServlet extends HttpServlet {
    String id,password;
    @Override
    public void init(ServletConfig config) throws ServletException {
        id=config.getInitParameter("id)");
        password=config.getInitParameter("password");
    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String env=this.getInitParameter("charset");
        res.setContentType("text/html;charset="+env);
        PrintWriter out = res.getWriter();
        req.setCharacterEncoding(env);
        out.print("<h2>서블릿 초기 추출 변수</h2>");
        out.print("<h3>ID : "+id+"</h3>");
        out.print("<h3>PassWord : "+password+"</h3>");
        out.close();
    }
}
