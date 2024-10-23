<%@page errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/home-style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
</head>
    <!--Header-->
    <br>
    <div class="topnav sticky">
    <%String email=session.getAttribute("email").toString(); %>
   
            <center><h2>Online Laundry Managment (swiftSpin)</h2></center>
             <a href="addNewUser.jsp">Add New User <i class="fa fa-plus-square" aria-hidden="true"></i></a>
             <a href="User.jsp">Users<i class="fa fa-user-circle" aria-hidden="true"></i></a>
            <a href="addFinishedLaundry.jsp">Add Finished Laundry <i class="fa fa-plus-square" aria-hidden="true"></i></a>
            <a href="finishedLaundryList.jsp">Finished Laundry List <i class="fa fa-list-alt" aria-hidden="true"></i></a>
            <a href="manageSupply.jsp">Manage Supply <i class="fa fa-plus-square" aria-hidden="true"></i></a>
            <a href="inventory.jsp">Inventory <i class="fa fa-list-alt" aria-hidden="true"></i></a>
            <a href="logout.jsp">Logout <i class="fa fa-sign-out" aria-hidden="true"></i></i></a>
          </div>
           <br>
           