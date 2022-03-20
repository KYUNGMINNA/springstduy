<%--
  Created by IntelliJ IDEA.
  User: kyungmin
  Date: 2022-03-19
  Time: 오후 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>   @RequestMapping(value = "/requestmapping_views",method=RequestMethod.GET)
</div>
<div>This is servlet-contex.xml -- view-controller path="/servlet_context" view-name="firstspring"</div>
<div>Only Get 요청만 허용 </div>
<p style="color: blue; font-size: 30px">return getrequest.jsp </p>

<div>매개변수로 int year ,int month, int day -- ${year}년 ${month}월 ${day}일 </div>
<div> getrequest_Int.jsp</div>
</body>
</html>
