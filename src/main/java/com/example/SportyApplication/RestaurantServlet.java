package com.example.SportyApplication;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RestaurantServlet", value = "/RestaurantServlet")
public class RestaurantServlet extends HttpServlet {
    private String message;
    public void init() {
        message = "Welcome to the Sports Package editor!";
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><head>\n" +
                "    <title>Package Editor</title>\n" +
                "</head><form action=\"PackageInfoServlet\" method=\"get\">" +
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
        out.println("<a href=\"http://localhost:8080/SportyApplication_war_exploded/\"><img src=\"sporty_logo.jpg\"></a>");
        out.println("<br><br><br><h1>Please enter the name of your establishment (restaurant or bar) followed by the zip code in which you are located:</h1>");
        out.println("<input type=\"text\" name=\"restaurant\"><br>");
        out.println("<label for=\"restaurant\">Restaurant</label><br>");
        out.println("<input type=\"text\" name=\"address\"><br>");
        out.println("<label for=\"address\">Address</label><br>");
        out.println("<h1>List of all US cable providers:</h1>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Atlice\">Altice</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Armstrong\">Armstrong</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Atlantic Broadband\">Atlantic Broadband</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"At&T U-verse\">At&T U-verse</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Blue Ridge Cable\">Blue Ridge Cable</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"CableAmerica\">CableAmerica</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"CenturyLink Prism TV\">CenturyLink Prism TV</button><br>");
        out.println("<button name=\"provider\"  type=\"submit\" value=\"Charter Communications\">Charter Communications</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Cincinnati Bell\">Cincinnati Bell</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Comcast Xfinity TV\">Comcast Xfinity TV</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Comporium\">Comporium</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Cox Communications\">Cox Communications</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"DirecTV\">DirecTV</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Dish Network\">Dish Network</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Eagle Communications\">Eagle Communications</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Frankfort Plant Board Cable\">Frankfort Plant Board Cable</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Frontier Communications\">Frontier Communications</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"GCI\">GCI</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Google Fiber\">Google Fiber</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Grande\">Grande</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Massillon Cable\">Massillon Cable</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Mid-Hudson Cable\">Mid-Hudson Cable</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"NewWave Communications\">NewWave Communications</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"OneLink\">OneLink</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Optimum by Atlice\">Optimum by Atlice</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"San Juan Cable\">San Juan Cable</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Service Electric Cable TV\">Service Electric Cable TV</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Service Electric Cablevision\">Service Electric Cablevision</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Service Electric Broadband Cable\">Service Electric Broadband Cable</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Spectrum\">Spectrum</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"SuddenLink by Atlice\">SuddenLink by Atlice</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"SureWest\">SureWest</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Time Warner Cable\">Time Warner Cable</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Verizon FiOS TV\">Verizon FiOS TV</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Wave Broadband\">Wave Broadband</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"WEHCO video\">WEHCO video</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"WOW!\">WOW!</button><br>");
        out.println("<h1>List of all streaming cable providers:</h1>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"DirecTV Stream\">DirecTV Stream</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Fubo TV\">Fubo TV</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Hulu Plus Live TV\">Hulu Plus Live TV</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Philo\">Philo</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"Sling TV\">Sling TV</button><br>");
        out.println("<button name=\"provider\" type=\"submit\" value=\"YouTube TV\">YouTube TV</button><br>");
        //out.println("");
        out.println("</body><form></html><br>");
    }

    public void destroy() {
    }
}
