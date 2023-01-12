package games;

import com.example.SportyApplication.Utility;
import database.DatabaseManager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "GameServlet", value = "/GameServlet")
public class GameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Utility parser = new Utility();
        String query = request.getQueryString(); // expecting channel info (base plan and add-ons)
        ArrayList<String> params = parser.getParams(query); // getting str param value, api_key param value and date param value
        String zip = "";
        ArrayList<String> url = parser.stripURL(query);
        ArrayList<String> formatted = parser.formatParamsGameServlet(url);
        String strParam = formatted.get(1); // formatted.get(1) is the value for str param
        /*
        * str param is the key parameter in this request because it contains the list of channels/callsigns if the game was found.
        *
        * Some error handling is implemented here to redirect user before a status 500 error occurs.
        * This error gets caused by str parameter being an empty string.
        * This is caused because of shortcomings of API or the entered team is not playing today.
        * */
        if(strParam == ""){
            // they are either not playing today or due to our api being free we are limited and thus
            // cannot find your game
            PrintWriter out = response.getWriter();
            /*
             * This HTML will explain to the user
             * why there is an error.
             * */
            out.println("" +
                    "<html><head>\n" +
                    "<title>Error</title>\n" +
                    "</head><form id=\"results\">" +
                    "<style>" +
                    "body {\n" +
                    "background-color: #dd1144;\n" +
                    "}\n" +
                    "img {\n" +
                    "    width: 100px;\n" +
                    "    height: 50px;\n" +
                    "    position: absolute;\n" +
                    "    left:5;\n" +
                    "    top:5;\n" +
                    "}\n" +
                    "</style>" +
                    "<body>");
            out.println("" +
                    //"<a href=\"http://localhost:8080/SportyApplication_1_0_SNAPSHOT_war/\"><img src=\"sporty_logo.jpg\"></a>" +
                    "<a href=\"https://www.sportyapplication.com/\"><img src=\"sporty_logo.jpg\"></a>" +
                    "<br><br><br><h1>We are sorry, we were not able to find your game.</h1>" +
                    "<h2>One of the following errors occured:</h2><br>" +
                    "<h3>- Your sports team is not playing today</h3><br>" +
                    "<h4>OR</h4><br>" +
                    "<h3>- Our free subscription for Gracenote API is preventing us from finding all possible channels.</h3>");
            out.println("</body></html><br>");
        }
        /*
        * The else block handles the case that str is not an empty string.
        * In this case the game was found from the Gracenote API and we
        * must check the database to see if there is a bar/restaurant
        * in the area that has this game available.
        * */
        else {
            GameManager map = new GameManager(strParam); // creating a map of callsign and channel for the game
            Map<String, String> placesThatHaveTheGame = new LinkedHashMap<String, String>(); // a map to store restaurant/bar info if they can fulfill the callsign/channel requested

            zip += params.get(1).charAt(0) + params.get(1).charAt(1) + params.get(1).charAt(2) + params.get(1).charAt(3) + params.get(1).charAt(4);

            try {
                placesThatHaveTheGame = map.doTheyHaveTheGame(zip, map.getMap()); // initialize the map with the GameManager method doTheyHaveTheGame
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            Set<String> keys = placesThatHaveTheGame.keySet();
            String address = null;
            String name = null;
            for (String key : keys) {
                name = key;
                address = placesThatHaveTheGame.get(key);
            }
            Set<String> keys1 = map.getMap().keySet();
            String channel = null;
            for (String key : keys1) {
                channel = key;
            }
            PrintWriter out = response.getWriter();
            /*
            * This HTML will give a summary of restaurants
            * that are playing the found game in the users
            * area.
            * */
            out.println("<html><head>\n" +
                    "    <title>Summary</title>\n" +
                    "</head><form id=\"results\">" +
                    "<style>" +
                    "body {\n" +
                    "background-color: #dd1144;\n" +
                    "}\n" +
                    "img {\n" +
                    "    width: 100px;\n" +
                    "    height: 50px;\n" +
                    "    position: absolute;\n" +
                    "    left:5;\n" +
                    "    top:5;\n" +
                    "}\n" +
                    "</style>" +
                    "<body>");
            //out.println("<a href=\"http://localhost:8080/SportyApplication_1_0_SNAPSHOT_war/\"><img src=\"sporty_logo.jpg\"></a>");
            out.println("<a href=\"https://www.sportyapplication.com/\"><img src=\"sporty_logo.jpg\"></a>");
            out.println("<br><br><br><h1> " + name + " has your game via " + channel + "! Here is their full address: " + address + ". </h1>");
            out.println("</body><form></html><br>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
