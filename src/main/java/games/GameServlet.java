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

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><head>\n" +
                "    <title>Package Editor</title>\n" +
                "</head><form id=\"sportsListings\"><body>");
        out.println("<input type=\"hidden\" id=\"lineupId\" name=\"lineupId\" value=\"USA-TX42500-X\">\n" +
                "    <input type=\"hidden\" id=\"startDateTime\" name=\"startDateTime\" value=\"2022-11-13\">\n" +
                "    <input type=\"hidden\" id=\"api_key\" name=\"api_key\" value=\"32gwu9v9zkpr42bjzx8v9u8w\">");
        out.println("<script>function sendData() { const XHR = new XMLHttpRequest(); const FD = new FormData(form); XHR.open(\"GET\", \"http://data.tmsapi.com/v1.1/sports/59/events/airings?lineupId=USA-TX42500-X&startDateTime=2022-11-13T20%3A30Z&api_key=32gwu9v9zkpr42bjzx8v9u8w\"); XHR.send(FD); XHR.onload = () => { if(XHR.readyState === 4) { if(XHR.status === 200) { var res = JSON.parse(XHR.responseText); if(res.success)window.location.replace(\"SuccessPage.html\"); } } }}const form = document.getElementById(\"sportsListings\");form.addEventListener(\"submit\", (event) => {\n" +
                "      event.preventDefault();\n" +
                "      sendData();\n" +
                "    });</script>");
        out.println("<button type=\"submit\">Submit</button>");
        out.println("</body><form></html><br>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
