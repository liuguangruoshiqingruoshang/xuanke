<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>课程管理</title>
</head>
<body>
<h3>课程管理</h3>
 <table border=1 cellspacing=1 cellpadding=10 align=center>
   <tr>
   <td>序号</td>
   <td>课程编号</td>
   <td>课程名称</td>
   <td>课时</td>
   <td>操作</td>
   </tr>
	<c:forEach items="${list}" var="i">
	   <tr>
	   <td><c:out value="${i.getId()}"></c:out></td>
	   <td><c:out value="${i.getBianhao()}"></c:out></td>
	   <td><c:out value="${i.getMingcheng()}"></c:out></td>
	   <td><c:out value="${i.getKeshi()}"></c:out></td>
	   <td><a href="delKeCheng?bianhao=${i.getBianhao()}">删除</a></td>
	   </tr>
	</c:forEach>
	<tr>
	<td><a href="insertKeBiao.jsp">添加</a></td>
	</tr>
</table>
</body>
</html>