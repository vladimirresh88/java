<%--
  Created by IntelliJ IDEA.
  User: v.v.reshetnikov
  Date: 27.12.2019
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
  Created by IntelliJ IDEA.
  User: v.v.reshetnikov
  Date: 26.12.2019
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Date" %>
<%@ page import="jsp.JspHelper" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    </head>
    <body>
    <b>Hello my first JSP!</b>
    <!-- Decloration-->
    <%! int i = 5; %>
    <%! private String doJob(){
        System.out.println("Hello my Dectoration " + i);
        return "hi from Decloration";
    } %>
    <!-- Expresion-->
    <%= i = i + 2 %>
    <%= "Hello my Expresion " + i%>
    <%= new Date() %>
    <%= "Hello my Screplet " + i%>
    <%= "Call remote method (Screplet) " + JspHelper.minux(7, 2)%>
    <%=  doJob() %>
</body>
</html>

</body>
</html>
