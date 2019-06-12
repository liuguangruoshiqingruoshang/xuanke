<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>JSP学生选课系统</title>
<script language="javascript">
		function check1()
		{      
		     if(document.ThisForm.userName.value=="")
			 {
			 	alert("请输入客户名");
				document.ThisForm.userName.focus();
				return false;
			 }
			 if(document.ThisForm.userPw.value=="")
			 {
			 	alert("请输入密码");
				document.ThisForm.userPw.focus();
				return false;
			 }
			 document.getElementById("indicator").style.display="block";
			 loginService.login(document.ThisForm.userName.value,document.ThisForm.userPw.value,document.ThisForm.userType.value,callback);
		}
		
		function callback(data)
		{
		    document.getElementById("indicator").style.display="none";
		    if(data=="no")
		    {
		        alert("客户名或密码错误");
		    }
		    if(data=="yes")
		    {
		        alert("通过验证,系统登录成功");
		        window.location.href="<%=path%>/loginSuccess.jsp";
		}

	}
</script>
<link href="<%=path%>/css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
		<div class="signup_container">
			<h1 class="signup_title">
				<center>JSP学生选课系统</center>
			</h1>
				<form name="ThisForm" action="admin_login" method="post">
					<div id="signup_forms" class="signup_forms clearfix">
						<div class="form_row first_row">
							<label for="signup_email">请输入客户名</label> 
							<input name="userName" placeholder="请输入客户名" class="user" value=""/>
						</div>
						<div class="form_row">
							<label for="signup_password">请输入密码</label> <input name="userPw"
								placeholder="请输入密码" class="pwd" type="password"/>
						</div>
					</div>
					<div class="login-btn-set">
						<div class="rem">
						    <select class="radius3" name="user" style="width: 150px;">
						            <option value="0">选择身份</option>
	                                <option value="admin">管理员</option>
	                                <option value="teacher">老&nbsp;&nbsp;&nbsp;师</option>
	                                <option value="student">学&nbsp;&nbsp;&nbsp;生</option>
							 </select>
						</div>
						 <input name="button" type="submit" class="login-btn" id="Submit" onclick="check1()" value="登录"/>
					</div>
					<div class="rem">版权所有</div>
				</form>
		</div>
</body>
</html>