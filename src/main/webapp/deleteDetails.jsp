<%@page import="project.ConnectionProvider" %>
<%@page import="java.sql.*" %>
<%
String email = request.getParameter("email");

try
{
    Connection con = ConnectionProvider.getCon();
    Statement st = con.createStatement();
    int deletedRows = st.executeUpdate("delete from users where email='" + email + "'");

    if (deletedRows > 0) {
        response.sendRedirect("changeDetails.jsp?msg=done");
    } else {
        response.sendRedirect("changeDetails.jsp?msg=error");
    }
}
catch(Exception e)
{
    System.out.println(e);
    response.sendRedirect("changeDetails.jsp?msg=error");
}
%>