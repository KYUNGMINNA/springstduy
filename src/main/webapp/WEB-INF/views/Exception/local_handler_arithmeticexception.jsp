<%--
  Created by IntelliJ IDEA.
  User: kyungmin
  Date: 2022-04-03
  Time: 오전 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Local handle </h1><br>
<h1>isErrorPage='false'</h1><br>
$ :: {ArithmeticException}                모델 객체 사용&nbsp; &nbsp;   :::::${ArithmeticException}<br>
$ :: {ArithmeticException.message}       모델 객체 사용 &nbsp;  &nbsp;  :::::${ArithmeticException.message}<br>
$ :: {ArithmeticException.stackTrace}  모델 객체 사용 &nbsp;   &nbsp;   :::::${ArithmeticException.stackTrace}<br>
발생한 예외 $ pageContext.exception :  &nbsp;   &nbsp;${pageContext.exception}<br>
예외 메시지 $ pageContext.exception.message:  &nbsp;   &nbsp;${pageContext.exception.message}<br>
<hr>
&lt; %=pageContext.getAttribute("ArithmeticException") &gt;&nbsp;<%=pageContext.getAttribute("ArithmeticException")%><br>
&lt; %=session.getAttribute("ArithmeticException") &gt;&nbsp;<%=session.getAttribute("ArithmeticException")%><br>
&lt; %=request.getAttribute("ArithmeticException") &gt;&nbsp;<%=request.getAttribute("ArithmeticException")%><br>
&lt; %=application.getAttribute("ArithmeticException") &gt;&nbsp;<%=application.getAttribute("ArithmeticException")%><br>
</body>
</html>
