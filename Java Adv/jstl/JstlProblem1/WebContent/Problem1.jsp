<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
Username :
<input type="text" id ="username" name="username">
<input type="submit" id="submit" name="submit">
</form>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<p>Hello,<c:out default="Guest" value="${param['username']}" />!</p>


</body>
</html>