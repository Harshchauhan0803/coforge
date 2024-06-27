<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int x=10;
int y =20;
int addition(int a,int b){
	return a+b;
}%>

<div>No1 is
<%=x %>
</div>

<div>No2 is
<%=y %>
</div>

<div>Addition is
<%=x+y %>
</div>

<div>Addition is
<%=addition(x,y)%>
</div>
<div>
<%
out.println("<br>no1 is "+x);
out.println("<br>no2 is "+y);
out.println("<br>sum is "+addition(x,y));
%>
</div>
</body>
</html>