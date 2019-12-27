<%@ page import="jsphelpers.Person" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 027 27.12.19
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%! String name = "Krilov";%>
    <jsp:useBean id="person" class="jsphelpers.Person" scope="application"/> <!-- scope определяет то где виден данный бин  scope=sesion -для работы с сессией-->
    <% Person person2 = new Person();%> <!-- тоже самое-->
    <jsp:setProperty name="person" property="name" value="<%=name%>"/>
    <jsp:getProperty name="person" property="name"/>

    <jsp:useBean id="person1" class="jsphelpers.Man" type="jsphelpers.Man"/> <!-- полиморфизм -->
    <jsp:setProperty name="person1" property="*" /> <!--принимаем  все url параметры-->
    <jsp:getProperty name="person1" property="age"/>
    <jsp:getProperty name="person1" property="name"/>
</body>
</html>
