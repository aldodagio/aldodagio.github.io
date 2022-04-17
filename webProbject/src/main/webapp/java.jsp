<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>
<form method="post" action="Servlet">
<table>
  <caption>Here is what you selected:</caption>
  <%= session.getAttribute("auto") %>
    <%= session.getAttribute("transmission") %>
      <%= session.getAttribute("brakes") %>
        <%= session.getAttribute("color") %>
          <%= session.getAttribute("air bags") %>
            <%= session.getAttribute("moon roof") %>
</table>
</form>
</body>
</html>