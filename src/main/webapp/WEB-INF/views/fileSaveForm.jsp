<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>file test</title>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<form enctype="multipart/form-data" id="fileUploadForm">
		username:<input id="username" type="text" name="username">
		password:<input id="password" type="password" name="password">
		logo:<input id="file" type="file">
		<button id="btnSave" type="button">작성완료</button>
	</form>
	
	<script>
		$("#btnSave").click(()=>{
			
			let formData = new FormData();
			
			let data = {
				username:$("#username").val(),
				password:$("#password").val()
			};
			
			formData.append("file",$("#file")[0].files[0]);
			
			formData.append("saveDto", new Blob([JSON.stringify(data)], {type:"application/json"}));
			
			$.ajax("/save",{
				type:"post",
				data:formData,
				processData:false,
				contentType:false,
				enctype:'multipart/form-data'
			}).done((res)=>{
				if(res.code == 1) {
					alert("파일 등록 성공");
				}
			});
		})
	
	</script>
</body>
</html>