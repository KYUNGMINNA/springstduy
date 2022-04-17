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
<h1>모델 없음</h1>

$ : {year} :&nbsp;${year}<br>
$ : {month} :&nbsp;${month}<br>
$ : {day} :&nbsp;${day}<br>
$ : {hour} :&nbsp;${hour}<br>
<hr>
<br>
$ : {info.year}  :: ${info.year} <br>
$ : {info.month} :: ${info.month}<br>
$ : {info.day}   :: ${info.day}<br>
$ : {info.hour}  :: ${info.hour}<br>
</body>
</html>
