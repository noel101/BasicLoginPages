<!--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Beans Success output Page</title>
</head>


<body> 

<jsp:useBean id="pInfo" class="PersonalInfoBean" scope="session" />
     <font color=black size=5> First name </font>
     <jsp:getProperty property="firstName" name="pInfo"/><br/> 
	
	<% Object obj =request.getAttribute("errors");
	String errorMsg ="";
	if(obj!=null){
		errorMsg =(String)obj;
	}
	%>
	
	
	
	
	<!-- <center><font color=red size=20>Success Page for Beans</font></center> <br/> -->	
		
		
		
		
		
 	 <font color=black size=5> First name		: <%=session.getAttribute("first_name") %> </font> <br/>
	<font color=black size=5> Last name 		: <%=session.getAttribute("last_name") %> </font><br/>
	<font color=black size=5> Address 			: <%=session.getAttribute("_address") %> </font><br/>
	<font color=black size=5> City 	   			: <%=session.getAttribute("_city") %> </font><br/>
	<font color=black size=5> State 	  	 	: <%=session.getAttribute("_state") %> </font><br/>
	<font color=black size=5> Phone 	   		: <%=session.getAttribute("_phone") %> </font><br/>
	<font color=black size=5> Bank Name 		: <%=session.getAttribute("bank_name") %> </font><br/>
	<font color=black size=5> Account Name 		: <%=session.getAttribute("account_name") %> </font><br/>
	<font color=black size=5> SSN 				: <%=session.getAttribute("_ssn") %></font>	  
	
	
	
</body>
</html>