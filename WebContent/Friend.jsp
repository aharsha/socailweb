<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome: 
<%
ResultSet resultSet=(ResultSet)request.getAttribute("friendsList");

if(resultSet!=null)
{
	System.out.println("------");
	int id=1;
	while(resultSet.next())
	{
		
		out.print(++id+"."+resultSet.getString(1)+"---");
		out.print("<a href='fc'?fn="+resultSet.getString(1)+"' > sendfriendrequest </a> <br/>");
		
	
	}
	}
else
{
	out.print("No friends");
}
%>


</body>
</html>