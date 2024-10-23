<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/signup-style.css">
<title>Signup</title>
</head>
<body>
<div id='container'>
  <div class='signup'>
    <form action="signupServlet" method="post" >
    <input type="text" name="name" placeholder="Enter Name" required>
    <input type="email" name="email" placeholder="Enter Email" required>
    <input type="number" name="mobileNumber" placeholder="Enter Mobile Number" required>
    <select name="securityQuestion" required>
    <option value="">What was your first car?</option>
     <option value="">What is the name of your first pet?</option>
      <option value="">What elementary school did you attend? </option>
       <option value="">What is the name of the town where you were born?</option>
    </select>
    <input type="text" name="answer" placeholder="Enter Answer" required>
    <input type="password" name="password" placeholder="Enter Password" required>
    <input type="submit" value="signup">
    </form>
      <h2><a href="login.jsp">Login</a></h2>
  </div>
  <div class='whysign'>
<%
String msg=request.getParameter("msg");
if("valid".equals(msg))
{
%>
<h1>Successfully Registered !</h1>
<%} %>
<%
if ("invalid".equals(msg))
{
%>
<h1>Some thing Went Wrong! Try Again !</h1>
<%} %>
    <h2> SwiftSpin </h2>
    <style>
    p{text-align:center;
    }
    h2{ 
    text-align:center;
    font-family: Times New Roman,Times,serif;
    font-size: 25px;
    }
    </style>
     <p>SwiftSpin services are designed to streamline the laundry process, providing you with unparalleled convenience and efficiency. With SwiftSpin, you can simplify your laundry routine and enjoy more free time for what truly matters, all with just a few clicks.</p>
       <img src= "https://i.pinimg.com/564x/d1/f4/85/d1f4856132fb98dcf344a0e9648640b9.jpg" style="width:500px;height:250px">
  </div> 
</div>

</body>
</html>