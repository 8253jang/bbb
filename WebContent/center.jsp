<%@page import="weekendHomeWork_0411.BoardDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

table{
	text-align: center;	
}

td{
	width: 250px;
	height: 45px;
}

input[type=text]{
	width:300px;
	height: 25px;
	border: 1px solid;
}

</style>

<script>

</script>
</head>
<body>

<h1 style="text-align: center">방명록</h1>
<hr>

<table>
	<tr><td>아이디</td><td>내용</td><td>작성날짜</td></tr>
<%
	List<BoardDTO> list = (List<BoardDTO>)application.getAttribute("Board");
	for(int i=0 ; i<list.size() ; i++){
			BoardDTO bdto = list.get(i);
			String name = bdto.getName();
			String subject = bdto.getSubject();
			String date = bdto.getDate();
		%>		
		<tr><td><%=name %></td><td><%=subject %></td><td><%=date %></td></tr>
		<%
	}

%>
</table>

	<%
		if(session.getAttribute("user") != null){
			%>
			<form action="board" method="post">
				내용 : <input type="text" name="subject">
				<input type="submit" value="등록">
			</form>
			<%
		}
	
	%>

</body>
</html>