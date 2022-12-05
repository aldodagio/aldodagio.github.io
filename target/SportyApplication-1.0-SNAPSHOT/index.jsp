<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sporty</title>
</head>
<body>
<h1><%= "Sporty Prototype" %>
</h1>
<br/>
<style>
    body{
        background-color: #dd1144;
    }
.column {
float: left;
width: 33.33%;
padding: 5px;
}

/* Clear floats after image containers */
.row::after {
content: "";
clear: both;
display: table;
}
</style>
<a href="hello-servlet">Continue as a Fan</a><br>
<a href="RestaurantServlet">Continue as Restaurant/Bar</a>
<div class="row">
    <div class="column">
        <img src="sporty_logo.jpg" alt="Logo" style="width:100%; height:500px;">
    </div>
    <div class="column">
        <img src="founders_picture.jpg" alt="Founders" style="width:100%; height: 500px;">
    </div>
</div>
</body>
</html>