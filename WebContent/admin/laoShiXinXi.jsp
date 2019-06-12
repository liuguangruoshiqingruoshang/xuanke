<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>我的信息</title>
</head>
<body>
<h3>我的信息</h3>
 <table border=1 cellspacing=1 cellpadding=10 align=center>
   <tr>
   <td>教师号</td>
   <td>姓名</td>
   <td>性别</td>
   <td>年龄</td>
   <td>职称</td>
   <td>登录账号</td>
   <td>登录密码</td>
   </tr>
	   <tr>
	   <td><c:out value="${teacher.getBianhao()}"></c:out></td>
	   <td><c:out value="${teacher.getXingming()}"></c:out></td>
	   <td><c:out value="${teacher.getXingbie()}"></c:out></td>
	   <td><c:out value="${teacher.getNianling()}"></c:out></td>
	   <td><c:out value="${teacher.getZhicheng()}"></c:out></td>
	   <td><c:out value="${teacher.getLoginname()}"></c:out></td>
	   <td><c:out value="${teacher.getLoginpw()}"></c:out></td>
	   </tr>
</table>
</body>
</html>