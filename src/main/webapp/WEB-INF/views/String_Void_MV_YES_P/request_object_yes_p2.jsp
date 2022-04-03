<%--
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
<h1>모델 없음</h1>
<%
    String Y=request.getParameter("year");
    String M=request.getParameter("month");
    String D=request.getParameter("day");
    String H=request.getParameter("hour");


%>

%=Y : String request.getParameter("year") ::  <%=Y%><br>
%=M : String request.getParameter("month") ::<%=M%><br>
%=D : String request.getParameter("day") ::<%=D%><br>
%=H : String request.getParameter("hour") ::<%=H%><br>
<hr>
<hr>
<hr>
<hr>
<hr>
$ : {param.year}  :: ${param.year} <br>
$ : {param.month} :: ${param.month}<br>
$ : {param.day}   :: ${param.day}<br>
$ : {param.hour}  :: ${param.hour}<br>
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
