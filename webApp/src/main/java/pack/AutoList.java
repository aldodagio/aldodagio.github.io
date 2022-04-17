package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
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
import exception.AutoException;
import model.Automobile;

/**
 * Servlet implementation class AutoList
 */
@WebServlet("/AutoList")
public class AutoList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutoList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		  /*response.setContentType("text/html");
		    PrintWriter out = response.getWriter();
		    String docType =
		      "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
		      "Transitional//EN\">\n";
		    out.println(docType +
		                "<HTML>\n" +
		                "<HEAD><TITLE>Hello</TITLE></HEAD>\n" +
		                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
		                "<H1>Hello</H1>\n" +
		                "</BODY></HTML>");*/
			AutoServable a1 = new BuildAuto();
			a1.serve(0);
			
			
			ServletOutputStream out = response.getOutputStream();
		    StoreAutos a2 = new BuildAuto();
		   
		    String auto = null;
		    Collection<Automobile> c = a2.getValues();
		    out.println("<html>");
		    out.println("<head>");
		    out.println("<title>Welcome</title>");
		    out.println("</head>");
		    out.println("<body>");
		    out.println("<h1>Basic Car Choice</h1>");
		    out.println("<form method=POST action=PleaseWork>");
		    out.println("<p>Make/Model");
		    out.println("<select name=auto>");
		    for(Automobile a3 : c)
		    {
		    out.println("<option value=\""+a3.getAuto()+"\">"+a3.getAuto()+"</option>");
		    	auto = a3.getAuto();
		    	
		    }
		    out.println("</select>");
		    out.println("</p>");
		  
		    out.println("<p>Transmission");
		    out.println("<select name=transmission>");
		    out.println("<option value=Manual>Manual</option>");
		    out.println("<option value=Automatic>Automatic</option>");
		    out.println("</select>");
	 	    out.println("</p>");
	 	    out.println("</select>");
		    out.println("</p>");
		    out.println("<p>Brakes");
		    out.println("<select name=brakes>");
		    out.println("<option value=Regular>Regular</option>");
		    out.println("<option value=Air Brake System>Air Brake System</option>");
		    out.println("<option value=Air Brake System w/ Traction>Air Brake System w/ Traction</option>");
		    out.println("</select>");
	 	    out.println("</p>");
	 	    out.println("<p>Color");
	 	    out.println("<select name=color>");
	 	    out.println("<option value=\"Fort Knox Gold Clearcoat Metallic\">Fort Knox Gold Clearcoat Metallic</option>");
	 	    out.println("<option value=\"Liquid Grey Clearcoat Metallic\">Liquid Grey Clearcoat Metallic</option>");
	 	    out.println("<option value=\"Infra-Red Clearcoat\">Infra-Red Clearcoat</option>");
	 	    out.println("<option value=\"Grabber Green Clearcoat Metallic\">Grabber Green Clearcoat Metallic</option>");
	 	    out.println("<option value=\"Sangria Red Clearcoat Metallic\">Sangria Red Clearcoat Metallic</option>");
	 	    out.println("<option value=\"French Blue Clearcoat Metallic\">French Blue Clearcoat Metallic</option>");
	 	    out.println("<option value=\"Twilight Blue Clearcoat Metallic\">Twilight Blue Clearcoat Metallic</option>");
	 	    out.println("<option value=\"CD Silver Clearcoat Metallic\">CD Silver Clearcoat Metallic</option>");
	 	    out.println("<option value=\"Pitch Black Clearcoat\">Pitch Black Clearcoat</option>");
	 	    out.println("<option value=\"Cloud 9 White Clearcoat\">Cloud 9 White Clearcoat</option>");
	 	    out.println("</select>");
	 	    out.println("</p>");
	 	    out.println("<p>Air Bags");
		    out.println("<select name=\"air bags\">");
		    out.println("<option value=Present>Present</option>");
		    out.println("<option value=Not Present>Not Present</option>");
		    out.println("</select>");
	 	    out.println("</p>");
	 	    out.println("<p>Moon Roof");
		    out.println("<select name=\"moon roof\">");
		    out.println("<option value=Present>Present</option>");
		    out.println("<option value=Not Present>Not Present</option>");
		    out.println("</select>");
	 	    out.println("</p>");
	 	    
		   
		    //session.setAttribute(auto, a2.findHashLink(auto));
		    /*out.println("</select>");
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
		    }*/
		  
		    out.println("<input type=\"submit\" value=\"Done\">");
		    out.println("</form>");
		    out.println("</body>");
		    out.println("</html>");
		    out.close();
		    
		    //response.sendRedirect("jsp/javaJSP.jsp");
		    
		    RequestDispatcher rd = request.getRequestDispatcher("javaJSP.jsp");
          
            rd.forward(request, response);
     
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		AutoServable a1 = new BuildAuto();
		a1.serve(0);
		
		
		String auto = request.getParameter("auto");
		//String transmission = request.getParameter("transmission");
		//String brakes = request.getParameter("brakes");
		//String color = request.getParameter("color");
		//String airBags = request.getParameter("air bags");
		//String moonRoof = request.getParameter("moon roof");
			ServletOutputStream out = response.getOutputStream();
		    StoreAutos a2 = new BuildAuto();
		    a2.findHashLink(auto);
		    Collection<Automobile> c = a2.getValues();
		    out.println("<html>");
		    out.println("<head>");
		    out.println("<title>Welcome</title>");
		    out.println("</head>");
		    out.println("<body>");
		    out.println("<h1>Basic Car Choice</h1>");
		    out.println("<form method=POST action=\"/PleaseWork\">");
		    out.println("<p>Make/Model");
		    out.println("<select name=\"auto\">");
		    for(Automobile a3 : c)
		    {
		    out.println("<option value=\""+a3.getAuto()+"\">"+a3.getAuto()+"</option>");
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
		   //out.println("</form>");
		    out.println("</body>");
		    out.println("</html>");
		    out.close();
		    
		    RequestDispatcher rd = request.getRequestDispatcher("javaJSP.jsp");
          
            rd.forward(request, response);
		
	
		
	}

}