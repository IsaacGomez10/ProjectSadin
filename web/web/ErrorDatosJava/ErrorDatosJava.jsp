<div>
    <%
    if (request.getAttribute("MensajeError") != null) {%>
    
    <script>
        alert('${MensajeError}');
    </script>
    
    <% }%>
</div>
