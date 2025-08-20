package com.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class Login_servlet extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {

            String username = request.getParameter("username");
            String password = request.getParameter("password");


            if ("admin".equals(username) && "123".equals(password)) {
                request.setAttribute("user",username);

                RequestDispatcher rq = request.getRequestDispatcher("welcome.jsp");
                rq.forward(request,response);

            }
            else {

                RequestDispatcher pq = request.getRequestDispatcher("error.jsp");
                pq.forward(request,response);
            }




        }

}
