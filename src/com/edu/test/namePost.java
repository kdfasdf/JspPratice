package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/namePost")
public class namePost extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.print("<html><head><title>Query 문자열 테스트 </title></head>");
        out.print("<body>");
        out.print("<h1>POST 방식으로 요청되었습니다</h1>");
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        out.print("이름 : "+name +"<br/>");

        out.println("<body></html>");
        out.close();
    }
}
