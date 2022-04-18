//Fechas para inputs type date
window.onload = function () {
    let fecha = new Date(); //Fecha actual
    let mes = fecha.getMonth() + 1; //obteniendo mes
    let dia = fecha.getDate(); //obteniendo dia
    let ano = fecha.getFullYear(); //obteniendo año
    if (dia < 10)
        dia = '0' + dia; //agrega cero si el menor de 10
    if (mes < 10)
        mes = '0' + mes; //agrega cero si el menor de 10
    document.getElementById('fechaActual').value = ano + "-" + mes + "-" + dia;
    document.getElementById('fechaActual2').value = null;
};

//Limpiar datos de formularios
function  validar(){
    let formulario = document.getElementById('formulario');
    
    console.log('Empleado guardado correctamente!');
    formulario.reset();
    return false;
}
