<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Edit Employee</title>
</head>
<body>
    <g:form action="update">
        <!-- Form fields for employee properties -->
        ${fields(bean: employee)}

        <g:submitButton name="update" value="Update"/>
    </g:form>
</body>
</html>