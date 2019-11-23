<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Register Yourself</title>
	</head>
	
	
	<body>
		
		<div align="center">
		<h1>Register Yourself</h1>
			
			<f:form action="registerUser" method="post" modelAttribute="userObj">
			<table>
				<tr>
					<td>User Name : </td>
					<td><f:input path="userName" id="name"/></td>
				</tr>
				<tr>
					<td>Address : </td>
					<td><f:input path="userAddress" id="address"/></td>
				</tr>
				
				<tr>
				
					<td>Phone no : </td>
					<td><f:input path="userMobile" id="phone"/></td>
				</tr>
				
				<tr>
				
					<td>Email : </td>
					<td><f:input path="userEmail" id="email"/></td>
				</tr>
				<tr>
				<tr>
				
					<td>Password : </td>
					<td><f:input path="userPassword" id="password"/></td>
				</tr>
				
				<tr>
				<th></th>
					<td>
						<input id="btn" type="submit" value="Register"/>
					</td>
				</tr>
			
			</table>
			</f:form>
		</div>
		
	</body>
</html>