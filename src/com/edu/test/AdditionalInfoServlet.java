package com.edu.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class AdditionalInfoServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out=res.getWriter();
        out.print("<html>");
        out.print("<head><title>Request 정보 출력 Servlet</title></head>");
        out.print("<body>");
        out.print("<h3>추가적인 요청 정보</h3>");
        out.print("Request Method : " + req.getMethod()+"<br/>");
        out.print("Path Info : "+req.getPathInfo()+"<br/>");
        out.print("Path Translated : "+req.getPathTranslated() + "<br/>");
        out.print("Query String :" +req.getQueryString() + "<br/>");
        out.print("Content Length : "+req.getContentLength() + "<br/>");
        out.print("Content Type : "+req.getContentType()+ "<br/>");
        out.print("</body></html>");
        out.close();

    }
}
