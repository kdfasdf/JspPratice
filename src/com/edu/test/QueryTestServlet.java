package com.edu.test;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

@WebServlet("/queryTest")
public class QueryTestServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out  = resp.getWriter();
        out.print("<html><head><title>Query 문자열 테스트</title></head>");
        out.print("<body>");
        out.print("<h1>Get 방식으로 요청되었습니다</h1>");
        out.print("</body><html>");
        out.close();
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.print("<html><head><title> 질의 문자열 테스트</title></head>");
        out.print("<body>");
        out.print("<h1>POST 방식으로 요청되었습니다</h1>");
        out.println("</body></html>");
        out.close();
    }
}
