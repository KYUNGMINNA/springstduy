<%--
  Created by IntelliJ IDEA.
  User: kyungmin
  Date: 2022-04-24
  Time: 오전 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Cookie page</h1>
<!-- /ch3 를 붙여야 한다 안붙이려면 'c':url을 사용 해야 함  :: postmapping의 URL로 요청 -->
<form action="/ch3/cookie_get" method="post">
    <h3>현재 페이지 session="false"</h3><br>
    아이디<input type="text" name="id" value="${cookie.id.value}"><br>
    비밀번호<input type="password" name="password"><br>
    <label>
        쿠키여부<input type="checkbox" name="cookiecheck" ${empty cookie.id.value?"":"checked"}>
    </label>
    <input type="submit" value="클릭">



</form>
</body>
</html>
