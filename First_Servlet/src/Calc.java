

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calc
 */
@WebServlet("/Calc")
public class Calc extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out  = response.getWriter();
		  response.setContentType("text/html");
		  
		  String n1 = request.getParameter("n1");
		  String n2 = request.getParameter("n2");
		  String A = request.getParameter("text");
		  out.println(A);
		  double x = Double.parseDouble(n1);
	//	  int y = Integer.parseInt(n2);
		  double y = Double.parseDouble(n2);
		  
		  out.println("<h1 align='center'>Addition is "+(x+y)+"</h1>");
		  
		
				
	}

}
