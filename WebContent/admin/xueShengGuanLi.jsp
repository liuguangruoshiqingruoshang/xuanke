<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生管理</title>
</head>
<body>
<h3>学生管理</h3>
 <table border=1 cellspacing=1 cellpadding=10 align=center>
   <tr>
   <td>序号</td>
   <td>学号</td>
   <td>姓名</td>
   <td>性别</td>
   <td>年龄</td>
   <td>班级</td>
   <td>登录账号</td>
   <td>登录密码</td>
   <td>操作</td>
   </tr>
	<c:forEach items="${list}" var="i">
	   <tr>
	   <td><c:out value="${i.getId()}"></c:out></td>
	   <td><c:out value="${i.getXuehao()}"></c:out></td>
	   <td><c:out value="${i.getXingming()}"></c:out></td>
	   <td><c:out value="${i.getXingbie()}"></c:out></td>
	   <td><c:out value="${i.getNianling()}"></c:out></td>
	   <td><c:out value="${i.getBanji()}"></c:out></td>
	   <td><c:out value="${i.getLoginname()}"></c:out></td>
	   <td><c:out value="${i.getLoginpw()}"></c:out></td>
	   <td><a href="delXueSheng?id=${i.getId()}">删除</a></td>
	   </tr>
	</c:forEach>
	<tr>
	<td><a href="insertXueSheng.jsp">添加</a></td>
	</tr>
</table>
</body>
</html>