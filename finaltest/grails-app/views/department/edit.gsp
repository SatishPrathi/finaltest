<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Edit Department</title>
</head>
<body>
    <g:form action="update">
        <!-- Form fields for department properties -->
        ${fields(bean: department)}

        <g:submitButton name="update" value="Update"/>
    </g:form>
</body>
</html>
