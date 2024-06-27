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

@WebServlet("/Session2")
public class SessionPrg2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        HttpSession session = req.getSession();

        if (session.isNew()) {
            out.println("<div style='font-size:larger'>Your Session is Expired</div>");
        } else {
            Object userid = session.getAttribute("userid");
            Object username = session.getAttribute("username");
            Object product1 = session.getAttribute("prd1");

            out.println("<div>User Id " + userid + "</div>");
            out.println("<div>User Name " + username + "</div>");
            out.println("<div>User Product " + product1 + "</div>");


            out.println("<div><a href='SessionLogout'>Logout</a></div>");
        }
    }
}