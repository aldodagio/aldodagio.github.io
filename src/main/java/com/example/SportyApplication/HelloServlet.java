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
        Utility date = new Utility();

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><form id=\"sportsListings\" action=\"GameServlet\" method=\"get\">" +
                "<style> body { \n" +
                "background-color: #dd1144;\n" +
                " }\n" +
                "img {\n" +
                "    width: 100px;\n" +
                "    height: 50px;\n" +
                "    position: absolute;\n" +
                "    left:5;\n" +
                "    top:5;\n" +
                "}" +
                "</style>" +
                "<body>");
        out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\" type=\"text/javascript\"></script>" +
                "<br><br><br><label for=\"team\"> Enter the sports team you want to watch: </label>");
         out.println("<a href=\"https://localhost:8080/SportyApplication_war_exploded/\"><img src=\"sporty_logo.jpg\"></a>");
        out.println("<input type=\"text\" id=\"team\" name=\"team\"><br><br>");
        out.println("<label for=\"zip\"> Enter your ZIP code: </label>");
        out.println("<input type=\"text\" id=\"zip\" name=\"zip\"><br><br>");
        out.println("<input type=\"hidden\" id=\"lineupId\" name=\"lineupId\" value=\"USA-TX42500-X\">\n" +
                "<input type=\"hidden\" id=\"startDateTime\" name=\"startDateTime\" value=\"" + date.getDateFormatForGracenoteAPICall() + "\">\n" +
                "<input type=\"hidden\" id=\"str\" name=\"str\" value=\"\">" +
                "<input type=\"hidden\" id=\"api_key\" name=\"api_key\" value=\"32gwu9v9zkpr42bjzx8v9u8w\">");
        out.println("<button id=\"submitButton\">Submit</button>");
        out.println("" +
                "<script>var team = document.getElementById(\"team\");\n" +
                "var zip = document.getElementById(\"zip\");\n" +
                "var str = document.getElementById(\"str\");\n" +
                "var lineup = document.getElementById(\"lineupId\");\n" +
                "var startDateTime = document.getElementById(\"startDateTime\");\n" +
                "function sendRequest() {" +
                "const XHR = new XMLHttpRequest(); " +
                "const FD = new FormData(form); " +
                "XHR.open(\"GET\", \"https://localhost:8080/SportyApplication_war_exploded/hello-servlet?team=\" + team.value +\"&zip=\" + zip.value + \"&str=\" + str.value +\"\"); " +
                "XHR.send(FD);" +
                "}" +
                "function sendData() { " +
                "const XHR = new XMLHttpRequest(); " +
                "const FD = new FormData(form); " +
                "XHR.open(\"GET\", \"https://data.tmsapi.com/v1.1/sports/59/events/airings?lineupId=\" + lineup.value +\"&startDateTime=\" + startDateTime.value + \"T20%3A30Z&api_key=32gwu9v9zkpr42bjzx8v9u8w\"); " +
                "XHR.send(FD); XHR.onload = () => { " +
                "if (XHR.readyState === 4) { " +
                "if (XHR.status === 200) {" +
                "var res = JSON.parse(XHR.responseText); " +
                "const map1 = new Map(); " +
                "var name = team.value;" +
                "for (let i = 0; i < res.length; i++){" +
                "if (res[i].program.eventTitle != undefined) " +
                "{ " +
                "if (res[i].program.eventTitle.includes(name)) {" +
                "map1.set(res[i].station.callSign, res[i].station.channel);" + // map entries for callsign and channel for specified team
                "}" +
                "} " +
                "for(let [key, value] of map1) { str.value += key + \"->\" + value; " +
                "}" +
                "if(str.value === null)" +
                "{  }" +
                "sendRequest();" +
                "$(\'#sportsListings\').submit();" +
                "}" +
                "/*window.location.replace(\"/GameServlet\");*/ " +
                "} " +
                "}" +
                "}" +
                "}" +
                "const form = document.getElementById(\"sportsListings\");" +
                "$(\'#submitButton\').click(function(e) {\n" +
                "e.preventDefault();\n" +
                "sendData();\n" +
                "\n" +
                "});</script>");
        out.println("</body></form></html>");
    }

    public void destroy() {
    }
}