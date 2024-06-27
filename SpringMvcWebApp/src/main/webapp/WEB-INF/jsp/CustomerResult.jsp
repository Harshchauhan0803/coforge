<%@page import="coforge.com.model.Customer"%>

<h1>Customer<span> Data</span></h1>
<style>

span{
background-color:black;
color:white;
border-radius:4px;
}

h1{
width:19.38%;
margin:auto;
background-color:#FF8C00;
border-radius:4px;
}

.hi{
width:50%;
height:50%;
margin-top:100px;
margin-left:310px;
border:2px solid black;
background-color:cyan;
}
</style>


<%@ page isELIgnored="false" %>
<div class="hi">

<div>
Naughty Data Nobody Shows it Betterrr!!!!
</div>
<div>
 Id is ${customer.id }
</div>

<div>
 Name is ${customer.name }
</div>

<div>
 Salary is ${customer.salary }
</div>

<div>
 You are <%
 Customer customer=(Customer) request.getAttribute("customer");
 for(String c:customer.getGender())
	 out.println(c+" ,");
 %>
</div>

<div>
 City is <%
 for(String c:customer.getCities())
	 out.println(c+" ,");
 %>
</div>

<div>
 Your hobbies is <%
 for(String c:customer.getHobbies())
	 out.println(c+" ,");
 %>
</div>

</div>