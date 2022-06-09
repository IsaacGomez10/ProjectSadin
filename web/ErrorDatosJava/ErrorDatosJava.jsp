<head>

</head>
<div>
    <script>

        <%
            if (request.getAttribute("MensajeError") != null) {%>

        alert('${MensajeError}');

        <% } else {%>
        alert('Bienvenido!!');
        <% }%>

    </script>


</div>
