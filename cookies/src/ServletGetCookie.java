

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletGetCookie
 */
@WebServlet("/ServletGetCookie")
public class ServletGetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletGetCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie[] galletitas = request.getCookies();
		
		for(Cookie c: galletitas){
			String[] datos = c.getValue().split(":");
			response.getWriter().write("Usuario: " + datos[0]); // c.getName() + ":" +
			response.getWriter().write("Contraseña: " + datos[1]);
		}
		
	}

}
