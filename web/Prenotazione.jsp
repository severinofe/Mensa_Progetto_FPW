<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<!--
    PROGETTO SITO PER FPW CREATO DA I_DDT COMPOSTO DA: MATTIA, LUCA, SEVERINO E ULTIMO PER IMPORTANZA MICHELE
-->


<html>
    <head>
        <title>Mensa da Nonna Papera</title>
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
         <c:if test="${empty username}">
            <c:redirect url="Accedi.jsp"/>
        </c:if>
    <c:if test="${not empty username}">
                    <!<!-- Contenuto principale della pagina -->
            <section class="contentPrimario col-1">
                <div class="boxAccedi">
                <h2>Prenota!</h2>
                <form action="login" method="POST">
                    <div class="nome">
                    <label class="label" for="nome">Nome</label><hr>
                    <input  type="text" name="nome" id="nome">
                    <label class="label" for="cognome">Cognome</label><hr>
                    <input  type="text" name="cognome" id="cognome">
                    <label class="label" for="email">Email</label><hr>
                    <input  type="text" name="email" id="email">
                    <label class="label" for="data">Data</label><hr>
                    <input type="date" name="data" id="data">
                    <label class="label" for="orario">Orario</label><hr>
                    <input type="time" name="orario" id="orario">
                    </div>
                    <input type="submit" value="Prenota">
                </form>
                </div>
            </section>
           </c:if> 
            <!<!-- Contenuto secondario della pagina -->
            <aside class="contentSecondario col-2">
                
            </aside>
        
        <jsp:include page="footer.jsp" />
    </body>
</html>
