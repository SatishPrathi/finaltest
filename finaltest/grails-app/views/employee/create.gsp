<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Create Employee</title>
</head>
<body>
    <g:form action="create">
        <!-- Form fields for employee properties -->
        ${fields(bean: employee)}

        <g:submitButton name="create" value="Create"/>
    </g:form>
</body>
</html>