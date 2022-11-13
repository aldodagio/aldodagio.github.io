package com.example.SportyApplication;

import database.DatabaseManager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "DatabaseServlet", value = "/DatabaseServlet")
public class DatabaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DatabaseManager db = new DatabaseManager();
        Utility parser = new Utility();
        db.openConnection();
        // Enter Restaurant name (bar one), zip code(92101), provider(youtube tv), channels(specific add-ons and locals)  into database
        // at this point channels (base plan & add-ons) are in the query string and provider,restaurant,zip are all under the referer header inside of the string url value
        String query = request.getQueryString(); // expecting channel info (base plan and add-ons)
        String referer = request.getHeader("referer"); // expecting provider, name, and zip code
        ArrayList<String> queryList = parser.queryStringParser(query);
        ArrayList<String> params = parser.formatParams(parser.stripURL(referer));
        db.closeConnection();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
