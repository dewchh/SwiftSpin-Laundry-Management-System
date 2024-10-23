<%@page import="project.ConnectionProvider" %>
<%@page import="java.sql.*" %>
<%
String id = request.getParameter("id");

try
{
    Connection con = ConnectionProvider.getCon();
    Statement st = con.createStatement();
    int deletedRows = st.executeUpdate("delete from user where id='" + id + "'");

    if (deletedRows > 0) {
        response.sendRedirect("User.jsp?msg=done");
    } else {
        response.sendRedirect("User.jsp?msg=error");
    }
}
catch(Exception e)
{
    System.out.println(e);
    response.sendRedirect("User.jsp?msg=error");
}
%>