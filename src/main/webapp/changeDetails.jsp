<%@page import="project.ConnectionProvider" %>
<%@page import="java.sql.*" %>
<%@include file="header.jsp" %>
<%@include file="../footer.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<style>
h3
{
	color: yellow;
	text-align: center;
}
</style>
</head>
<body>
<div style="color: white; text-align: center; font-size: 30px;">Change Details<i class='fab fa-elementor'></i></div>
<%
String  msg=request.getParameter("msg");
if("done".equals(msg))
{
%>
<h3 class="alert">Details Successfully Changed!</h3>
<%} %>
<%
if("wrong".equals(msg))
{
%>
<h3 class="alert">Some thing went wrong! Try again!</h3>
<%} %>
<table>
        <thead>
          <tr>
            <th scope="col">Name</th>
           
            <th scope="col">Address</th>
            <th scope="col">Phone number</th>
            <th scope="col">Password</th>
            <th scope="col">Edit <i class="fa fa-pencil-square-o" aria-hidden="true"></i></th>
            <th scope="col">Delete <i class="fa fa-trash" aria-hidden="true"></i></th>
          </tr>
        </thead>
        <tbody>
       <%
       try{
    	   Connection con=ConnectionProvider.getCon();
    	   Statement st=con.createStatement();
    	   ResultSet rs=st.executeQuery("select * from users");
    	   while(rs.next())
    	   {
       %>
          <tr>
            <td><%=rs.getString(1) %></td>
          
            <td><%=rs.getString(7) %></td>
            <td><%=rs.getString(3) %></td>
            <td><%=rs.getString(6) %></td>
            
         <td><a href="editDetails.jsp?email=<%= rs.getString(2) %>">Edit  <i class="fa fa-pencil-square-o" aria-hidden="true"></i></a></td>
         
        <td><a href="deleteDetails.jsp?email=<%= rs.getString(2) %>">Delete  <i class="fa fa-trash" aria-hidden="true"></i></a></td>
          </tr>
          <%
          }
          }
          catch(Exception e)
         {
          System.out.println(e);
         }%>
         
        </tbody>
      </table>
      <br>
      <br>
      <br>

</body>
</html>