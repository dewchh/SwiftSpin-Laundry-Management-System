<%@page import="project.ConnectionProvider" %>

<%@page import="java.sql.*" %>
<%@include file="adminHeader.jsp" %>
<%@include file="../footer.jsp" %>
<html>
<head>
<link rel="stylesheet" href="css/userStyle.css">
<title>Add New User</title>
<style>
.back
{
  color: white;
  margin-left: 2.5%
}
</style>
</head>
<body>
 <h2><a class="back" href="User.jsp"><i class="fa fa-arrow-circle-left" aria-hidden="true">Back</i></a></h2>
<%
String id=request.getParameter("id");
try
{
	Connection con=ConnectionProvider.getCon();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select *from user where id='"+id+"'");
	while(rs.next())
	{

%>
<form action="EditUserServlet" method="post" >
<input type="hidden" name="id" value="<% out.println(id); %>">
<div class="left-div">
 <h3>Enter Name</h3>
<input Class="input-style" type="text" name="name" value="<%=rs.getString(2)%>" required>
<hr>
</div>

<div class="right-div">
<h3>Enter DateOfbirth</h3>
<input Class="input-style" type="date" name="dateOfbirth" value="<%=rs.getString(3)%>" required>
<hr>
</div>

<div class="left-div">
<h3>Enter Address</h3>
 <input Class="input-style" type="text" name="address" value="<%=rs.getString(4)%>" required>
<hr>
</div>
<div class="right-div">
<h3>Mobile Number</h3>
 <input Class="input-style" type="number" name="mobile_number" value="<%=rs.getString(5)%>" required>


 <hr>
</div>
<button class="button">Save <i class="fa fa-arrow-circle-right" aria-hidden="true"></i></button>
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