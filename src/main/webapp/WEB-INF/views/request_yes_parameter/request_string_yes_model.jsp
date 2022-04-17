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
<h1>모델 있음 </h1>
<%
    int Y=(int)request.getAttribute("YEAR");
    int M=(int)request.getAttribute("MONTH");
    int D=(int)request.getAttribute("DAY");
    String H=(String)request.getAttribute("HOUR");

%>
request.getAttribute는 Model객체혹은 ModelAndView객체 에서 값을 가져온다.<br>
%=Y :int    Y=(int)request.getAttribute("YEAR")            ::<%=Y%><br>
%=M :int    M=(int)request.getAttribute("MONTH")           ::<%=M%><br>
%=D :int    D=(int)request.getAttribute("DAY")             ::<%=D%><br>
%=H :String H=(String)request.getAttribute("HOUR")         ::<%=H%><br>
<hr>
<hr>
<hr>
<hr>
<hr>
$ : {YEAR}  &nbsp;:: ${YEAR} <br>
$ : {MONTH} &nbsp;:: ${MONTH}<br>
$ : {DAY}   &nbsp;:: ${DAY}<br>
$ : {HOUR}  &nbsp;:: ${HOUR}<br>
<hr>
<hr>
<hr>
<hr>
<hr>
$ : {year}  &nbsp;:: ${year} <br>
$ : {month} &nbsp;:: ${month}<br>
$ : {day}   &nbsp;:: ${day}<br>
$ : {hour}  &nbsp;:: ${hour}<br>

</body>
</html>
