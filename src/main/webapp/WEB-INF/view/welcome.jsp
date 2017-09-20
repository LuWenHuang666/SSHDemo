<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title><s:text name="succPage"/></title>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
</head>
<body>
    <s:text name="succTip">
        <s:param>${sessionScope.pname}</s:param>
    </s:text><br/>
</body>
</html>