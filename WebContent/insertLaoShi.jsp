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
<table border=1 cellspacing=1 cellpadding=15 align=center>
 <form action="insertLaoShi" method="post">
	 <tr>
	   <td>教师号<input name="bianhao" type="text"/></td>
	 </tr>
	 <tr>
	   <td>姓名<input name="xingming" type="text"/></td>
	 </tr>
     <tr>
	   <td>性别<input type="radio" name="xingbie" value="男" checked="checked">男   
             <input type="radio" name="xingbie" value="女">女  
       </td>
    </tr>
    <tr>
	   <td> 年龄<input name="nianling" type="text"/></td>
	</tr>
	<tr>
	   <td>职称<input name="zhicheng" type="text"/></td>
	</tr>
	<tr>
	   <td>登录账号<input name="loginname" type="text"/></td>
	</tr>
	<tr>
	   <td>登录密码<input name="loginpw" type="text"/></td>
	</tr>
	<tr>
	   <td> <input type="submit" value="提交"/>&nbsp;
	        <input type="reset" value="重置"/>
	   </td>
	</tr>
 </form>
  </table>
</body>
</html>