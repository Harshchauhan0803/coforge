package org.coforge;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/EmployeeServlet")
//@WebServlet("/Hello1")  *****just change the form action to Hello1*****


public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id=Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");


        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();


        out.println("<h3>id is : "+id);
        out.println("<h3>name is : "+name);

        String qstring=req.getQueryString();
        out.println("<br>Query String is "+qstring);
    }
}
