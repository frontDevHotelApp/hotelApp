<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Success</title>
</head>
<body>
		<table border="1px" bordercolor="black" width=80% align="center">
          <tr>
             <td>Ilosc pokoi</td>
             <td>Nazwa hotelu</td>
             <td>Opis</td>
          </tr>
          <c:forEach items="${rooms}" var="room">
            <tr>
              <td><c:out value="${room.numbers}" /></td>
              <td><c:out value="${room.hotelName}" /></td>
              <td><c:out value="${room.description}" /></td>
            </tr>
          </c:forEach>
        </table>
</body>
</html>