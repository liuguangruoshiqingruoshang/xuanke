<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>课表管理</title>
</head>
<body>
<h3>课表管理</h3>
 <table border=1 cellspacing=1 cellpadding=10 align=center>
   <tr>
   <td>序号</td>
   <td>课程编号</td>
   <td>课程名称</td>
   <td>课时</td>
   <td>时间</td>
   <td>节次</td>
   <td>上课教室</td>
   <td>授课老师</td>
   <td>操作</td>
   </tr>
	<c:forEach items="${list}" var="i">
	   <tr>
	   <td><c:out value="${i.id}"></c:out></td>
	   <td><c:out value="${i.kecheng.bianhao}"></c:out></td>
	   <td><c:out value="${i.kecheng.mingcheng}"></c:out></td>
	   <td><c:out value="${i.kecheng.keshi}"></c:out></td>
	   <td><c:out value="${i.shijian}"></c:out></td>
	   <td><c:out value="${i.jieci}"></c:out></td>
	   <td><c:out value="${i.jiaoshi}"></c:out></td>
	   <td><c:out value="${i.laoshi.xingming}"></c:out></td>
	   <td><a href="delKeBiao?id=${i.getId()}">删除</a></td>
	   </tr>
	</c:forEach>
	<tr>
	<td><a href="insertKeBiao.jsp">添加</a></td>
	</tr>
</table>
</body>
</html>