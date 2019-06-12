<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加管理员账户</title>
</head>
<body>
<h3>管理员</h3>
 <form action="insert" method="post">
	   帐号:<input type="text" name="userName" placeholder="请输入客户名"/>
	   密码:<input type="text" name="userPw" placeholder="请输入密码"/>
	  <input type="submit" value="提交"/>
 </form>
</body>
</html>