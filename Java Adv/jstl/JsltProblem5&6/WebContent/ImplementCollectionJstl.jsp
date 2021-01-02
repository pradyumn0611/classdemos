<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List productList=new ArrayList();
	productList.add("Laptop");
	productList.add("car");
	productList.add("mobile");
	productList.add("bike");
	productList.add("seed");
	request.setAttribute("productList",productList);
	
	Set languages=new HashSet();
	languages.add("hindi");
	languages.add("english");
	languages.add("punjabi");
	request.setAttribute("lang",languages);
	
	
%>
Products in list are:
<c:forEach items="${productList}" var="product" varStatus="status">

<br>
<c:out value="${product}"/>
</c:forEach>
<br>
Index with Products in list are:<br>
<c:forEach items="${productList}" var="product" varStatus="status">

<c:out value="${productList[status.index]}"/> is at index <c:out value="${status.index}"></c:out>
<br>
</c:forEach>
<br>
values in set:
<c:forEach items="${lang}" var="l">
<c:out value="${l}"/>
</c:forEach>
<%
Map stateCapital=new HashMap();
stateCapital.put("mp","bhopal");
stateCapital.put("up","lakhnow");
stateCapital.put("hp","shimla");
stateCapital.put("ap","itanagar");
stateCapital.put("goa","pubji");
request.setAttribute("stc",stateCapital);
%>
<br>
<c:forEach items="${stc}" var="entry" varStatus="status">
<c:out value="${entry.key}"/> --- <c:out value="${entry.value}"  escapeXml="false"/><br>
</c:forEach>

</body>
</html>