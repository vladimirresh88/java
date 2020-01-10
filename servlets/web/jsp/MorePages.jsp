<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 026 26.12.19
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@include file="JSPgetResponse.jsp"%>

    <jsp:include page="JSPgetResponse.jsp" />
    <jsp:include page="/servletXSS" />
</body>
</html>
