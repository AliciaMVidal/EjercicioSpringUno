<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

<%@ page isELIgnored="false" %>

<!-- JSTL tags -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- Spring tags -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<link rel="stylesheet" href="<spring:url value="resources/css/estilos.css" htmlEscape="true"/>" type="text/css" />

</head>
<body>
<%@ include file="login.html" %>
</body>
</html>