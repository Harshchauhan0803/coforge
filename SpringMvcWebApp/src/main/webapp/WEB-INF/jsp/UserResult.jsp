
<%@page import="coforge.com.model.User"%>
<%
User user=(User) request.getAttribute("user");
%>

<div>
Id is 
<%=user.getId()%>
</div>

<div>
Name is 
<%=user.getName()%>
</div>