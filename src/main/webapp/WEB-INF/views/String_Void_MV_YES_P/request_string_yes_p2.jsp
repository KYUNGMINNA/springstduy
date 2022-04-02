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

%=Y :int    Y=(int)request.getAttribute("YEAR")            ::<%=Y%><br>
%=M :int    M=(int)request.getParameter("MONTH")           ::<%=M%><br>
%=D :int    D=(int)request.getParameter("DAY")             ::<%=D%><br>
%=H :String H=(String)request.getParameter("HOUR")         ::<%=H%><br>
<hr>
<hr>
<hr>
<hr>
<hr>
$ : {YEAR}  :: ${YEAR} <br>
$ : {MONTH} :: ${MONTH}<br>
$ : {DAY}   :: ${DAY}<br>
$ : {HOUR}  :: ${HOUR}<br>

</body>
</html>
