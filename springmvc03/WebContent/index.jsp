<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>北风网</title>
</head>
<body>
<hr/>
1.HttpServletRequest 返回数据:<br/>
<form action="query1.do" method="post">
	<input type="submit" value="查询"/>
</form>
<br/>
name:${name }
<br/>
userId:${user.userId }
userName:${user.userName }

<hr/>
2.ModelAndView 返回数据:<br/>
<form action="query2.do" method="post">
	<input type="submit" value="查询"/>
</form>
<br/>
userId:${user2.userId }
userName:${user2.userName }
<hr/>
3.Map 返回数据:<br/>
<form action="query3.do" method="post">
	<input type="submit" value="查询"/>
</form>
<br/>
userId:${user3.userId }
userName:${user3.userName }<hr/>
4.Model  返回数据:<br/>
<form action="query4.do" method="post">
	<input type="submit" value="查询"/>
</form>
<br/>
userId:${user4.userId }
userName:${user4.userName }

5.Model  返回数据List:<br/>
<form action="query5.do" method="post">
	<input type="submit" value="查询"/>
</form>
<br/>
list:${list }
</body>
</html>