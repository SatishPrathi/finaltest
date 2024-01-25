<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Employee List</title>
</head>
<body>
    <h2>Employee List</h2>
    <g:each in="${employees}" var="employee">
        <p>${employee}</p>
    </g:each>
</body>
</html>