
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>老师管理</title>
</head>
<body>
<h3>老师管理</h3>
 <table border=1 cellspacing=1 cellpadding=10 align=center>
   <tr>
   <td>序号</td>
   <td>教师号</td>
   <td>姓名</td>
   <td>性别</td>
   <td>年龄</td>
   <td>职称</td>
   <td>登录账号</td>
   <td>登录密码</td>
   <td>操作</td>
   </tr>
	<c:forEach items="${list}" var="i">
	   <tr>
	   <td><c:out value="${i.getId()}"></c:out></td>
	   <td><c:out value="${i.getBianhao()}"></c:out></td>
	   <td><c:out value="${i.getXingming()}"></c:out></td>
	   <td><c:out value="${i.getXingbie()}"></c:out></td>
	   <td><c:out value="${i.getNianling()}"></c:out></td>
	   <td><c:out value="${i.getZhicheng()}"></c:out></td>
	   <td><c:out value="${i.getLoginname()}"></c:out></td>
	   <td><c:out value="${i.getLoginpw()}"></c:out></td>
	   <td><a href="delLaoShi?bianhao=${i.getBianhao()}">删除</a></td>
	   </tr>
	</c:forEach>
	<tr>
	<td><a href="insertLaoShi.jsp">添加</a></td>
	</tr>
</table>
</body>
</html>