<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action=orgnrec method="post">
<input type=text name="t2">
<input type=text name="t1" value="<%= request.getAttribute("t1")%>">
<input type=submit> 
</form>
</body>
</html>