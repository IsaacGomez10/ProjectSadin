const formulario = document.getElementById('formulario');
const inputs = document.querySelectorAll('#formulario input');


const expresiones = {

    nombre: /^[a-zA-ZÀ-ÿ\s]{1,40}$/, // Letras y espacios, pueden llevar acentos.
    apellido: /^[a-zA-ZÀ-ÿ\s]{1,40}$/, // Letras y espacios, pueden llevar acentos.
    email: /^(([^<>()\[\]\\.,;:\s@”]+(\.[^<>()\[\]\\.,;:\s@”]+)*)|(“.+”))@((\[[0–9]{1,3}\.[0–9]{1,3}\.[0–9]{1,3}\.[0–9]{1,3}])|(([a-zA-Z\-0–9]+\.)+[a-zA-Z]{2,}))$/, //expreciones de correo electrónico
    tipoDocumento: /^[a-zA-ZÀ-ÿ\s]/,
    lugarExpedicion: /^[a-zA-ZÀ-ÿ\s]/,
    telefono: /^[\s\S]{0,10}$/, // 7 a 10 numeros.
    numeroDocumento: /^[\s\S]{0,20}$/ // 7 a 20 numeros.
}

const campos = {
    nombre: false,
    apellido: false,
    tipoDocumento: false,
    lugarExpedicion: false,
    numeroDocumento: false,
    telefono: false,
    email: false
}


const validarFormulario = (e) => {
    switch (e.target.name) {
        case "txtNombres":
            validarCampo(expresiones.nombre, e.target, 'nombre');
            break;
        case "txtApellidos":
            validarCampo(expresiones.apellido, e.target, 'apellido');
            break;

        case "txtIdTipoDocumento":
            validarCampo(expresiones.tipoDocumento, e.target, 'tipoDocumento');
            break;


        case "txtNumeroDocumento":
            validarCampo(expresiones.numeroDocumento, e.target, 'numeroDocumento');

            break;
        case "txtTelefono":
            validarCampo(expresiones.telefono, e.target, 'telefono');

            break;
        case "txtEmail":
            validarCampo(expresiones.email, e.target, 'email');
            break;


        case "txtIdLugarExpedicion":
            validarCampo(expresiones.lugarExpedicion, e.target, 'lugarExpedicion');
            break;


    }
}

const validarCampo = (expresion, input, campo) => {
    if (expresion.test(input.value)) {
        document.getElementById(`grupo__${campo}`).classList.remove('formulario__grupo-incorrecto');
        document.getElementById(`grupo__${campo}`).classList.add('formulario__grupo-correcto');
        document.querySelector(`#grupo__${campo} i`).classList.add('fa-check-circle');
        document.querySelector(`#grupo__${campo} i`).classList.remove('fa-times-circle');
        document.querySelector(`#grupo__${campo} i`).classList.remove('fa-times-circle');
        document.querySelector(`#grupo__${campo} i`).classList.remove('fa-times-circle');

        document.querySelector(`#grupo__${campo} .formulario__input-error`).classList.remove('formulario__input-error-activo');
        campos[campo] = true;
    } else {
        document.getElementById(`grupo__${campo}`).classList.add('formulario__grupo-incorrecto');
        document.getElementById(`grupo__${campo}`).classList.remove('formulario__grupo-correcto');
        document.querySelector(`#grupo__${campo} i`).classList.add('fa-times-circle');
        document.querySelector(`#grupo__${campo} i`).classList.remove('fa-check-circle');
        document.querySelector(`#grupo__${campo} i`).classList.remove('fa-check-circle');
        document.querySelector(`#grupo__${campo} i`).classList.remove('fa-check-circle');


        document.querySelector(`#grupo__${campo} .formulario__input-error`).classList.add('formulario__input-error-activo');
        campos[campo] = false;
    }
}



inputs.forEach((input) => {
    input.addEventListener('keyup', validarFormulario);
    input.addEventListener('blur', validarFormulario);
});


//formulario.addEventListener('submit', (e) => {
// e.preventDefault();

//const terminos = document.getElementById('terminos');
//if (campos.nombre && campos.apellido && campos.tipoDocumento && campos.numeroDocumento && campos.telefono && campos.email && campos.lugarExpedicion) {
// formulario.reset();

//document.getElementById('formulario__mensaje-exito').classList.add('formulario__mensaje-exito-activo');
//setTimeout(() => {
//document.getElementById('formulario__mensaje-exito').classList.remove('formulario__mensaje-exito-activo');
// }, 5000);

//document.querySelectorAll('.formulario__grupo-correcto').forEach((icono) => {
//icono.classList.remove('formulario__grupo-correcto');
// });
// } else {
//     document.getElementById('formulario__mensaje').classList.add('formulario__mensaje-activo');
//    }
//});




