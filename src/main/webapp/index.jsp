<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--God, you don't realize how long it took me to install this stupid lib with IntelliJ :sob:--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
    </head>
    <body>
        Which task to execute?<br/>
        <form action="${pageContext.request.contextPath}/controller" method="post">
            <input type="radio" id="taskOne" name="taskNum" value="1">
            <label for="taskOne">1: Is there an actor that plays in no movies?</label><br/>
            <input type="radio" id="taskTwo" name="taskNum" value="2">
            <label for="taskTwo">2: List all actors that played with a specific actor (Task 2 extra input).</label><br/>
            <input type="radio" id="taskThree" name="taskNum" value="3">
            <label for="taskThree">3: Find a movie with the most amount of actors.</label><br/><br/>
            <label for="task2Extra">Task 2 extra input:</label><br/>
            <input type="text" id="task2Extra" name="task2Extra"><br/><br/>
            <input type="submit" value="Submit">
        </form><c:if test="${!empty result}">
        <br/><br/>
        Result of executing task <c:out value="${taskExecuted}"/>:<br/>
        <b><c:out value="${result}"/></b></c:if>
    </body>
</html>