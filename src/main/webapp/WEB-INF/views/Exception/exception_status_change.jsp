<%--
  Created by IntelliJ IDEA.
  User: kyungmin
  Date: 2022-04-03
  Time: 오전 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<H1>에러 상태 코드 변환  :: 정상적 에러 처리시 200번대 에러 나와서 이를 에러에 맞게 수정</H1><br>
<h1>응답 메시지의 상태코드를 변경</h1>
발생한 예외 $ pageContext.exception : ${pageContext.exception}<br>
예외 메시지 $ pageContext.exception.message: ${pageContext.exception.message}<br>
</body>
</html>
