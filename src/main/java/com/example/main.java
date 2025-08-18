package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/hello")
public class main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response )
            throws IOException, ServletException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h1>Hello from servlet in Maven!</h1>");

    }
}
