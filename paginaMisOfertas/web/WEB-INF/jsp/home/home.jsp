<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Bienvenido a MisOfertas</title>

        <link href="<c:url value="/Resources/css/bootstrap.min.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/font-awesome/css/font-awesome.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/css/animate.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/css/style.css"/>" rel="stylesheet">

    </head>

    <body class="top-navigation">

        <div id="wrapper">
            <div id="page-wrapper" class="gray-bg">
                <div class="row border-bottom white-bg">
                    <nav class="navbar navbar-static-top" role="navigation">
                        <div class="navbar-header">
                            <button aria-controls="navbar" aria-expanded="false" data-target="#navbar" data-toggle="collapse" class="navbar-toggle collapsed" type="button">
                                <i class="fa fa-reorder"></i>
                            </button>
                            <a href="#" class="navbar-brand">MisOfertas</a>
                        </div>
                        <div class="navbar-collapse collapse" id="navbar">
                            <ul class="nav navbar-nav">
                                <li class="active">
                                    <a aria-expanded="false" role="button" href="home.htm">Inicio</a>
                                </li>
                                <li class="dropdown">
                                    <a aria-expanded="false" role="button" href="#" class="dropdown-toggle" data-toggle="dropdown"> Destacados </a>
                                </li>
                                <li class="dropdown">
                                    <a aria-expanded="false" role="button" href="#" class="dropdown-toggle" data-toggle="dropdown"> En tu ciudad </a>
                                </li>
                                <li class="dropdown">
                                    <a aria-expanded="false" role="button" href="#" class="dropdown-toggle" data-toggle="dropdown"> Productos <span class="caret"></span></a>
                                    <ul role="menu" class="dropdown-menu">
                                        <li><a href="">Categorias</a></li>
                                        <li><a href="">Ofertas del dia</a></li>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a aria-expanded="false" role="button" href="#" class="dropdown-toggle" data-toggle="dropdown"> Tiendas </a>
                                </li>
                            </ul>
                            <ul class="nav navbar-top-links navbar-right">
                                <li class="dropdown">
                                    <a aria-expanded="false" role="button" href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user-circle-o"></i><span class="caret"></span></a>
                                    <ul role="menu" class="dropdown-menu">
                                        <li><a href="registrar.htm"><i class="fa fa-address-book-o"></i> Crear Cuenta</a></li>                            
                                        <li><a href="login.htm"><i class="fa fa-sign-out"></i> Iniciar sesión </a></li>
                                        <li><a href="cerrarSesion.htm"><i class="fa fa-sign-in"></i> Cerrar sesión</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </nav>
                </div>



                <div class="wrapper wrapper-content">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="ibox float-e-margins">
                                    <div class="ibox-content">
                                        <h2>Nuevas Ofertas</h2>
                                        <p>
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <c:forEach items="${listaOfertas}" var="map" >
                                <div class="col-md-4">
                                    <div class="ibox">
                                        <div class="ibox-content product-box">                                        
                                            <div class="product-imitation">
                                                [ INFO ]
                                            </div>                                      
                                            <div class="product-desc">
                                                <span class="product-price">
                                                    ${map.descuento}%
                                                </span>                                                
                                                <h4 class="product-name">${map.producto}</h4>
                                                <div class="small m-t-xs">
                                                    ${map.descripcion}
                                                </div>
                                                <div class="m-t text-righ">
                                                    <a data-toggle="modal" href="#modal-oferta-${map.id}" class="btn btn-xs btn-outline btn-primary">Más Detalles <i class="fa fa-long-arrow-right"></i> </a>
                                                </div>
                                            </div>
                                            <div id="modal-oferta-${map.id}" class="modal fade" aria-hidden="true">
                                                <div class="modal-dialog">
                                                    <div class="modal-content">
                                                        <div class="modal-body">
                                                            <div class="row">
                                                                <div><h3 class="m-t-none m-b text-center">Detalle OFERTA</h3>
                                                                    <dl class="dl-horizontal">
                                                                        <dt>Nombre Oferta:</dt>
                                                                        <dd>asd</dd>
                                                                        <dt>Descripción:</dt>
                                                                        <dd>${map.descripcion}</dd>
                                                                        <dt>Precio:</dt>
                                                                        <dd>${map.precio}</dd>                                                                                                                                         
                                                                        <dt>Porcentaje Descuento:</dt>
                                                                        <dd>${map.descuento}</dd>
                                                                        <dt>Condiciones:</dt>
                                                                        <dd>${map.condiciones}</dd>
                                                                        <dt>Fecha Inicial:</dt>
                                                                        <dd>${map.fechainicio}</dd>
                                                                        <dt>Fecha Final:</dt>
                                                                        <dd>${map.fechatermino}</dd> 
                                                                        <br>
                                                                        <dd>
                                                                            <div class="small m-t-xs text-center">
                                                                                Promoción Valida Solo en&nbsp;${map.empresa} hasta ${map.fechatermino} 
                                                                            </div>                                                                                                                                                       
                                                                        </dd>
                                                                        <dd>
                                                                            <div class="small m-t-xs text-center">
                                                                                o hasta agotar stock.
                                                                            </div>
                                                                        </dd>
                                                                    </dl>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>                                       
                                    </div>
                                </div>
                            </c:forEach>
                            <div class="col-lg-12">
                                <div class="ibox float-e-margins">

                                    <div class="ibox-content">
                                        <h2>Alimentos y Bebestibles</h2>
                                        <p>
                                        </p>
                                    </div>
                                </div>
                            </div>

                            <c:forEach items="${listaAlimentos}" var="otro" >
                                <div class="col-md-4">
                                    <div class="ibox">
                                        <div class="ibox-content product-box">
                                            <div class="product-imitation">
                                                [ INFO ]
                                            </div>
                                            <div class="product-desc">
                                                <span class="product-price">
                                                    ${otro.precio}$
                                                </span>
                                                <small class="text-muted"></small>
                                                <h4 class="product-name">${otro.nombreProducto}</h4>
                                                <div class="small m-t-xs text-center">
                                                    Producto Destacado
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>

                            <div class="col-lg-12">
                                <div class="ibox float-e-margins">

                                    <div class="ibox-content">
                                        <h2>Electronica</h2>
                                        <p>
                                        </p>
                                    </div>
                                </div>
                            </div>

                            <c:forEach items="${listaElectronica}" var="otro1" >
                                <div class="col-md-4">
                                    <div class="ibox">
                                        <div class="ibox-content product-box">
                                            <div class="product-imitation">
                                                [ INFO ]
                                            </div>
                                            <div class="product-desc">
                                                <span class="product-price">
                                                    ${otro1.precio}$
                                                </span>
                                                <small class="text-muted"></small>
                                                <h4 class="product-name">${otro1.nombreProducto}</h4>
                                                <div class="small m-t-xs text-center">
                                                    Producto Destacado
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>

                            <div class="col-lg-12">
                                <div class="ibox float-e-margins">

                                    <div class="ibox-content">
                                        <h2>Linea Blanca</h2>
                                        <p>
                                        </p>
                                    </div>
                                </div>
                            </div>

                            <c:forEach items="${listaLineaBlanca}" var="otro2" >
                                <div class="col-md-4">
                                    <div class="ibox">
                                        <div class="ibox-content product-box">
                                            <div class="product-imitation">
                                                [ INFO ]
                                            </div>
                                            <div class="product-desc">
                                                <span class="product-price">
                                                    ${otro2.precio}$
                                                </span>
                                                <small class="text-muted"></small>
                                                <h4 class="product-name">${otro2.nombreProducto}</h4>
                                                <div class="small m-t-xs text-center">
                                                    Producto Destacado
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>


                            <div class="col-lg-12">
                                <div class="ibox float-e-margins">

                                    <div class="ibox-content">
                                        <h2>Ropa y Calzado</h2>
                                        <p>
                                        </p>
                                    </div>
                                </div>
                            </div>

                            <c:forEach items="${listaRopa}" var="otro3" >
                                <div class="col-md-4">
                                    <div class="ibox">
                                        <div class="ibox-content product-box">
                                            <div class="product-imitation">
                                                [ INFO ]
                                            </div>
                                            <div class="product-desc">
                                                <span class="product-price">
                                                    ${otro3.precio}$
                                                </span>
                                                <small class="text-muted"></small>
                                                <h4 class="product-name">${otro3.nombreProducto}</h4>
                                                <div class="small m-t-xs text-center">
                                                    Producto Destacado
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                        <div class="footer">
                            <div>
                                <strong></strong> Grupo 1&copy; 2017
                            </div>
                        </div>

                    </div>
                </div>



                <!-- Mainly scripts -->
                <script src="<c:url value="/Resources/js/jquery-3.1.1.min.js"/>"></script>
                <script src="<c:url value="/Resources/js/bootstrap.min.js"/>"></script>
                <script src="<c:url value="/Resources/js/plugins/metisMenu/jquery.metisMenu.js"/>"></script>
                <script src="<c:url value="/Resources/js/plugins/slimscroll/jquery.slimscroll.min.js"/>"></script>

                <!-- Custom and plugin javascript -->
                <script src="<c:url value="/Resources/js/inspinia.js"/>"></script>
                <script src="<c:url value="/Resources/js/plugins/pace/pace.min.js"/>"></script>

                <!-- Flot -->
                <script src="<c:url value="/Resources/js/plugins/flot/jquery.flot.js"/>"></script>
                <script src="<c:url value="/Resources/js/plugins/flot/jquery.flot.tooltip.min.js"/>"></script>
                <script src="<c:url value="/Resources/js/plugins/flot/jquery.flot.resize.js"/>"></script>

                <!-- ChartJS-->
                <script src="<c:url value="/Resources/js/plugins/chartJs/Chart.min.js"/>"></script>

                <!-- Peity -->
                <script src="<c:url value="/Resources/js/plugins/peity/jquery.peity.min.js"/>"></script>
                <!-- Peity demo -->
                <script src="<c:url value="/Resources/js/demo/peity-demo.js"/>"></script>


                <script>
                    $(document).ready(function () {


                        var d1 = [[1262304000000, 6], [1264982400000, 3057], [1267401600000, 20434], [1270080000000, 31982], [1272672000000, 26602], [1275350400000, 27826], [1277942400000, 24302], [1280620800000, 24237], [1283299200000, 21004], [1285891200000, 12144], [1288569600000, 10577], [1291161600000, 10295]];
                        var d2 = [[1262304000000, 5], [1264982400000, 200], [1267401600000, 1605], [1270080000000, 6129], [1272672000000, 11643], [1275350400000, 19055], [1277942400000, 30062], [1280620800000, 39197], [1283299200000, 37000], [1285891200000, 27000], [1288569600000, 21000], [1291161600000, 17000]];

                        var data1 = [
                            {label: "Data 1", data: d1, color: '#17a084'},
                            {label: "Data 2", data: d2, color: '#127e68'}
                        ];
                        $.plot($("#flot-chart1"), data1, {
                            xaxis: {
                                tickDecimals: 0
                            },
                            series: {
                                lines: {
                                    show: true,
                                    fill: true,
                                    fillColor: {
                                        colors: [{
                                                opacity: 1
                                            }, {
                                                opacity: 1
                                            }]
                                    },
                                },
                                points: {
                                    width: 0.1,
                                    show: false
                                },
                            },
                            grid: {
                                show: false,
                                borderWidth: 0
                            },
                            legend: {
                                show: false,
                            }
                        });

                        var lineData = {
                            labels: ["January", "February", "March", "April", "May", "June", "July"],
                            datasets: [
                                {
                                    label: "Example dataset",
                                    backgroundColor: "rgba(26,179,148,0.5)",
                                    borderColor: "rgba(26,179,148,0.7)",
                                    pointBackgroundColor: "rgba(26,179,148,1)",
                                    pointBorderColor: "#fff",
                                    data: [48, 48, 60, 39, 56, 37, 30]
                                },
                                {
                                    label: "Example dataset",
                                    backgroundColor: "rgba(220,220,220,0.5)",
                                    borderColor: "rgba(220,220,220,1)",
                                    pointBackgroundColor: "rgba(220,220,220,1)",
                                    pointBorderColor: "#fff",
                                    data: [65, 59, 40, 51, 36, 25, 40]
                                }
                            ]
                        };

                        var lineOptions = {
                            responsive: true
                        };


                        var ctx = document.getElementById("lineChart").getContext("2d");
                        new Chart(ctx, {type: 'line', data: lineData, options: lineOptions});

                    });
                </script>

                </body>

                </html>

