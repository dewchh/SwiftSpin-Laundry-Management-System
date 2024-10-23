<%@page import="project.ConnectionProvider" %>
<%@page import="java.sql.*" %>
<%
try
{
	Connection con=ConnectionProvider.getCon();
	Statement st=con.createStatement();
	String q1 ="create table users (name varchar(100), email varchar(100) primary key, mobileNumber bigint, securityQuestion varchar(200), answer varchar(200), password varchar(100), address varchar(500))";
	String q2 ="create table item(id int,date DATE,customer_name varchar(200),no_of_items int,price int)";
    String q3 ="create table user(id int,name varchar(500),dateOfbirth DATE,address varchar(255),mobile_number varchar(15))";
	String q4 ="create table supply(id int,date DATE,name varchar(500),category varchar(200),quantity int)";
     
	System.out.println(q1);
	System.out.println(q2);
	System.out.println(q3);
	System.out.println(q4);
	
    st.execute(q1);
    st.execute(q2);
	st.execute(q3);
	st.execute(q4);
	
	System.out.print("Table created");
	con.close();
	}
catch(Exception e)
{
	System.out.print(e);
	}
%>