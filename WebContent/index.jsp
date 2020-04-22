<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
iframe{
	width: 800px;
	height: 550px;
	border: 1px solid ;
	background-color: pink;
}

#left{
	width:300px;
	height: 550px;
	background-color: silver;
}


</style>

<script>

</script>
</head>
<body>

<table>
	<tr><td colspan="2"><%@ include file="top.jsp" %></td></tr>
	<tr>
		<td><iframe src="left.jsp" id="left" name="left"></iframe></td>
		<td><iframe src="center.jsp" name="center"></iframe></td>
	</tr>
	<tr><td colspan="2"><%@ include file="footer.jsp" %></td></tr>	
</table>


</body>
</html>