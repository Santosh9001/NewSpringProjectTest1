<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form:form action="second" method ="POST" modelAttribute="login" commandName="login"> 
		<table border ="1" align="center">
                <tr>
                    <td><form:label path="">Username :</form:label></td>
                    <td><form:input path="username"/></td>
                </tr>
                <tr>
                    <td><form:label path="">Password :</form:label></td>
                    <td><form:input path="password"/></td>
                </tr> <tr>
                	
      				<td><form:label path="">Select :</form:label></td>
      				<td><form:select path="sections">
      					<form:options items= "${sections}"/>
      					</form:select>
      				</td>
 					
                </tr>
                <tr>
                <td><form:label path="">Countries :</form:label></td>
                <td><form:select path="countries">
                        <form:options items="${countries}" />
                    </form:select>
                    </td>
                </tr>
                <tr>
                	<td><form:label path="">Gender :</form:label>
                	<td>
                	<form:radiobuttons path="genders" items="${genders}"/>
                	</td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
                
            </table>
	</form:form>

</body>
</html>