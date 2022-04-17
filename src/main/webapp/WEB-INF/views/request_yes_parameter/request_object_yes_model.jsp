<%@ page import="com.fastcampus.ch3.controller.request.Info" %><%--
  Created by IntelliJ IDEA.
  User: kyungmin
  Date: 2022-04-02
  Time: 오후 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>모델 있음</h1>
<%
    Info info=(Info) request.getAttribute("INFO");
%>
Info info=(Info) request.getAttribute("INFO");<br>
<%=info%><br>
&lt;%= &nbsp; info.getYear()% &gt;  &nbsp;:: <%=info.getYear()%>  <br>
&lt;%= &nbsp; info.getMonth()% &gt; &nbsp;:: <%=info.getMonth()%> <br>
&lt;%= &nbsp; info.getYear()% &gt;  &nbsp;:: <%=info.getYear()%>  <br>
&lt;%= &nbsp; info.getDay()% &gt;   &nbsp;:: <%=info.getDay()%>   <br>
<hr>
<hr>
<hr>
<hr>
$ : {info.year}  :: ${info.year} <br>
$ : {info.month} :: ${info.month}<br>
$ : {info.day}   :: ${info.day}<br>
$ : {info.hour}  :: ${info.hour}<br>
<hr>
<hr>
<hr>
<hr>
$ : {INFO.year}  :: ${INFO.year} <br>
$ : {INFO.month} :: ${INFO.month}<br>
$ : {INFO.day}   :: ${INFO.day}<br>
$ : {INFO.hour}  :: ${INFO.hour}<br>
<hr>
<hr>
<hr>
<hr>
$ : {INfo.year}  :: ${INfo.year} <br>
$ : {INfo.month} :: ${INfo.month}<br>
$ : {INfo.day}   :: ${INfo.day}<br>
$ : {INfo.hour}  :: ${INfo.hour}<br>

</body>
</html>
