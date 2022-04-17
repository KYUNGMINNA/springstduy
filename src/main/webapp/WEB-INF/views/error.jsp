<%--
  Created by IntelliJ IDEA.
  User: kyungmin
  Date: 2022-04-17
  Time: 오전 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Web.xml에 등록 안함<br>
@ResponseStatus 사용 안함<br>
views->error.jsp 파일 필요함<br>
error.jsp 파일에 isErrorPage="true"를 작성해야함<br>
기본 오류 코드인 500에러 나옴 -> 바꾸러면 @ResponseStatus 사용하면 됨
</body>
</html>
