<%@page import="ModeloDAO.EmpleadoDAO"%>
<script>
    <%
        EmpleadoDAO conteo = new EmpleadoDAO();
        
        int funcionarios = conteo.contarFuncionarios();
        int activos = conteo.contarEmpleadosActivos();
        int registro = conteo.contarEmpleados();
%>
    $(function () {
        var doughnutPieData = {
            datasets: [{
                    data: [<%=registro%>, <%=funcionarios%>,<%=activos%>],
                    backgroundColor: [
                        'rgba(255, 99, 132, 0.5)',
                        'rgba(54, 162, 235, 0.5)',
                        'rgba(255, 206, 86, 0.5)',
                        'rgba(75, 192, 192, 0.5)',
                        'rgba(153, 102, 255, 0.5)',
                        'rgba(255, 159, 64, 0.5)'
                    ],
                    borderColor: [
                        'rgba(255,99,132,1)',
                        'rgba(54, 162, 235, 1)',
                        'rgba(255, 206, 86, 1)',
                        'rgba(75, 192, 192, 1)',
                        'rgba(153, 102, 255, 1)',
                        'rgba(255, 159, 64, 1)'
                    ],
                }],

            // These labels appear in the legend and in the tooltips when hovering different arcs
            labels: [
                'Empleados Registrados',
                'Funcionarios Registrados',
                'Empleados Activos'
            ]
        };
        var doughnutPieOptions = {
            responsive: true,
            animation: {
                animateScale: true,
                animateRotate: true
            }
        };

        if ($("#pieChart").length) {
            var pieChartCanvas = $("#pieChart").get(0).getContext("2d");
            var pieChart = new Chart(pieChartCanvas, {
                type: 'pie',
                data: doughnutPieData,
                options: doughnutPieOptions
            });
        }
    });
</script>