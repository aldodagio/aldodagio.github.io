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
                "</head><form action=\" + request.getContextPath() + \"/DatabaseServlet method=\"get\"><body>");
        out.println("<h1>List of all US cable providers:</h1>");
        out.println("<button>Altice</button><br>");
        out.println("<button>Armstrong</button><br>");
        out.println("<button>Atlantic Broadband</button><br>");
        out.println("<button>At&T U-verse</button><br>");
        out.println("<button>Blue Ridge Cable</button><br>");
        out.println("<button>CableAmerica</button><br>");
        out.println("<button>CenturyLink Prism TV</button><br>");
        out.println("<button>Charter Communications</button><br>");
        out.println("<button>Cincinnati Bell</button><br>");
        out.println("<button>Comcast Xfinity TV</button><br>");
        out.println("<button>Comporium</button><br>");
        out.println("<button>Cox Communications</button><br>");
        out.println("<button>DirecTV</button><br>");
        out.println("<button>Dish Network</button><br>");
        out.println("<button>Eagle Communications</button><br>");
        out.println("<button>Frankfort Plant Board Cable</button><br>");
        out.println("<button>Frontier Communications</button><br>");
        out.println("<button>GCI</button><br>");
        out.println("<button>Google Fiber</button><br>");
        out.println("<button>Grande</button><br>");
        out.println("<button>Time Warner Cable</button><br>");
        out.println("<button>Massillon Cable</button><br>");
        out.println("<button>Mid-Hudson Cable</button><br>");
        out.println("<button>NewWave Communications</button><br>");
        out.println("<button>OneLink</button><br>");
        out.println("<button>Optimum by Atlice</button><br>");
        out.println("<button>San Juan Cable</button><br>");
        out.println("<button>Service Electric Cable TV</button><br>");
        out.println("<button>Service Electric Cablevision</button><br>");
        out.println("<button>Service Electric Broadband Cable</button><br>");
        out.println("<button>Spectrum</button><br>");
        out.println("<button>SuddenLink by Atlice</button><br>");
        out.println("<button>SureWest</button><br>");
        out.println("<button>Time Warner Cable</button><br>");
        out.println("<button>Verizon FiOS TV</button><br>");
        out.println("<button>Wave Broadband</button><br>");
        out.println("<button>WEHCO video</button><br>");
        out.println("<button>WOW!</button><br>");
        out.println("<h1>List of all streaming cable providers:</h1>");
        out.println("<button>DirecTV Stream</button><br>");
        out.println("<button>Fubo TV</button><br>");
        out.println("<button>Hulu Plus Live TV</button><br>");
        out.println("<button>Philo</button><br>");
        out.println("<button>Sling TV</button><br>");
        out.println("<button>YouTube TV</button><br>");
        //out.println("");
        out.println("</body><form></html><br>");
    }

    public void destroy() {
    }
}
