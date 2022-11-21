package games;

import com.example.SportyApplication.Utility;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "GameServlet", value = "/GameServlet")
public class GameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Utility parser = new Utility();
        String query = request.getQueryString(); // expecting channel info (base plan and add-ons)
        ArrayList<String> params = parser.getParams(query);
        //response.setContentType("text/html");
        ArrayList<String> url = parser.stripURL(query);
        ArrayList<String> formatted = parser.formatParams(url);
        GameManager map = new GameManager(formatted.get(1));
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><head>\n" +
                "    <title>Package Editor</title>\n" +
                "</head><form id=\"sportsListings\"><body>");
        out.println("<button type=\"submit\">Submit</button>");
        out.println("</body><form></html><br>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
