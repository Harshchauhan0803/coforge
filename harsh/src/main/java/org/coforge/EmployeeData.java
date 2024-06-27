package org.coforge;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/EmployeeData")

public class EmployeeData extends HttpServlet {
    Connection connection;
    ResultSet resultSet;
    Statement statement;

    @Override
    public void init() throws ServletException {
        System.out.println("init called ");
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "mysql");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?enabledTLSProtocols=TLSv1.2", "root", "mysql");
            if (connection != null)
                System.out.println("connection successful ");
            else
                System.out.println("some problem ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from employee");
            while (resultSet.next()) {
                out.println("<br>" + resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getFloat(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}