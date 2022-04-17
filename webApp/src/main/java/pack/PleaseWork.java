package pack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import adapter.AutoServable;
import adapter.BuildAuto;
import adapter.CreateAuto;
import adapter.StoreAutos;
import client.DefaultSocketClient;
import exception.AutoException;
import model.Automobile;

/**
 * Servlet implementation class PleaseWork
 */
@WebServlet("/PleaseWork")
public class PleaseWork extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PleaseWork() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			response.sendRedirect("jsp/javaJSP.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

		
	
		String auto = request.getParameter("auto");
		StoreAutos a2 = new BuildAuto();
		Automobile test = a2.findHashLink(auto);
		//Automobile a5 = new Automobile(a2.findHashLink(auto).getMake(), a2.findHashLink(auto).getModel(), a2.findHashLink(auto).getBasePrice(), 5);
		String transmission = request.getParameter("transmission");
		String brakes = request.getParameter("brakes");
		String color = request.getParameter("color");
		String airBags = request.getParameter("air bags");
		String moonRoof = request.getParameter("moon roof");
		
		
		HttpSession session = request.getSession();
		session.getAttribute(auto);
		session.getAttribute(transmission);
		session.getAttribute(brakes);
		session.getAttribute(color);
		session.getAttribute(airBags);
		session.getAttribute(moonRoof);
		
		
		
		
		
		test.setOptionChoice("transmission", transmission);
		test.setOptionChoice("brakes", brakes);
		test.setOptionChoice("color", color);
		test.setOptionChoice("air bags", airBags);
		test.setOptionChoice("moon roof", moonRoof);

		test.getOptionChoice("transmission");
		test.getOptionChoice("brakes");
		test.getOptionChoice("color");
		test.getOptionChoice("air bags");
		test.getOptionChoice("moon roof");

		test.getOptionChoicePrice("transmission");
		test.getOptionChoicePrice("brakes");
		test.getOptionChoicePrice("color");
		test.getOptionChoicePrice("air bags");
		test.getOptionChoicePrice("moon roof");
		
		
		
		ServletOutputStream out = null;
		try {
			out = response.getOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //String fileName = request.getParameter("file");

			out.println("<html>");
			out.println("<head>");
		    //out.println("<style>");
		    out.println("<table width = \"100%\" border = \"1\" align = \"center\">\n");
		    //out.println(" </style>");
		    out.println("</head>");
			out.println("<body>");
			out.println("<h1>Here is what you configured:</h1>");
			out.println("<tr>");
			out.println("<th> Choices </th>");
			out.println("<th> Selections Made </th>");
			out.println("<th> Total Price </th>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>" + test.getAuto() + "</td>");
			out.println("<td> base price </td>");
			out.println("<td>" + test.getBasePrice() + "</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td> Transmission </td>");
			out.println("<td>" + test.getOptionChoice("transmission") + "</td>");
			out.println("<td> $" + test.getOptionChoicePrice("transmission") + "</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td> Brakes </td>");
			out.println("<td>" + test.getOptionChoice("brakes") + "</td>");
			out.println("<td> $" + test.getOptionChoicePrice("brakes") + "</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td> Color </td>");
			out.println("<td>" + test.getOptionChoice("color") + "</td>");
			out.println("<td> $" + test.getOptionChoicePrice("color") + "</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td> Air Bags </td>");
			out.println("<td>" + test.getOptionChoice("air bags") + "</td>");
			out.println("<td> $" + test.getOptionChoicePrice("air bags") + "</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td> Moon Roof </td>");
			out.println("<td>" + test.getOptionChoice("moon roof") + "</td>");
			out.println("<td> $" + test.getOptionChoicePrice("moon roof") + "</td>");
			out.println("</tr>");
			out.println("<td> Total Price </td>");
			out.println("<td> </td>");
			out.println("<td> $" + test.getTotalPrice() + "</td>");
			out.println("</tr>");
			/*out.println("<p>Make/Model");
			out.println("<select name=\"auto\">");
			out.println("<option value=\""+auto+"\">"+auto+"</option>");
			out.println("</select>");
			out.println("</p>");
			out.println("<p>Transmission");
			out.println("<select name=\""+"transmission"+"\">");
			out.println("<option value=\""+transmission+"\">"+transmission+"</option>");
			out.println("</select>");
			out.println("</p>");
			out.println("<p>Brakes");
			out.println("<select name=\""+"brakes"+"\">");
			out.println("<option value=\""+brakes+"\">"+brakes+"</option>");
			out.println("</select>");
			out.println("</p>");
			out.println("<p>Color");
			out.println("<select name=\""+"color"+"\">");
			out.println("<option value=\""+color+"\">"+color+"</option>");
			out.println("</select>");
			out.println("</p>");
			out.println("<p>Air Bags");
			out.println("<select name=\""+"air bags"+"\">");
			out.println("<option value=\""+airBags+"\">"+airBags+"</option>");
			out.println("</select>");
			out.println("</p>");
			out.println("<p>Moon Roof");
			out.println("<select name=\""+"moon roof"+"\">");
			out.println("<option value=\""+moonRoof+"\">"+moonRoof+"</option>");
			out.println("</select>");*/
			out.println("</p>");
			out.println("</form>");
			out.println("</body>");
			out.println("</html>");
			out.close();
			
			response.sendRedirect("jsp/javaJSP.jsp");
			
	}

}
