<%@page import="project.ConnectionProvider" %>

<%@page import="java.sql.*" %>
<%@include file="../adminHeader.jsp" %>
<%@include file="../footer.jsp" %>
<html>
<head>
<link rel="stylesheet" href="css/addFinishedLaundryList-style.css">
<title>Add Finished Laundry</title>
<style>
.back
{
  color: white;
  margin-left: 2.5%
}
</style>
</head>
<body>
 <h2><a class="back" href="finishedLaundryList.jsp"><i class="fa fa-arrow-circle-left" aria-hidden="true">Back</i></a></h2>
<%
String id=request.getParameter("id");
try
{
	Connection con=ConnectionProvider.getCon();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select *from item where id='"+id+"'");
	while(rs.next())
	{

%>
<form action="editLaundryServlet" method="post" >
<input type="hidden" name="id" value="<% out.println(id); %>">
<div class="left-div">
 <h3>Enter Date</h3>
<input Class="input-style" type="date" name="date" value="<%=rs.getString(2)%>" required>
<hr>
</div>

<div class="right-div">
<h3>Enter Customer_Name</h3>
<input Class="input-style" type="text" name="customername" value="<%=rs.getString(3)%>" required>
<hr>
</div>

<div class="left-div">
<h3>Enter No Of Items</h3>
 <input Class="input-style" type="number" name="no_of_items" value="<%=rs.getString(4)%>" required>
<hr>
</div>

<div class="right-div">
<h3>Price</h3>
 <input Class="input-style" type="number" name="price" value="<%=rs.getString(5)%>" required>

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