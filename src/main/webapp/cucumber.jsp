<%@ page import="java.time.LocalDate" %>
<%@ page import="javax.servlet.http.HttpServlet" %>
<%@ page import="java.util.Date" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cucumber jsp</title>
</head>
<body>
<h1> Cucumber with green color!</h1>
<h1> Your name: <%= request.getParameter("name") %> </h1>
</body>
</html>