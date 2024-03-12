package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/queryPost")
public class QueryStringPost extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
    {
        res.setContentType("text/html;cahrset=utf-8");
        PrintWriter out = res.getWriter();
        out.print("<html><head><title>뼏교 answkduf xptmxm </title></head>");
        out.print("<body>");
        out.print("<h1>POST 방식 질의 문자열 추출</h1>");
        ServletInputStream input = req.getInputStream();
        int len=req.getContentLength();
        byte[]buf=new byte[len];
        input.readLine(buf,0,len);
        String s = new String(buf);
        out.print("전체 문자열 : " +s);
        out.println("</body></html>");
        out.close();
    }
}
