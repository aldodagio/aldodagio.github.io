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
        Utility parser = new Utility();
        String query = request.getQueryString(); // expecting channel info (base plan and add-ons)
        ArrayList<String> params = parser.getParams(query);
        String zip = "";
        zip += params.get(1).charAt(0);
        zip += params.get(1).charAt(1);
        zip += params.get(1).charAt(2);
        zip += params.get(1).charAt(3);
        zip += params.get(1).charAt(4);
        //response.setContentType("text/html");
        ArrayList<String> url = parser.stripURL(query);
        ArrayList<String> formatted = parser.formatParamsGameServlet(url);
        GameManager map = new GameManager(formatted.get(1));
        Map<String,String> placesThatHaveTheGame = new LinkedHashMap<String,String>();
        try {
            placesThatHaveTheGame = map.doTheyHaveTheGame(zip, map.getMap());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        Set<String> keys = placesThatHaveTheGame.keySet();
        String address = null;
        String name = null;
        for(String key : keys){
            name = key;
            address = placesThatHaveTheGame.get(key);
        }
        Set<String> keys1 = map.getMap().keySet();
        String channel = null;
        for(String key : keys1){
            channel = key;
        }
        PrintWriter out = response.getWriter();
        out.println("<html><head>\n" +
                "    <title>Summary</title>\n" +
                "</head><form id=\"results\"><body>");
        out.println("<h1> " + name + " has your game via " + channel + "! Here is their full address: " + address + ". </h1>");
        out.println("</body><form></html><br>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
