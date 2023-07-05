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
            
                    <!<!-- Contenuto principale della pagina -->
            <section class="contentPrimario col-1">
                <div class="boxAccedi">
                       <h2>Accedi</h2>
                        <form action="LoginServlet" method="POST">
                        <label for="username">Username</label>
                        <input type="text" name="username" id="username" value="">    
                        <label for="psw">Password</label>
                        <input type="password" name="psw" id="psw" value="">
                        <button type="submit">Accedi</button><br>
                        </form>
                        <br>
                
                </div>
            </section>
            
            <!<!-- Contenuto secondario della pagina -->
            <aside class="contentSecondario col-2">
                
            </aside>
        
        <jsp:include page="footer.jsp" />
    </body>
</html>
