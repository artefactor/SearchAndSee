<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<img src = "images/office.png"> <br>

	hello
	<%@ page import="java.util.List"%>
	<%!int i = 15;%>

	<a href="image/logging.jpg"> image demo</a> <br>
	<a href="Films"> servlet demo</a>

	<%
	

		String text = "How jsp works";
		i = i + 18;
	%>

	demo:
	<%=text%>

	<%
		out.append("" + i);
	%>
	
	<br>
	<br>
	
	<%
	;
	%>
	
</body>
</html>