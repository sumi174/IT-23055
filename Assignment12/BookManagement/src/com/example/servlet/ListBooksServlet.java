package com.example.servlet;

import com.example.model.Book;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ListBooksServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Book> books = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bookdb", "root", "password");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books");
            while (rs.next()) {
                Book b = new Book(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getDouble("price")
                );
                books.add(b);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.setAttribute("books", books);
        RequestDispatcher rd = request.getRequestDispatcher("listBooks.jsp");
        rd.forward(request, response);
    }
}
