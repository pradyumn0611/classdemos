<%@page import="jdk.internal.misc.FileSystemOption"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4> using scriptlet tag</h4>
<% for(int i=1;i<=10;i++)
	out.println(i); %>

<h3>
	declarative tag
</h3>
<%! 
int a,b;
int sampleFunction(int a)
{return a;}
%>
	
<%a=10; %>
<%b=sampleFunction(100); %>
<%out.println(b); %>

<h2> expression tag : out.println : no need of semicolon</h2>
<%!int count; %> #declarative
<%count++; %> #scriptlet
this page is access for<%=count %> #expression
</body>
</html>