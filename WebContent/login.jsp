<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@  page import="controler.*" %>
     <%@  page import="java.util.List" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Debut.do" method="post">
Login:<br>
<input type="text" name="login" />
<br>
Password:<br><input type="text" name="pass" />
<br>
<input type="submit" value="envoyer" />
</form>
</body>
</html>