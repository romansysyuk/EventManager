<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title><tiles:getAsString name="title"/></title>
    <link rel="stylesheet" href=<c:url value="//resources/css/style.css"></c:url>/>
</head>
<body>
<div>
    <tiles:insertAttribute name="header"/>
</div>
<div>
    <tiles:insertAttribute name="menu"/>
</div>
<div class="myClass">
    <tiles:insertAttribute name="body"/>
</div>
<div>
    <tiles:insertAttribute name="footer"/>
</div>
</body>
</html>