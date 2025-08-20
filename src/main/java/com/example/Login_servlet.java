package com.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class Login_servlet extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {

            String username = request.getParameter("username");
            String password = request.getParameter("password");

            List<String> users = Arrays.asList("naved", "alfiya", "alvid");


            if ("admin".equals(username) && "123".equals(password)) {
//                request.setAttribute("user",username);
                request.setAttribute("userslist",users);

                request.getRequestDispatcher("users.jsp").forward(request,response);


//                RequestDispatcher rq = request.getRequestDispatcher("successfully_login.jsp");
//                rq.forward(request,response);

            }
            else {

                RequestDispatcher pq = request.getRequestDispatcher("error.jsp");
                pq.forward(request,response);
            }




        }

}
