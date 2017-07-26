package com.as.samples3;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class BankInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public BankInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		// STEP 1:
		PersonalInfoBean personalInfoBean = (PersonalInfoBean) request.getSession().getAttribute("personalInfoBean");
		if(personalInfoBean==null){
			personalInfoBean=new PersonalInfoBean();
		}
		personalInfoBean.setBankName(request.getParameter("bankname"));
		personalInfoBean.setAccountNumber(request.getParameter("accountname"));
		personalInfoBean.setSsn(request.getParameter("ssn"));
		
				
				
				// STEP 2:
				
				
				// STEP 3:
				
				HttpSession ses= request.getSession();
				ses.setAttribute("pInfo", personalInfoBean);
				
				
				
				response.sendRedirect("jsp/outputsuccess.jsp");
		
	}

}
