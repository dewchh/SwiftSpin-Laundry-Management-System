<%@page import="project.ConnectionProvider" %>
<%@page import="java.sql.*" %>
<%@include file="adminHeader.jsp" %>
<%@include file="../footer.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/addFinishedLaundryList-style.css">
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
<div style="color: white; text-align: center; font-size: 30px;">Finished Laundry List <i class='fab fa-elementor'></i></div>
<%
String  msg=request.getParameter("msg");
if("done".equals(msg))
{
%>
<h3 class="alert">Item Successfully updated !</h3>
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
            <th scope="col">Date</th>
            <th scope="col">Customer Name</th>
            <th scope="col">No Of Items</th>
            <th scope="col"><i class="fa fa-usd" aria-hidden="true"></i></i> Price</th>
           
            <th scope="col">Edit <i class="fa fa-pencil-square-o" aria-hidden="true"></i></th>
            <th scope="col">Delete <i class="fa fa-trash" aria-hidden="true"></i></th>
          </tr>
        </thead>
        <tbody>
       <%
       try{
    	   Connection con=ConnectionProvider.getCon();
    	   Statement st=con.createStatement();
    	   ResultSet rs=st.executeQuery("select * from item");
    	   while(rs.next())
    	   {
       %>
          <tr>
            <td><%=rs.getString(2) %></td>
            <td><%=rs.getString(3) %></td>
            <td><%=rs.getString(4) %></td>
            <td><i class="fa fa-usd" aria-hidden="true"></i><%=rs.getString(5) %> </i></td>
            
            <td><a href="editLaundry.jsp?id=<%=rs.getString(1) %>">Edit <i class="fa fa-pencil-square-o" aria-hidden="true"></i></a></td>
            <td><a href="deleteLaundry.jsp?id=<%=rs.getString(1) %>">Delete <i class="fa fa-trash" aria-hidden="true"></i></a></td>
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
