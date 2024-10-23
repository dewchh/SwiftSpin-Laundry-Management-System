<%@page import="project.ConnectionProvider" %>
<%@page import="java.sql.*" %>
<%@include file="adminHeader.jsp" %>
<%@include file="../footer.jsp" %>

<html>
<head>
    <link rel="stylesheet" href="css/userStyle.css">
    <title>Add New User</title>
</head>
<body>
<%
String msg = request.getParameter("msg");
if ("done".equals(msg)) {
%>
    <h3 class="alert">User Added Successfully!</h3>
<%} %>
<%
if ("wrong".equals(msg)) {
%>
    <h3 class="alert">Something went wrong! Try Again!</h3>
<%} %>
<%
int id = 1;
try {
    Connection con = ConnectionProvider.getCon();
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select max(id) from user");
    while (rs.next()) {
        id = rs.getInt(1);
        id = id + 1;
    }
    con.close(); // Close the database connection when done
} catch (Exception e) {
    // Handle the exception (log it or display an error message)
    e.printStackTrace();
}
%>

<form action="AddNewUserServlet" method="post">
    <h3 style="color: yellow;">New User: <%= id %></h3>
    <input type="hidden" name="id" value="<%= id %>">

    <div class="left-div">
        <h3>Enter Name</h3>
        <input class="input-style" type="text" name="name" placeholder="Enter Name" required>
        <hr>
    </div>

    <div class="right-div">
        <h3>Enter Date Of Birth</h3>
        <input class="input-style" type="date" name="dateOfbirth" placeholder="Enter Date of Birth" required>
        <hr>
    </div>

    <div class="left-div">
        <h3>Enter Address</h3>
        <input class="input-style" type="text" name="address" placeholder="Enter Address" required>
        <hr>
    </div>

    <div class="right-div">
        <h3>Enter Mobile Number</h3>
        <input class="input-style" type="number" name="mobile_number" placeholder="Enter Mobile Number" required>
        <hr>
    </div>

    <button class="button">Save <i class='far fa-arrow-alt-circle-right'></i></button>
</form>
</body>
<br><br><br>
</html>
