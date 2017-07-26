package com.as.samples3;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class PersonalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public PersonalInfoServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 
		// Step 1  
		PersonalInfoBean personalInfoBean = new PersonalInfoBean();
		personalInfoBean.setFirstName(request.getParameter("firstname"));
		personalInfoBean.setLastName(request.getParameter("lastname"));
		
																				//String firstname=request.getParameter("firstname");

		
		HttpSession ses= request.getSession();
		ses.setAttribute("pInfo", personalInfoBean);

																				//ses.setAttribute("middle_name", middlename);
		response.sendRedirect("html/contactinfo.html");
		
		
		
		
		
	}

	
	

}
