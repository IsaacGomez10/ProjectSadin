function cambiarClave() {

    Swal.fire({
        imageUrl: "Css/recursos/Logo sadin.svg",
        imageWidth: 70,
        title: "¿Olvidaste tu contraseña?",
        html: '<form method="post" action="Funcionario">' +
                '<div class="form">' +
                '<div class="form__group">' +
                '<input type="text" name="txtUsuario" id="doc" class="form__input" placeholder=" " autocomplete="off" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">' +
                '<label for="doc" class="form__label"">Número de Documento</label>' +
                '</div>' +
                '</div>' +
                '<button class="btn" type="submit">Recuperar Contraseña</button>' +
                '<input type="hidden" value="4" name="opcion">' +
                '</form>',
        showCancelButton: true,
        showConfirmButton: false
    });

}
;

