<script>
    <%if (request.getAttribute("MensajeError") != null) {%>
    (window)Swal.fire({
        icon: 'warning',
        text: 'Oop, ocurrio un error',
        html: `${MensajeError}`,
        confirmButtonText: 'Cerrar'

    });

    <% } else {%>
    Swal.fire({
        icon: 'succcess',
        text:'En hora buena!',
        html: `${MensajeExito}`,
        confirmButtonText: 'Cerrar'
    });
    <%}%>
</script>