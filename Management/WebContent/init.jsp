<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main interface</title>
</head>
<body>
   <p>
	<s:a action="UserSelect">
	 <s:param name="username"> <s:property value="user.userid"/> </s:param>
	</s:a ></p>
</body>
</html>