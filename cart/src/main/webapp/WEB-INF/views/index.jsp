<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Registration page</title>
</head>
<body>

<form:form action="./register" commandName ="register" method="post">
<table>
<tr>
<td><form:input type=text path="id" placeholder=userId/></td>

<td><form:input type=text path="name" placeholder=Name/></td>

<td><form:input type=text path="mailId" placeholder=mailId/></td>

<td><form:input type=text path="password" placeholder=password/></td>

<td><form:input type=text path="billingAddress" placeholder=BillingAddress/></td>

<td><form:input type=text path="shippingAddress" placeholder=ShippingAddress/></td>

<td><form:input type=text path="mobileNumber" placeholder=MobileNumber/></td>

<td><form:input type=text path="role" placeholder=Role/></td>

<input type="submit" value="register" >

</table>
</form:form>

</body>
</html>