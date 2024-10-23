<%@page import="project.ConnectionProvider" %>
<%@page import="java.sql.*" %>
<%
String id = request.getParameter("id");

try
{
    Connection con = ConnectionProvider.getCon();
    Statement st = con.createStatement();
    int deletedRows = st.executeUpdate("delete from item where id='" + id + "'");

    if (deletedRows > 0) {
        response.sendRedirect("finishedLaundryList.jsp?msg=done");
    } else {
        response.sendRedirect("finishedLaundryList.jsp?msg=error");
    }
}
catch(Exception e)
{
    System.out.println(e);
    response.sendRedirect("finishedLaundryList.jsp?msg=error");
}
%>