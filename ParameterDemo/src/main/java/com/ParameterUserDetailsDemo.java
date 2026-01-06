package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ParameterUserDetailsDemo
 */
@WebServlet("/ParameterUserDetailsDemo")
public class ParameterUserDetailsDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParameterUserDetailsDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("username");
		String age = request.getParameter("age");
		String city = request.getParameter("city");
		String education = request.getParameter("education");

		pw.println("<html><body>");
		pw.println("<h1>User Details:-</h1>");
		pw.println("<h2>Name: " +name+"</h2>");
		pw.println("<h2>Age: " +age+"</h2>");
		pw.println("<h2>City: " +city+"</h2>");
		pw.println("<h2>Education: " +education+"</h2>");

		pw.println("</body></html>");
		pw.close();
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
