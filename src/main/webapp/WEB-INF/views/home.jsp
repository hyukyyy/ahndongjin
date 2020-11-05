<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	팀플전사 안동진
</h1>

<P>  사용자 : ${user}. </P>
<P>  이메일 : ${userEmail}. </P>

<c:forEach var="subject" items="${subjectList}" begin="0" step="1" varStatus="status">
    <p>번호 : ${status.index}</p>
    <p>제목 : ${subject.title}</p>
    <p>내용 : ${subject.content}</p>
</c:forEach>

<c:forEach var="quest" items="${questList}" begin="0" step="1" varStatus="status">
    <p>번호 : ${status.index}</p>
    <p>제목 : ${quest.title}</p>
    <p>기간 : ${quest.startDate} ~ ${quest.endDate}</p>
    <p>완료여부 : ${quest.complete}</p>
</c:forEach>

</body>
</html>
