<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Create Address</title>
</head>
<body>
    <g:form action="create">
        <!-- Form fields for address properties -->
        ${fields(bean: address)}

        <g:submitButton name="create" value="Create"/>
    </g:form>
</body>
</html>
