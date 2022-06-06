function doSearch(){
    var registros = document.getElementById('datos');
    var buscar = document.getElementById('buscarDocumento').value.toLowerCase();
    var celdaPorFila = "";
    var encontrar = false;
    var compararCon = "";

    // Recorremos todas las filas con contenido de la tabla
    for (var i = 1; i < registros.rows.length; i++)
    {
        celdaPorFila = registros.rows[i].getElementsByTagName('td');
        encontrar = false;
        // Recorremos todas las celdas
        for (var j = 0; j < celdaPorFila.length && !encontrar; j++)
        {
            compararCon = celdaPorFila[j].innerHTML.toLowerCase();
            // Buscamos el texto en el contenido de la celda
            if (buscar.length == 0 || (compararCon.indexOf(buscar) > -1))
            {
                encontrar = true;
            }
        }
        if (encontrar)
        {
            registros.rows[i].style.display = '';
        } else {
            // si no ha encontrado ninguna coincidencia, esconde la
            // fila de la tabla
            registros.rows[i].style.display = 'none';
        }
    }
}