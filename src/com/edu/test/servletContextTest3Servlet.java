package com.edu.test;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/context3")
public class servletContextTest3Servlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out =res.getWriter();
        ServletContext sc = this.getServletContext();
        shareObject obj1 = new shareObject();
        obj1.setCount(100);
        obj1.setStr("객체공유 테스트 -1");
        sc.setAttribute("data1",obj1);

        shareObject obj2 = new shareObject();
        obj2.setCount(200);
        obj2.setStr("객체 공유 테스트 -2");
        sc.setAttribute("data2",obj2);
        out.print("ServletContext객체에 데이터 등록을 하였습니다");
    }
}
