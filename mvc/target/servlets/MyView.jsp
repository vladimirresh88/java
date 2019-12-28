<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 028 28.12.19
  Time: 0:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
    <jsp:useBean id="Student" class="mvc.jsp.Student" scope="request"/>
<%--    <jsp:useBean id="Student" class="jsp.Student" scope="session"/>--%>
<%--    <jsp:useBean id="Student" class="jsp.Student" scope="application"/>--%>
    <jsp:getProperty name="Student" property="name"/>
    <jsp:getProperty name="Student" property="age"/>
</body>
</html>
