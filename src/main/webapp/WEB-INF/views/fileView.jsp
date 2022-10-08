<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>file 화면 출력</title>
</head>
<body>
	<h2>출력화면</h2>
	<h3>username : ${file.username }</h3>
	<h3>password : ${file.password }</h3>
	<img src="/img/${file.logo}" style="width: 117px; height: 156px;">
</body>
</html>