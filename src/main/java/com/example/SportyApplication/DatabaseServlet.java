package com.example.SportyApplication;

import database.DatabaseManager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "DatabaseServlet", value = "/DatabaseServlet")
public class DatabaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DatabaseManager db = new DatabaseManager();
        Utility parser = new Utility();
        db.openConnection();
        String zipCode = "";
        // Enter Restaurant name (bar one), zip code(92101), provider(youtube tv), channels(specific add-ons and locals)  into database
        // at this point channels (base plan & add-ons) are in the query string and provider,restaurant,zip are all under the referer header inside of the string url value
        String query = request.getQueryString(); // expecting channel info (base plan and add-ons)
        String referer = request.getHeader("referer"); // expecting provider, name, and zip code
        ArrayList<String> queryList = parser.queryStringParser(query);
        ArrayList<String> params = parser.formatParams(parser.stripURL(referer));
        // params.get(0) -> YouTube TV (provider), params.get(1) -> 92101 (zipCode), params.get(2) -> Bar One (establishmentName)
        // queryList.get(0) -> basePlan (basePackage), queryList.get(n+1) -> add-ons
        String provider = params.get(0);
        String address = params.get(1);
        zipCode += params.get(1).charAt(address.length()-5);
        zipCode += params.get(1).charAt(address.length()-4);
        zipCode += params.get(1).charAt(address.length()-3);
        zipCode += params.get(1).charAt(address.length()-2);
        zipCode += params.get(1).charAt(address.length()-1);
        String establishmentName = params.get(2);
        String basePackage = queryList.get(0);
        try {
            db.insertRow(provider, zipCode, establishmentName, basePackage, address, queryList, db);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        db.closeConnection();
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html>" +
                "<style>\n" +
                "body {\n" +
                "background-color: #dd1144;\n" +
                "}\n" +
                "img {\n" +
                "width: 100px;\n" +
                "height: 50px;\n" +
                "position: absolute;\n" +
                "left:5;\n" +
                "top:5;\n" +
                "}\n" +
                "</style>" +
                "<body>");
        out.println("<a href=\"http://localhost:8080/SportyApplication_1_0_SNAPSHOT_war/\"><img src=\"sporty_logo.jpg\"></a>");
        out.println("<br><br><br><h1>Your input has been registered! Thank you!</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
