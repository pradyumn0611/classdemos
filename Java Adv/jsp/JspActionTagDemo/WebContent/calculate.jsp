<%@page import="org.apache.catalina.tribes.ChannelSender"%>
<%@page errorPage="home.html"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculate</title>
</head>
<body>
	<%
String submit=request.getParameter("submit"); 
if (submit.equals("Add"))
{
%>
	<jsp:forward page="/addjsp.jsp"/>
	<% 
}
if(submit.equals("Sub")) 
{
%>
	<jsp:forward page="/subjsp.jsp"/>
	<%}
else 
{
%>
	<jsp:forward page="/home.html"/>
	<%}
%>
</body>
</html>