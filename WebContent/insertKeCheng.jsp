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
 <form action="insertKeCheng" method="post">
   课程编号<input name="bianhao" type="text"/>
   课程名称<input name="mingcheng" type="text"/>
   课时<input name="keshi" type="text"/>
	  <input type="submit" value="提交"/>&nbsp;
	  <input type="reset" value="重置"/>
 </form>
</body>
</html>