<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>result.jsp</title>
</head>
<body>
<%
	String result=request.getParameter("result");
	String submit=request.getParameter("submit");
	if (submit.equals("Add"))
	{
		
%>
	RESULT of Add is :<%=result%>
<%
	}
	else if(submit.equals("Sub"))
	{
%>
	RESULT of sub is:<%=result%>
<%
	}
%>
<jsp:include page="/home.html"/>
</body>
</html>