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
 <table border=1 cellspacing=1 cellpadding=15 align=center>
 <form action="insertKeBiao" method="post">
	 <tr>
	   <td>课程 <select name="mingcheng">
	   
	                                <option value="0">C++程序设计基础</option>
	                                <option value="1">C语言程序设计</option>
	                                <option value="2">JSP动态网站开发技术</option>
	                                <option value="3">JAVA程序设计</option>
			   </select>
	   </td>
	 </tr>
	 <tr>
	   <td>时间 <select name="shijian">
	                                <option>周一</option>
	                                <option>周二</option>
	                                <option>周三</option>
	                                <option>周四</option>
	                                <option>周五</option>
	                                <option>周六</option>
	                                <option>周日</option>
			   </select>
		</td>
	 </tr>
     <tr>
	   <td>节次<select name="jieci">
	                                <option>1~2</option>
	                                <option>3~4</option>
	                                <option>5~6</option>
	                                <option>7~8</option>
			   </select>  
       </td>
    </tr>
    <tr>
	   <td>上课教室<select name="jiaoshi">
	                                <option>多媒体教室</option>
	                                <option>普通教室</option>
			   </select>
	   </td>
	</tr>
	<tr>
	   <td>授课老师<select name="xingming">
	                                <option value="0">文之秀</option>
	                                <option value="1">马老师</option>
	                                <option value="2">张幸福</option>
			   </select>
	    </td>
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