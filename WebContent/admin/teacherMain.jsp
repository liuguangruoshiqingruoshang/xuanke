<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>主页</title>
</head>
<body>
   <div>
     <h1>
				<center>JSP学生选课系统</center>
	 </h1>
	 <h3>欢迎您:<c:out value="${teacher.getXingming()}"></c:out></h3>
	 <div class="menu">
			<h4 id="kc" style="font-size:20px;">系统菜单</h4>
	</div>
	 <div class="menu">
			<h4 id="kc" style="font-size:20px;">我的信息</h4>
			<ul class="submenu">
			    <li><a href="laoShiXinXi" style="text-decoration: none">我的信息</a></li>
			</ul>
	</div>
	<div class="menu">
			<h4 id="kc" style="font-size:20px;">课表浏览</h4>
			<ul class="submenu">
			    <li><a href="" style="text-decoration: none">课表浏览</a></li>
			</ul>
	</div>
</div>	 
</body>
</html>