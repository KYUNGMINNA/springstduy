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
request.getParamtert는 Model객체에 저장된 것을 불러오는게 아니라 , URL에서 가져오는 것이다.<br>
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
<hr>
$ : {year} :&nbsp;${year}
$ : {month} :&nbsp;${month}
$ : {day} :&nbsp;${day}
$ : {hour} :&nbsp;${hour}
</body>
</html>
