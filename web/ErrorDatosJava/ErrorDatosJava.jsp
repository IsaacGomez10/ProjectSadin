<div>
    <%
    if (request.getAttribute("MensajeError") != null) {%>
    
    <script>
        alert('${MensajeError}');
    </script>
     <% } else {%>
     <script>
        alert('${MensajeExito}');
    </script>
    <% }%>
</div>
