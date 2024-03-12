package com.edu.test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.util.*;
import javax.servlet.http.*;

@WebServlet("/headerInfo")
public class HeaderIndoServlet extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        out.print("<html>");
        out.print("<head><title>Request 정보 출력 Servlet</title></head>");
        out.print("<body>");
        out.print("<h3>요청 헤더 정보</h3>");
        Enumeration<String> em = req.getHeaderNames();
        while(em.hasMoreElements()){
            String s =em.nextElement();
            out.println(s+" : "+req.getHeader(s) +"<br/>");
        }
        out.print("</body></html>");
        out.close();
    }
}
