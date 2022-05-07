<%--
  Created by IntelliJ IDEA.
  User: kyungmin
  Date: 2022-04-03
  Time: 오후 3:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Conversion jsp </h1>

$ : {param.date}  ::${param.date}  <br>
<hr>
<hr>

$ : {user.date}   ::${user.date}<br>
<hr>
<form  action="/ch3/conversion" method="post">
날짜1<input type="text" name="date" placeholder="2022-05-01"><br>   <!-- form 태그 안에서 서버 전송시 태그 안에  name 꼭 작성 할것. -->
    목록 <input type="text" name="lis" placeholder="가.나.다.라.">
    <button type="submit" >버튼</button>
</form>
</body>
</html>
