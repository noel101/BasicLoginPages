


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SuccessServlet
 */
public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuccessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String address=request.getParameter("address");
//		String city=request.getParameter("city");
//		String state=request.getParameter("state");
//		String country=request.getParameter("country");
//		String phone=request.getParameter("phone");
//		
//		
//		// STEP 2:
//		
//		
//		// STEP 3:
//		
//		HttpSession ses= request.getSession();
//		ses.setAttribute("_address", address);
//		ses.setAttribute("_city", city);
//		ses.setAttribute("_state", state);
//		ses.setAttribute("_country", country);
//		ses.setAttribute("_phone", phone);
//		
//		response.sendRedirect("jsp/outputsuccess.jsp");
//		
		
	}

}
