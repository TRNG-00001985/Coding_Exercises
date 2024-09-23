package com.example;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Servlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
                System.out.println("In Service...");
                res.setContentType("text/html");
                res.getWriter().println("<h1><i>Hello World1...<i><h1>");
    }

}
