<%--
  Created by IntelliJ IDEA.
  User: v.v.reshetnikov
  Date: 28.12.2019
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${stud.name }
    ${stud["age"] }
    ${requestScope.stud.name}
    ${sessionScope.stud.age}
    ${applicationScope.stud.name}
    ${list[1]}
    ${map["one"]}
    ${map.two}
<%--    <jsp:setProperty name="stud" property="name" value="${Mr}.${Max}"/>--%>
    ${cookie.JSESSIONID}
</body>
</html>
