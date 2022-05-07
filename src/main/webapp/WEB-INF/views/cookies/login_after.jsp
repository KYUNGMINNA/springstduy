<%--
  Created by IntelliJ IDEA.
  User: kyungmin
  Date: 2022-04-24
  Time: 오전 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%  String a=session.getId()==null? "session_no":"session_yes";%>

<html>
<head>
    <title>Title</title>
</head>
<body>
로그인 후 화면<hr>
${cookie.id.value} 쿠키 아이디 값은 바로 안나오고 새로고침 한번 하면 나옴.<hr>
<hr>
세션 아이디 있는 여부 확인 : <%=a%>:제이세션 아이디 여부를 체크 하게됨<br>
세션 아이디 바로 확인 < %=session.getAttribute("id")  %>::: <%=session.getAttribute("id")%> :실제 세션 아이디 JSP 방식<br>


세션 아이디 있는 여부 확인 $ { empty sessionScope.id } : ${empty sessionScope.id} :세션 아이디 있는지 여부 t/f로 확인 EL방식<br>
세션 아이디 바로 확인 $ { sessionScope.id } :: ${sessionScope.id} : 실제 세션 아이디 EL방식 <br>

세션 아이디 있으면  href= /ch3/session_checks ,  없으면 href=' '
<ul>
    <li>
        <a href="${sessionScope.id ==null? ' ':'/ch3/session_checks'}">세션유지테스트용</a>
    </li>
</ul>
</body>
</html>
