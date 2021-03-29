<%--
  Created by IntelliJ IDEA.
  User: dawid
  Date: 2/11/21
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Add</title>
    <link rel="stylesheet" href="stylesheets/main.css">
    <link rel="stylesheet" href="stylesheets/add.css">
    <script src="scripts/add.js"></script>
</head>
<body>
    <h1>Add new record</h1>
    <form method="POST" action="${pageContext.request.contextPath}/add_book" id="form">
        <label class="container">
            <input type="text" maxlength="20" placeholder="name" name="name" id="name">
            <input type="text" maxlength="30" placeholder="surname" name="surname" id="surname">
            <input type="text" placeholder="title" name="title">
            <input type="text" maxlength="17" placeholder="ISBN" name="isbn"><br>
            <p id = "message">&nbsp</p>
            <button type="button" onclick="validate()">Add</button>
        </label>
    </form>
</body>
</html>
