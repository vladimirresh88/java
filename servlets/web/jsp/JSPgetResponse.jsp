<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 026 26.12.19
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%= request.getMethod() %>
    <%= session.getAttribute("") %>
    <!--%= response.getWriter().write("Hello Servlet!") %-->
</body>
</html>
