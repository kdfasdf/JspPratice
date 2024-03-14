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
        //getParameter, getInputStream은 같이 사용할 수 없는가?
        //보통 특정 기능을 위해 클라이언트에서 서비스를 요청하면
        //파라미터의 값이 고정적이지 않을 텐데 서블릿 태그로 파라미터를 보내는게
        //큰 의미가 있는지 모르겠다(초기 값 파라미터를 넘긴다 해도)
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        out.print("<html><head><title>뼏교 answkduf xptmxm </title></head>");
        out.print("<body>");
        out.print("<h1>POST 방식 질의 문자열 추출</h1>");
        req.setCharacterEncoding("utf-8");
        String s2=req.getParameter("name");
        out.println("이름 : " +s2);
        ServletInputStream input = req.getInputStream();
        int len=req.getContentLength();
        byte[]buf=new byte[len];
        input.readLine(buf,0,len);
        String s = new String(buf);
        s2=req.getParameter("name");
        out.println("이름 : " +s2);
        out.print("전체 문자열 : " +s);
        out.println("</body></html>");
        out.close();
    }
}
