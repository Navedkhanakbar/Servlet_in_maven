package com.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.*;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lifecycle")
public class Lifecycle_servlet extends HttpServlet {

    // constructor (called once when a servlet object is created)
    public Lifecycle_servlet() {
        System.out.println("Constructor: servlet object is created");
    }


    //init() method  (called once after servlet is instantiated)
    @Override
    public void init() throws ServletException {
        System.out.println("init: servlet initialized");
    }

    //doGet() method (get called for every get method)
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException ,ServletException {


        System.out.println("handling http requests");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h1>Servlet life cycle Demo</h1>");
        out.println("<p>Check server logs for lifecycle message</p>");
    }

    //destroy method (called when servlet is unloaded)

    @Override
    public void destroy() {
        System.out.println("Destroy(): servlet is been destroyed");
    }

}
