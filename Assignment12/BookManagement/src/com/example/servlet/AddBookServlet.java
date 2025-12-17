package com.example.servlet;

import com.example.models.Book;
import java.io.IOException;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class AddBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        double price = Double.parseDouble(request.getParameter("price"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bookdb", "root", "password");

            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO books (title, author, price) VALUES (?, ?, ?)");
            ps.setString(1, title);
            ps.setString(2, author);
            ps.setDouble(3, price);
            ps.executeUpdate();

            conn.close();
            response.sendRedirect("listBooks");
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}
