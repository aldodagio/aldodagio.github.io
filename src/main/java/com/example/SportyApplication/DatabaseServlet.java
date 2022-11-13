package com.example.SportyApplication;

import database.DatabaseManager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DatabaseServlet", value = "/DatabaseServlet")
public class DatabaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DatabaseManager db = new DatabaseManager();
        db.openConnection();
        // Enter Restaurant name (bar one), zip code(92101), provider(youtube tv), channels(specific add-ons and locals)  into database
        db.closeConnection();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
