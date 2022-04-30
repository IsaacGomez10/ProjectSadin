<div>
    <%
    if (request.getAttribute("mensajeError") != null) {%>
    
    <script>
        alert('${mensajeError}');
    </script>
    
    <% }%>
</div>
