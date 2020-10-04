<!-- JSP demo representation of include file and page from JSP2 and JSP3 Question 4 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP 1 demo</title>
</head>
<body>

<h1> This is the demo representation of includes from JSP 2 and Jsp 3</h1>
<%@ include file="jsp2.jsp" %>
<jsp:include page = "jsp3.jsp"/>

</body>
</html>