<%-- 
    Document   : areaPersonale
    Created on : 5 lug 2023, 17:00:03
    Author     : sever
--%>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <title>Mensa da Nonna Papera - Errore</title>
        <meta charset="UTF-8">
        <meta name="Author" content="Mattia Delrio, Luca Olla, Severino Fele, Michele Cucca">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="Mensa, Prenotazione, Nonna Papera, Mense Universitarie, Cagliari, UNICA">
        <meta name="description" content="Prenotazioni di posti a tavola delle varie mense situate a Cagliari per i studenti e professori universitari">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Schibsted+Grotesk&display=swap" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen"/>
        <script src="https://kit.fontawesome.com/729a9b08ff.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <jsp:include page="header.jsp" />
        
        <jsp:include page="navbar.jsp" />
        
        
        <c:if test="${nuovo_inserimento==false}">
            <c:redirect url="Registrazione.jsp"/>
        </c:if>
        <section class="contentPrimario col-1">
            <c:if test="${inserimento_corretto==true}">

                <h1>Utente creato con successo!</h1>
                <ul>
                    <li>Nome: ${nuovo_nome}</li>
                    <li>Cognome ${nuovo_cognome}</li>
                    <li>Email: ${nuovo_email}</li>
                    <li>Username: ${nuovo_username}</li>
                </ul>
            </c:if>
         </section>
        
        <aside class="contentSecondario col-2">
                
        </aside>
    </body>
</html>
