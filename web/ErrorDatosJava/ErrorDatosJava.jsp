<script>
    <%if (request.getAttribute("MensajeError") != null) {%>
    Swal.fire({
        icon: 'warning',
        text: 'Oop, ocurrio un error',
        html: '${MensajeError}',
        confirmButtonText: 'Cerrar'

    });

    <% } else {%>
    
    Swal.fire({
        icon: 'succcess',
        text:'Enhorabuena!',
        html: '${MensajeExito}',
        confirmButtonText: 'Cerrar'
    });
    <%}%>
</script>