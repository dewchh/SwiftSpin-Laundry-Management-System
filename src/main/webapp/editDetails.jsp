<%@page import="project.ConnectionProvider" %>

<%@page import="java.sql.*" %>
<%@include file="header.jsp" %>
<%@include file="../footer.jsp" %>
<html>
<head>
<link rel="stylesheet" href="css/mStyle.css">
<title>Add User</title>
<style>
.back
{
  color: white;
  margin-left: 2.5%
}
</style>
</head>
<body>
 
<%
String id=request.getParameter("email");
try
{
	Connection con=ConnectionProvider.getCon();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select *from users where email='"+email+"'");
	while(rs.next())
	{

%>
<form action="EditDetailsServlet" method="post" >


<input type="hidden" name="email" value="<%= rs.getString("email") %>">

<div class="left-div">
 <h3>Enter Name</h3>
<input Class="input-style" type="text" name="name" value="<%=rs.getString(1)%>" required>
<hr>
</div>

<div class="right-div">
 <h3>Enter Address</h3>
<input Class="input-style" type="text" name="address"  required>
<hr>
</div>

<div class="left-div">
<h3>Enter Phone number</h3>
 <input Class="input-style" type="number" name="mobileNumber" value="<%=rs.getString(3)%>" required>
<hr>
</div>

<div class="right-div">
<h3>Password</h3>
 <input Class="input-style" type="password" name="password" value="<%=rs.getString(6)%>" required>

 <hr>
</div>
<button class="button">Update <i class="fa fa-arrow-circle-right" aria-hidden="true"></i></button>
</form>
<%
}
}
catch(Exception e)
{
	System.out.println(e);
}
%>

</body>
<br><br><br>
</body>
</html>