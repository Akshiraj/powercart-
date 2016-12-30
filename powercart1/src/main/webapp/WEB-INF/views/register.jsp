<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${message}

<form action="validate">

NAME:<input type="text" name="name">
<br>

MAIL ID:<input type="text" name="id">
<br>
USER NAME:<input type="text" name="username">
<br>

PASSWORD:<input type="password" name="passwword">
CONFIRM PASSWORD:<input type="password" name="passwword">
<br>
MOBILE NUMBER:<input type="text" name="mobile">
<br>
CITY:<input type= "text" name="city">
<br>
<button type="submit">Register</button>


</form>

</body>
</html>