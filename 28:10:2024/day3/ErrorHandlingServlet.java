package day3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/errorHandling")
public class ErrorHandlingServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			int result = 10 / 0;

		} catch (Exception e) {
			request.setAttribute("errorMessage", e.getMessage()); 
			request.getRequestDispatcher("/error.jsp").forward(request, response); 
		}
	}
}
