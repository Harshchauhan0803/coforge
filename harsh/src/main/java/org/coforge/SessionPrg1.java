package org.coforge;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
@WebServlet("/Session1")

public class SessionPrg1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        resp.setContentType("text/html");

        HttpSession session=req.getSession();
        out.println("<div>Id is "+session.getId()+"</div>");
        out.println("<div>Session Created at "+new Date(session.getCreationTime())+"</div>");

        session.setMaxInactiveInterval(5);

        out.println("<div>Session Max Inactive Interval Time "+session.getMaxInactiveInterval()+" seconds </div>");
        out.println("<div>Session Max Inactive Interval Time "+(session.getMaxInactiveInterval()/60)+" minutes </div>");

        session.setAttribute("userid",1001);
        session.setAttribute("username","Harsh");
        session.setAttribute("prd1","mobile");

        out.println("<div><a href='Session2'>Session2</a></div>");
    }
}
