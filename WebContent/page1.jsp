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

<form action="page1.do" method="post">
<a href="goodby.do"> <span style="color:blue">logout</span></a>

Welcome  <span style="color:red"> <%  
 session = request.getSession();



String nom = (String) session.getAttribute( "nom" ); 

out.println(nom);%></span><br>
Attribut1:<br>
<input type="text" name="attribut1" />
<br>
Attribut2:<br><input type="text" name="attribut2" />
<br>
<input type="submit" value="envoyer" />
</form>
</body>
</html>