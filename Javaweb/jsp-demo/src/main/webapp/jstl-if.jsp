<%--
  User: ricky
  Date: 2022/5/6
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


    <c:if test="${status == 1}">
        启用
    </c:if>
    <c:if test="${status == 0}">
        禁用
    </c:if>


</body>
</html>
