package com.edu.test;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/context4")
public class ServletContextTest4Servlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        ServletContext sc = this.getServletContext();
        shareObject obj1 = (shareObject) sc.getAttribute("data1");
        shareObject obj2 = (shareObject) sc.getAttribute("data2");

        out.print("DATA1 : "+obj1.getCount()+" , "+obj1.getStr() +"</br>");
        out.print("DATA2 : " + obj2.getCount()+" , "+obj2.getStr());
        out.close();
    }
}
