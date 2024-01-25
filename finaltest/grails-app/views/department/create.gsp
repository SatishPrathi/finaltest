<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Create Department</title>
</head>
<body>
    <g:form action="create">
        <!-- Form fields for department properties -->
        ${fields(bean: department)}

        <g:submitButton name="create" value="Create"/>
    </g:form>
</body>
</html>