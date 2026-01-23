package test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		/*To set the data coming from user to bean class*/
		
	   String n = request.getParameter("uname");	
	   String e = request.getParameter("email");
	   String c = request.getParameter("city");	
	   
	   /*To create Object of bean class*/
	   User u = new User();
	   u.setName(n);
	   u.setEmail(e);
	   u.setCity(c);
	   
	   request.setAttribute("user", u);
	   
	   request.getRequestDispatcher("details.jsp").forward(request, response);


	}

}
