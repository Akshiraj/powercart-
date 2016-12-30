<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN FORM</title>
<style>
body
{
background-color: grey
}
button {
    background-color:blue;
    color: white;
    cursor: pointer;
}
</style>
</head>
<body>

${message} 
<br>
<form action="validate">
<div align="center">
<table>
<tr>
USERNAME:<input type="text" name=id>
<br>

PASSWORD:<input type="password" name=password>
<br>
<button type="submit">Login</button> 
</tr>
</table>
</div>

</form>

</body>
</html>