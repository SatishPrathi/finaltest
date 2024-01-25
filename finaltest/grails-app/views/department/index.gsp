<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Department List</title>
</head>
<body>
    <h2>Department List</h2>
    <g:each in="${departments}" var="department">
        <p>${department}</p>
    </g:each>
</body>
</html>