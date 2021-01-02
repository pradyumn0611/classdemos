<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="employee" class="com.yash.jstlproblem3.model.Employee" scope="request">
<jsp:setProperty name="employee" property="*"/>
<c:out value="${employee.name}" default="Name not set"></c:out>
</jsp:useBean>
</body>
</html>