<%@page import="weekendHomeWork_0411.UserDTO"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

</style>

<script src="js/jquery-3.4.1.min.js"></script>
<script>

	$(function(){
		
		$('button').click(function(){
			var result = confirm("로그아웃하시겠습니까?");
			
			if(result){
				location.href="LogoutServlet";
			}
		});
		
	});

</script>
</head>
<body>

<%
if(session.getAttribute("user")==null){
%>
	<form method="post" action="LoginServlet">
	<table>
	<tr><td>아이디</td><td><input type="text" name="id"></td></tr>
	<tr><td>패스워드</td><td><input type="password" name="pwd"></td></tr>
	<tr><td>로그인</td><td><input type="submit" name="login" value="로그인"></td></tr>
	</table>
	</form>		
	<%
} else {
				
	UserDTO udto = (UserDTO)session.getAttribute("user");			
	String id = udto.getId();
	Date date = udto.getDate();
				
%>
<table>
<tr><td><%=id %>님 접속중..</td></tr>
<tr><td>접속일자 : <%=date %></td></tr>
</table>
<button>로그아웃</button>
	
<%	
}
%>



</body>
</html>