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
<form action="${pageContext.request.contextPath}/condition.jsp">
Do You Like Movies?<br>
<input type="radio" name="movieCheck" value="yes"/> YES &nbsp;&nbsp;
<input type="radio" name="movieCheck" value="no"/> NO<br>
<input type="submit" name="submit"/>
</form>
<c:if test="${param.movieCheck=='yes'}">
Ok! Great choce.
</c:if>
<c:if test="${param.movieCheck=='no'}">
oops! perhaps you can try watching 
</c:if> 
</body>
</html>