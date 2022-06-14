
<!DOCTYPE html>
<!-- Created By CodingNepal -->
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="Css/styleAlerts.css">
        <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
    </head>
    <body>
        
        <div class="alert hide">
            <span class="fas fa-exclamation-circle"></span>
            
            <span class="msg">
                <%if (request.getAttribute("MensajeError") != null) {%>  
                
                ${MensajeError} 
                
                <% }%>
            </span>
            
            <div class="close-btn">
                <span class="fas fa-times"></span>
            </div>
        </div>
            
        <script src="JavaScript/alertas.js"></script>
    </body>
</html>
