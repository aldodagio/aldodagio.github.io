package com.example.SportyApplication;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DatabaseServlet", value = "/DatabaseServlet")
public class DatabaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><head>\n" +
                "    <title>Package Editor</title>\n" +
                "</head><form action=\" + request.getContextPath() + \"/DatabaseServlet method=\"post\"><body>");
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
            out.println("<h1>List of YouTube TV plans:</h1>");
            out.println("<input id=\"basePlan\" type=\"checkbox\">Base Plan<br>");
            out.println("<input id=\"spanishPlan\" type=\"checkbox\">Spanish Plan<br>");
            out.println("<h1>List of YouTube TV Add-Ons:</h1>");
            out.println("<input id=\"4k_plus\" type=\"checkbox\">4K Plus<br>");
            out.println("<input id=\"sportsPlus\" type=\"checkbox\">SportsPlus<br>"); // includes RedZone, beIn SPORTS, FOX Soccer Plus, VSiN, Outside TV+, PokerGO+, MAVTV, FanDuel TV, Stadium, Billiard TV, SportsGrid, PlayersTV, Fight Network, IMPACT Wrestling
            out.println("<input id=\"spanishPlus\" type=\"checkbox\">Spanish Plus<br>");
            out.println("<input id=\"hboMax\" type=\"checkbox\">HBO Max<br>");
            out.println("<input id=\"nbaLeaguePass\" type=\"checkbox\">NBA League Pass<br>"); // All live, out of market NBA games included with this add-on
            out.println("<input id=\"entertainmentPlus\" type=\"checkbox\">Entertainment Plus<br>");
            out.println("<input id=\"mlbTV\" type=\"checkbox\">MLB.TV<br>"); // All live, out of market MLB games included with this add-on
            out.println("<input id=\"showtime\" type=\"checkbox\">SHOWTIME<br>"); // includes some sports
            out.println("<input id=\"starz\" type=\"checkbox\">STARZ<br>");
            out.println("<input id=\"hallmarkMoviesNow\" type=\"checkbox\">Hallmark Movies Now<br>");
            out.println("<input id=\"cinemax\" type=\"checkbox\">Cinemax<br>");
            out.println("<input id=\"epix\" type=\"checkbox\">EPIX<br>");
            out.println("<input id=\"starzPlusEpix\" type=\"checkbox\">STARZ + EPIX<br>");
            out.println("<input id=\"pantaya\" type=\"checkbox\">Pantaya<br>");
            out.println("<input id=\"foxNation\" type=\"checkbox\">FOX Nation<br>");
            out.println("<input id=\"screenPix\" type=\"checkbox\">ScreenPix<br>");
            out.println("<input id=\"curiosityStream\" type=\"checkbox\">CuriosityStream<br>");
            out.println("<input id=\"amcPlus\" type=\"checkbox\">AMC+<br>");
            out.println("<input id=\"shudder\" type=\"checkbox\">Shudder<br>");
            out.println("<input id=\"sundanceNow\" type=\"checkbox\">Sundance Now<br>");
            out.println("<input id=\"acornTV\" type=\"checkbox\">Acorn TV<br>");
            out.println("<input id=\"ifcFilmsUnlimited\" type=\"checkbox\">IFC Films Unlimited<br>");
            out.println("<input id=\"allblk\" type=\"checkbox\">ALLBLK<br>");
            out.println("<input id=\"docurama\" type=\"checkbox\">Docurama<br>");
            out.println("<input id=\"conTV\" type=\"checkbox\">CONtv<br>");
            out.println("<input id=\"dove\" type=\"checkbox\">Dove<br>");
            out.println("<input id=\"lawAndCrime\" type=\"checkbox\">Law & Crime<br>");
            out.println("<input id=\"upFaithAndFamily\" type=\"checkbox\">UP Faith & Family<br>");
            out.println("<input id=\"fandor\" type=\"checkbox\">Fandor<br>");
            out.println("<input id=\"screambox\" type=\"checkbox\">Screambox<br>");
            out.println("<input id=\"comedyDynamics\" type=\"checkbox\">Comedy Dynamics<br>");
            out.println("<input id=\"outsideTVFeatures\" type=\"checkbox\">Outside TV Features<br>");
            out.println("<input id=\"vsin\" type=\"checkbox\">VSiN<br>");
            out.println("<input id=\"myOutdoorTV\" type=\"checkbox\">MyOutdoorTV<br>"); // premium hunting and fishing, etc.
            out.println("<input id=\"movieSphere\" type=\"checkbox\">MovieSphere<br>");
            out.println("<input id=\"theGreatCourses\" type=\"checkbox\">The Great Courses<br>");
            out.println("<input id=\"rcnTotal\" type=\"checkbox\">RCN Total<br>");
            out.println("<input id=\"atresplayer\" type=\"checkbox\">ATRESplayer<br>");
            out.println("<input id=\"dekkoo\" type=\"checkbox\">Dekkoo<br>");
            out.println("<input id=\"tastemadePlus\" type=\"checkbox\">Tastemade+<br>");
            out.println("<input id=\"vixPlus\" type=\"checkbox\">ViX+<br>");
            out.println("<input id=\"magnoliaSelects\" type=\"checkbox\">Magnolia Selects<br>");
            out.println("<input id=\"topic\" type=\"checkbox\">Topic<br>");
            out.println("<input id=\"hereTV\" type=\"checkbox\">Here TV<br>");
            out.println("<input id=\"gaia\" type=\"checkbox\">Gaia<br>");
        }

        out.println("</body><form></html><br>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
