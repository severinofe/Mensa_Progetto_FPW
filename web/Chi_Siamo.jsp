<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!--
    PROGETTO SITO PER FPW CREATO DA I_DDT COMPOSTO DA: MATTIA, LUCA, SEVERINO E ULTIMO PER IMPORTANZA MICHELE
-->


<html>
    <head>
        <title>Chi Siamo - Mensa da Nonna Papera</title>
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
                <article class="descrizione">
                    <h2><b>Che cos'è la mensa Da nonna Papera?</b></h2>
                    <hr>
                    <p>Benvenuti a “Da nonna Papera”, l’azienda di mense universitarie che offre pasti deliziosi e salutari per gli studenti di tutto il campus. Siamo la scelta ideale per soddisfare le vostre esigenze alimentari durante il vostro percorso universitario. Offriamo pasti equilibrati e nutrienti, preparati con ingredienti freschi e di alta qualità. Siamo consapevoli delle restrizioni dietetiche e offriamo opzioni per vegetariani, vegani, celiaci e altre preferenze alimentari. Promuoviamo la sostenibilità e l’educazione alimentare, offrendo servizi di catering per eventi speciali. Siamo parte attiva della comunità universitaria e sosteniamo progetti di beneficenza locali. Siamo pronti ad accoglierti con cibo gustoso, sano e un ambiente accogliente. Scegli “Da nonna Papera” per un’esperienza culinaria casalinga e memorabile.</p>
                </article> 
                
                <article class="lista_team">
                    <h2><b>Il nostro staff</b></h2>
                    <ul>
                        <li class="box">
                            <img src="foto_staff/foto mattia.jpeg" alt="alt"/>
                            <div class="persona">
                                <h3>Mattia</h3>
                                <hr>
                                <p>Mattia è un membro energico e creativo dello staff di "Mense da Nonna Papera". Con la sua passione per la cucina e le sue abilità comunicative, contribuisce a rendere l'esperienza culinaria unica. È un collaboratore prezioso, apprezzato dai colleghi e dai clienti.</p>
                            </div>
                        </li>
                        
                        <li class="box">
                            <img src="foto_staff/foto michele.jpeg" alt="alt"/>
                            <div class="persona">
                                <h3>Michele</h3>
                                <hr>
                                <p>Michele è un membro affidabile e diligente dello staff di "Mense da Nonna Papera". Con la sua dedizione per il servizio e le sue competenze organizzative, contribuisce a garantire un'esperienza culinaria efficiente. È un collaboratore rispettato, apprezzato dai colleghi e dai clienti per la sua professionalità.</p>
                            </div>
                        </li>
                        
                        <li class="box">
                            <img src="foto_staff/foto luca.jpeg" alt="alt"/>
                            <div class="persona">
                                <h3>Luca</h3>
                                <hr>
                                <p>Luca è un membro appassionato e talentuoso dello staff di "Mense da Nonna Papera". Con la sua creatività culinaria e la sua attenzione ai dettagli, contribuisce a creare piatti straordinari. La sua personalità socievole e cordiale fa sì che i clienti si sentano ben accolti e soddisfatti. È un collaboratore stimato, ammirato dai colleghi e dai clienti per le sue abilità culinarie.</p>
                            </div>
                        </li>
                        
                        <li class="box">
                            <img src="foto_staff/foto severino.jpeg" alt="alt"/>
                            <div class="persona">
                                <h3>Severino</h3>
                                <hr>
                                <p>Severino è un membro esperto e leale dello staff di "Mense da Nonna Papera". Con la sua vasta conoscenza culinaria e la sua abilità nell'affrontare situazioni di pressione, contribuisce a mantenere gli standard di qualità e la coesione del team. La sua attenzione per i dettagli e la sua dedizione al lavoro lo rendono un collaboratore stimato, rispettato dai colleghi e apprezzato dai clienti.</p>
                            </div>
                        </li>
                        
                        
                    </ul>

                </article>
                
            </section>
            
            <!<!-- Contenuto secondario della pagina -->
            <section class="contentSecondario col-2">
                
            </section>
        
        <jsp:include page="footer.jsp" />
    </body>
</html>