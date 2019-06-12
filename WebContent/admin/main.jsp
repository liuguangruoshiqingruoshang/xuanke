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
	 <h3>欢迎您:<c:out value="${admin.getUserName()}"></c:out></h3>
	 <div class="menu">
			<h4 id="kc" style="font-size:20px;">系统菜单</h4>
	</div>
	 <div class="menu">
			<h4 id="kc" style="font-size:20px;">修改密码</h4>
			<ul class="submenu">
			    <li><a href="update.jsp" style="text-decoration: none">修改密码</a></li>
			</ul>
	</div>
	<div class="menu">
			<h4 id="kc" style="font-size:20px;">系统管理</h4>
			<ul class="submenu">
			    <li><a href="xiTongGuanLi" style="text-decoration: none">系统管理</a></li>
			</ul>
	</div>
	<div class="menu">
			<h4 id="kc" style="font-size:20px;">课程管理</h4>
			<ul>
			    <li><a href="keChengGuanLi" style="text-decoration: none">课程管理</a></li>
			    <li><a href="insertKeCheng.jsp" style="text-decoration: none">课程录入</a></li>
			</ul>
	
	</div>
	<div class="menu">
			<h4 id="kc" style="font-size:20px;">老师管理</h4>
			<ul class="submenu">
			    <li><a href="laoShiGuanLi" style="text-decoration: none">老师管理</a></li>
			    <li><a href="insertLaoShi.jsp" style="text-decoration: none">老师录入</a></li>
			</ul>
	</div>
	<div class="menu">
			<h4 id="kc" style="font-size:20px;">课表管理</h4>
			<ul class="submenu">
			   <li><a href="keBiaoGuanLi" style="text-decoration: none">课表管理</a></li>
			    <li><a href="insertKeBiao.jsp" style="text-decoration: none">课表录入</a></li>
			</ul>
	</div>
	<div class="menu">
			<h4 id="kc" style="font-size:20px;">学生管理</h4>
			<ul class="submenu">
			   <li><a href="xueShengGuanLi" style="text-decoration: none">学生管理</a></li>
			    <li><a href="insertXueSheng.jsp" style="text-decoration: none">学生录入</a></li>
			</ul>
	</div>
</div>	 
</body>
</html>