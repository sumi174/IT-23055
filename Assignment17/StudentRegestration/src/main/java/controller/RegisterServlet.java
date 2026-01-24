package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        request.setAttribute("name", name);

        RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
        rd.forward(request, response);
    }
}
