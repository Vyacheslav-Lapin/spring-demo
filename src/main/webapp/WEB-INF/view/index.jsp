<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Simple Directory Web App</title>
  <link rel="stylesheet" type="text/css"
        href="${pageContext.request.contextPath}/webjars/bootstrap/5.1.0/css/bootstrap.min.css">
<%--  <link rel="stylesheet" type="text/css"--%>
<%--        href="/webjars/bootstrap/5.1.0/css/bootstrap-theme.min.css">--%>
</head>
<body>

<div class="container theme-showcase" role="main">
  <div class="jumbotron">
    <h1>ToDo Application</h1>
    <p>A simple Rest API Spring MVC application</p>
  </div>
  <div class="page-header">
    <h1>API</h1>
    <a href="/todo">Current ToDos</a>
  </div>
</div>

</body>

</html>
