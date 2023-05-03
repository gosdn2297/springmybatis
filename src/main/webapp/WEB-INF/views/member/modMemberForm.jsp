<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원수정창</title>
</head>
<body>
	<form action="${contextPath}/member/updateMember.do?id=${member.id}" method="post">
		<h2 align="center">회원 수정</h2>
		<table align="center">
			<tr>
				<td width="200"><p align="right">아이디</p></td>
				<td width="400"><input type="text" name="id" value="${member.id}" disabled></td>
			</tr>
			<tr>
				<td width="200"><p align="right">비밀번호</p></td>
				<td width="400"><input type="password" name="pwd" value="${member.pwd}"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">이름</p></td>
				<td width="400"><input type="text" name="name" value="${member.name}"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">이메일</p></td>
				<td width="400"><input type="text" name="email" value="${member.email}"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">가입일</p></td>
				<td width="400"><input type="text" name="joinDate" value="${member.joinDate}" disabled></td>
			</tr>
			<tr>
				<td width="200">&nbsp;</td>
				<td width="400">
				<input type="submit" value="가입하기">
				<input type="submit" value="다시입력">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>