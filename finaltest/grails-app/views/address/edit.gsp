<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Edit Address</title>
</head>
<body>
    <g:form action="update">
        <!-- Form fields for address properties -->
        ${fields(bean: address)}

        <g:submitButton name="update" value="Update"/>
    </g:form>
</body>
</html>
