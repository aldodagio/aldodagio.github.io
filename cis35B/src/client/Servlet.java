package client;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import adapter.BuildAuto;
//import adapter.*;
import adapter.StoreAutos;
import model.Automobile;


 
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void service() {
		
	}
       
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		
		DefaultSocketClient client = new DefaultSocketClient("127.0.0.1", 3230);
		client.start();
		
		String auto = request.getParameter("auto");
		String transmission = request.getParameter("transmission");
		String brakes = request.getParameter("brakes");
		String color = request.getParameter("color");
		String airBags = request.getParameter("air bags");
		String moonRoof = request.getParameter("moon roof");
		
		
		ServletOutputStream out = response.getOutputStream();
	    String fileName = request.getParameter("file");
	    
	    StoreAutos a2 = new BuildAuto();
	    a2.findHashLink(auto);
	    Collection<Automobile> c = a2.getValues();
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Welcome</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h1>Basic Car Choice</h1>");
	    out.println("<form method=POST action=\"/Servlet\">");
	    out.println("<p>Make/Model");
	    out.println("<select name=\"auto\">");
	    for(Automobile a1 : c)
	    {
	    out.println("<option value=\""+a1.getAuto()+"\">"+a1.getAuto()+"</option>");
	    }
	    out.println("</select>");
	    out.println("</p>");
	    for(int i = 0; i < a2.findHashLink(auto).getOptSetLen(); i++)
	    {
	    	out.println("<select name=\""+a2.findHashLink(auto).getOptSetName(i)+"\">");
	    	for(int j = 0; j < a2.findHashLink(auto).getOptionLen(i); j++)
	    	{
	    	out.println("<option value=\""+a2.findHashLink(auto).getOptName(i, j)+"\">"+a2.findHashLink(auto).getOptName(i, j)+"</option>");
	    	}
	    	 out.println("</select>");
	 	    out.println("</p>");
	    }
	    //out.println("<option value=\"Ferrari 488 Spider 2017\">Ferrari 488 Spider 2017</option>");
	    //out.println("<option value=\"Ford Focus Wagon ZTW 2015\">Ford Focus Wagon ZTW 2015</option>");
	    out.println("<input type=\"submit\" value=\"done\">");
	    out.println("</form>");
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	    response.sendRedirect("jsp/javaJSP.jsp");
	}

}

/*DefaultSocketClient client = new DefaultSocketClient("127.0.0.1", request.getServerPort());

client.start();

		
String auto = request.getParameter("auto");
String transmission = request.getParameter("transmission");
String brakes = request.getParameter("brakes");
String color = request.getParameter("color");
String airBags = request.getParameter("air bags");
String moonRoof = request.getParameter("moon roof");
	
StoreAutos a2 = new BuildAuto();

a2.findHashLink(auto);

a2.findHashLink(auto).setOptionChoice("transmission", transmission);
a2.findHashLink(auto).setOptionChoice("brakes", brakes);
a2.findHashLink(auto).setOptionChoice("color", color);
a2.findHashLink(auto).setOptionChoice("air bags", airBags);
a2.findHashLink(auto).setOptionChoice("moon roof", moonRoof);

a2.findHashLink(auto).getOptionChoice("transmission");
a2.findHashLink(auto).getOptionChoice("brakes");
a2.findHashLink(auto).getOptionChoice("color");
a2.findHashLink(auto).getOptionChoice("air bags");
a2.findHashLink(auto).getOptionChoice("moon roof");

a2.findHashLink(auto).getOptionChoicePrice("transmission");
a2.findHashLink(auto).getOptionChoicePrice("brakes");
a2.findHashLink(auto).getOptionChoicePrice("color");
a2.findHashLink(auto).getOptionChoicePrice("air bags");
a2.findHashLink(auto).getOptionChoicePrice("moon roof");

response.sendRedirect("jsp/java.jsp");

//AutoServable a1 = new BuildAuto();
//a1.serve(0);*/
