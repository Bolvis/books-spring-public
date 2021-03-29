<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: dawid
  Date: 2/11/21
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<jsp:useBean id="books" scope="request" type="java.util.List"/>
<html>
<head>
    <title>List</title>
    <link rel="stylesheet" href="stylesheets/main.css">
    <link rel="stylesheet" href="stylesheets/list.css">
</head>
<body>
    <h1>List of books</h1>
    <c:choose>
        <c:when test="${books[0] != null}">
            <table>
                <tr>
                    <td>Author</td>
                    <td>Title</td>
                    <td>ISBN</td>
                </tr>
                <c:forEach items="${books}" var="book">
                    <tr>
                        <td>${book.author.name} ${book.author.surname}</td>
                        <td>${book.title}</td>
                        <td>${book.isbn}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <p>No records</p>
        </c:otherwise>
    </c:choose>
    <a href="${pageContext.request.contextPath}/add_form">Add new record</a>
</body>
</html>
