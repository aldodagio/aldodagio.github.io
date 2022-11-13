package com.example.SportyApplication;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Customer Instance";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><form action=\"GameServlet\" method=\"get\"><body>");
        out.println("<label for=\"team\"> Enter the sports team you want to watch: </label>");
        out.println("<input type=\"text\" id=\"team\" name=\"team\"><br><br>");
        out.println("<label for=\"zip\"> Enter your ZIP code: </label>");
        out.println("<input type=\"text\" id=\"zip\" name=\"zip\"><br><br>");
        out.println("</body></form></html>");
    }

    public void destroy() {
    }
}