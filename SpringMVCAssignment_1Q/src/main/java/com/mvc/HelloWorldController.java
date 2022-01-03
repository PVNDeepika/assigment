package com.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("url-patterns=/HelloWorldController")
public class HelloWorldController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException {
		
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>First Program</title>");
		out.println("<head>");
		out.println("<body>");
		out.println("Hello World");
		out.print("</body>");
		out.println("</html>");
		
	}

}
