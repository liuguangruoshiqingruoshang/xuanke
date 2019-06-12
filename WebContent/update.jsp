<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改密码</title>
</head>
<body>
<h3>修改密码</h3>
    <form action="update" method="post">
   登录名：<input type="text" name="userName" value="${admin.getUserName()}"> 
    原密码：<input type="password" name="oldPw" value="${admin.getUserPw()}">
    现密码：<input type="password" name="newPw" > 
    <input type="submit" value="提交"/>&nbsp; 
	<input type="reset" value="重置"/>&nbsp;
    </form>
</body>
</html>