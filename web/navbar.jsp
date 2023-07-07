<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <body>
        <nav class="col-3">
            <ul>
                <li><a href="index.jsp">Home</a></li>
                <li><a href="Mense.html">Mense</a></li>
                <li><a href="Chi_Siamo.jsp">Chi Siamo</a></li>
                <c:if test="${not empty username}">
                    <li><a href="Prenotazione.jsp">Prenota</a></li>
                    <li><a href="Prenotazione.jsp">Area Personale</a></li>
                </c:if>
                <c:if test="${empty username}">
                    <li><a href="Accedi.jsp">Accedi</a></li>
                </c:if>
            </ul>
        </nav>
    </body>
</html>