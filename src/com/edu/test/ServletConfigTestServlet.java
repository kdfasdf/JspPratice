package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletConfigTestServlet extends HttpServlet{
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
        resp.setContentType("text/html;utf-8");
        PrintWriter out = resp.getWriter();
        String env =this.getInitParameter("charset=utf-8");
        out.print("<h3> 이름 : "+req.getParameter("name"));
        out.close();
    }
}
