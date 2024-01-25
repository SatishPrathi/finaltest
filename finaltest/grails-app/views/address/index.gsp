<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Address List</title>
</head>
<body>
    <h2>Address List</h2>
    <g:each in="${addresses}" var="address">
        <p>${address.street1}, ${address.cityName}, ${address.state}</p>
    </g:each>
</body>
</html>