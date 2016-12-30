<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HOME</title>
</head>
<body>
${errormsg}
<br>
<c:if test="${empty successmsg}">

<a href="login">login </a>
<br>
<a href="register"> register</a>
</c:if>

${successmsg}


 <c:if test="${showloginpage}">
<jsp:include page="login.jsp"/> 
</c:if>

<c:if test="${errormsg}">
<jsp:include page="login.jsp"/> 
</c:if>


<c:if test="${showregisterpage}">
<jsp:include page="register.jsp"/> 

</c:if>




</body>
</html>