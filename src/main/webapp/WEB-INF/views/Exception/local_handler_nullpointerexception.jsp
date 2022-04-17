<%--
  Created by IntelliJ IDEA.
  User: kyungmin
  Date: 2022-04-03
  Time: 오전 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Local handle </h1><br>
<h1>isErrorPage='true'</h1><br>
$ :: {NULLPointerException}             모델 객체 사용&nbsp;&nbsp;       :::::${NULLPointerException}<br>
$ :: {NULLPointerException.message}     모델 객체 사용&nbsp;&nbsp;      :::::${NULLPointerException.message}<br>
$ :: {NULLPointerException.stackTrace}  모델객체 사용       &nbsp;&nbsp;:::::${NULLPointerException.stackTrace}<br>
발생한 예외 $ pageContext.exception : &nbsp;   &nbsp; ${pageContext.exception}<br>
예외 메시지 $ pageContext.exception.message: &nbsp;   &nbsp;${pageContext.exception.message}<br>
<hr>
&lt; %=pageContext.getAttribute("NULLPointerException") &gt;&nbsp;<%=pageContext.getAttribute("NULLPointerException")%><br>
&lt; %=session.getAttribute("NULLPointerException") &gt;&nbsp;<%=session.getAttribute("NULLPointerException")%><br>
&lt; %=request.getAttribute("NULLPointerException") &gt;&nbsp;<%=request.getAttribute("NULLPointerException")%><br>
&lt; %=application.getAttribute("NULLPointerException") &gt;&nbsp;<%=application.getAttribute("NULLPointerException")%><br>

</body>
</html>
