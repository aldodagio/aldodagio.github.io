package com.example.SportyApplication;

import database.DatabaseManager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;

@WebServlet(name = "PackageInfoServlet", value = "/PackageInfoServlet")
public class PackageInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><head>\n" +
                "    <title>Package Editor</title>\n" +
                "</head><form action=\"DatabaseServlet\" method=\"get\">" +
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
        String provider = request.getParameter("provider");
        if(provider.equals("Atlice")){}
        else if(provider.equals("Armstrong")){}
        else if(provider.equals("Atlantic Broadband")){}
        else if(provider.equals("At&T U-verse")){}
        else if(provider.equals("Blue Ridge Cable")){}
        else if(provider.equals("CableAmerica")){}
        else if(provider.equals("CenturyLink Prism TV")){}
        else if(provider.equals("Charter Communications")){}
        else if(provider.equals("Cincinnati Bell")){}
        else if(provider.equals("Comcast Xfinity TV")){}
        else if(provider.equals("Comporium")){}
        else if(provider.equals("Cox Communications")){}
        else if(provider.equals("DirecTV")){}
        else if(provider.equals("Dish Network")){}
        else if(provider.equals("Eagle Communications")){}
        else if(provider.equals("Frankfort Plant Board Cable")){}
        else if(provider.equals("Frontier Communications")){}
        else if(provider.equals("GCI")){}
        else if(provider.equals("Google Fiber")){}
        else if(provider.equals("Grande")){}
        else if(provider.equals("Massillon Cable")){}
        else if(provider.equals("Mid-Hudson Cable")){}
        else if(provider.equals("NewWave Communications")){}
        else if(provider.equals("OneLink")){}
        else if(provider.equals("Optimum by Atlice")){}
        else if(provider.equals("San Juan Cable")){}
        else if(provider.equals("Service Electric Cable TV")){}
        else if(provider.equals("Service Electric Cablevision")){}
        else if(provider.equals("Service Electric Broadband Cable")){}
        else if(provider.equals("Spectrum")){}
        else if(provider.equals("SuddenLink by Atlice")){}
        else if(provider.equals("SureWest")){}
        else if(provider.equals("Time Warner Cable")){}
        else if(provider.equals("Verizon FiOS TV")){}
        else if(provider.equals("Wave Broadband")){}
        else if(provider.equals("WEHCO video")){}
        else if(provider.equals("WOW!")){}
        else if(provider.equals("DirecTV Stream")){}
        else if(provider.equals("Fubo TV")){}
        else if(provider.equals("Hulu Plus Live TV")){}
        else if(provider.equals("Philo")){}
        else if(provider.equals("Sling TV")){}
        else if(provider.equals("YouTube TV")){
            out.println("<a href=\"http://localhost:8080/SportyApplication_1_0_SNAPSHOT_war/\"><img src=\"sporty_logo.jpg\"></a>");
            out.println("<br><br><br><h1>List of YouTube TV plans:</h1>");
            out.println("<input name=\"basePlan\" type=\"checkbox\">Base Plan<br>");
            out.println("<input name=\"spanishPlan\" type=\"checkbox\">Spanish Plan<br>");
            out.println("<h1>List of YouTube TV Add-Ons:</h1>");
            out.println("<input name=\"4k_plus\" type=\"checkbox\">4K Plus<br>");
            out.println("<input name=\"sportsPlus\" type=\"checkbox\">SportsPlus<br>"); // includes RedZone, beIn SPORTS, FOX Soccer Plus, VSiN, Outside TV+, PokerGO+, MAVTV, FanDuel TV, Stadium, Billiard TV, SportsGrid, PlayersTV, Fight Network, IMPACT Wrestling
            out.println("<input name=\"spanishPlus\" type=\"checkbox\">Spanish Plus<br>");
            out.println("<input name=\"hboMax\" type=\"checkbox\">HBO Max<br>");
            out.println("<input name=\"nbaLeaguePass\" type=\"checkbox\">NBA League Pass<br>"); // All live, out of market NBA games included with this add-on
            out.println("<input name=\"entertainmentPlus\" type=\"checkbox\">Entertainment Plus<br>");
            out.println("<input name=\"mlbTV\" type=\"checkbox\">MLB.TV<br>"); // All live, out of market MLB games included with this add-on
            out.println("<input name=\"showtime\" type=\"checkbox\">SHOWTIME<br>"); // includes some sports
            out.println("<input name=\"starz\" type=\"checkbox\">STARZ<br>");
            out.println("<input name=\"hallmarkMoviesNow\" type=\"checkbox\">Hallmark Movies Now<br>");
            out.println("<input name=\"cinemax\" type=\"checkbox\">Cinemax<br>");
            out.println("<input name=\"epix\" type=\"checkbox\">EPIX<br>");
            out.println("<input name=\"starzPlusEpix\" type=\"checkbox\">STARZ + EPIX<br>");
            out.println("<input name=\"pantaya\" type=\"checkbox\">Pantaya<br>");
            out.println("<input name=\"foxNation\" type=\"checkbox\">FOX Nation<br>");
            out.println("<input name=\"screenPix\" type=\"checkbox\">ScreenPix<br>");
            out.println("<input name=\"curiosityStream\" type=\"checkbox\">CuriosityStream<br>");
            out.println("<input name=\"amcPlus\" type=\"checkbox\">AMC+<br>");
            out.println("<input name=\"shudder\" type=\"checkbox\">Shudder<br>");
            out.println("<input name=\"sundanceNow\" type=\"checkbox\">Sundance Now<br>");
            out.println("<input name=\"acornTV\" type=\"checkbox\">Acorn TV<br>");
            out.println("<input name=\"ifcFilmsUnlimited\" type=\"checkbox\">IFC Films Unlimited<br>");
            out.println("<input name=\"allblk\" type=\"checkbox\">ALLBLK<br>");
            out.println("<input name=\"docurama\" type=\"checkbox\">Docurama<br>");
            out.println("<input name=\"conTV\" type=\"checkbox\">CONtv<br>");
            out.println("<input name=\"dove\" type=\"checkbox\">Dove<br>");
            out.println("<input name=\"lawAndCrime\" type=\"checkbox\">Law & Crime<br>");
            out.println("<input name=\"upFaithAndFamily\" type=\"checkbox\">UP Faith & Family<br>");
            out.println("<input name=\"fandor\" type=\"checkbox\">Fandor<br>");
            out.println("<input name=\"screambox\" type=\"checkbox\">Screambox<br>");
            out.println("<input name=\"comedyDynamics\" type=\"checkbox\">Comedy Dynamics<br>");
            out.println("<input name=\"outsideTVFeatures\" type=\"checkbox\">Outside TV Features<br>");
            out.println("<input name=\"vsin\" type=\"checkbox\">VSiN<br>");
            out.println("<input name=\"myOutdoorTV\" type=\"checkbox\">MyOutdoorTV<br>"); // premium hunting and fishing, etc.
            out.println("<input name=\"movieSphere\" type=\"checkbox\">MovieSphere<br>");
            out.println("<input name=\"theGreatCourses\" type=\"checkbox\">The Great Courses<br>");
            out.println("<input name=\"rcnTotal\" type=\"checkbox\">RCN Total<br>");
            out.println("<input name=\"atresplayer\" type=\"checkbox\">ATRESplayer<br>");
            out.println("<input name=\"dekkoo\" type=\"checkbox\">Dekkoo<br>");
            out.println("<input name=\"tastemadePlus\" type=\"checkbox\">Tastemade+<br>");
            out.println("<input name=\"vixPlus\" type=\"checkbox\">ViX+<br>");
            out.println("<input name=\"magnoliaSelects\" type=\"checkbox\">Magnolia Selects<br>");
            out.println("<input name=\"topic\" type=\"checkbox\">Topic<br>");
            out.println("<input name=\"hereTV\" type=\"checkbox\">Here TV<br>");
            out.println("<input name=\"gaia\" type=\"checkbox\">Gaia<br>");
        }
        out.println("<button type=\"submit\">Submit</button>");
        out.println("</body><form></html><br>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
