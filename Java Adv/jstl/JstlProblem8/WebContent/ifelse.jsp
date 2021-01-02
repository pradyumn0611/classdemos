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
<c:set var="weight" value="14"/>

<c:choose>
<c:when test="${weight==null}"> Weight is not provided for this product</c:when>
<c:when test="${weight<0}"> Incorrect Weight it can't be negative</c:when>
<c:when test="${weight==0}"> Incorrect Weight it can't be zero</c:when>
<c:otherwise> weight of product is : <c:out value="${weight}"/></c:otherwise>
</c:choose>
</body>
</html>