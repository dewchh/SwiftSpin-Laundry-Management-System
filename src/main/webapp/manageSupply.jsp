<%@page import="project.ConnectionProvider" %>
<%@page import="java.sql.*" %>
<%@include file="adminHeader.jsp" %>
<%@include file="../footer.jsp" %>


<html>
<head>
<link rel="stylesheet" href="css/mStyle.css">
<title>Manage Supply</title>
</head>
<body>
<%
String msg=request.getParameter("msg");
if("done".equals(msg))
{
%>

<h3 class="alert">Data Added Successfully!</h3>
<%} %>
<%
if("wrong".equals(msg))
{
%>


<h3 class="alert">Some thing went wrong! Try Again!</h3>
<%} %>
<%
int id=1;
try
{
	Connection con=ConnectionProvider.getCon();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select max(id) from supply");
	while(rs.next())
	{
		id=rs.getInt(1);
		id=id+1;
	}
	
	}
catch(Exception e)
{}
%>

<form action="manageSupplyServlet" method="post">


<h3 style="color: yellow;">Supply ID: <%out.println(id); %> </h3>
<input type="hidden" name="id" value="<%out.println(id); %>">


<div class="left-div">
 <h3>Enter Date</h3>
 <input class="input-style" type="date" name="date" placeholder="Enter Date" required>
 
<hr>
</div>

<div class="right-div">
<h3>Enter Name</h3>
 <input class="input-style" type="text" name="name" placeholder="Enter Name" required>
 
<hr>
</div>

<div class="left-div">
<h3>Enter Category</h3>
 <input class="input-style" type="text" name="category" placeholder="Enter Category" required>
 
<hr>
</div>

<div class="right-div">
<h3>Quantity</h3>
 <input class="input-style" type="number" name="quantity" placeholder="Enter Quantity" required>
   
<hr>
</div>
 <button class="button">Save <i class="fa fa-arrow-circle-right" aria-hidden="true"></i></button>
</form>
</body>
<br><br><br>
</body>
</html>