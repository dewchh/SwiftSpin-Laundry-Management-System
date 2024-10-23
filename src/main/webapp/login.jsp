<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/signup-style.css">
<title>Login</title>
</head>
<body>
<div id='container'>
  <div class='signup'>
     <form action="loginServlet"method="post">
     <input type="email" name="email" placeholder="Enter Email" required>
     <input type="password" name="password" placeholder="Enter password" required >
     <input type="submit" value="login">
     
     
     </form>
      <h2><a href="signup.jsp">SignUp</a></h2>
       <img src= "https://i.pinimg.com/564x/8e/38/9e/8e389e153edf25333a8d487277b3adcd.jpg" style="width:300px;height:43.6px">
  </div>
  <div class='whysignLogin'>
  <%
  String msg=request.getParameter("msg");
  if("notexist".equals(msg))
  {
  
  %>
  <h1>Incorrect Username or Password</h1>
  <%} %>
<%if("invalid".equals(msg))
{%>
  
<h1>Some thing Went Wrong! Try Again !</h1>
<%} %>
<style>
h3
{
font-family: Times New Roman,Times,serif;
color: #544b81;
text-align: center;
font-size: 50px;

}
</style>
    <h3>Welcome to SwiftSpin!</h3>
    
    
    <p></p>
    
  </div>
</div>

</body>
</html>