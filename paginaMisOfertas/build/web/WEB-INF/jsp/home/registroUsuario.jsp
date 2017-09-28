<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Bienvenido a MisOfertas</title>

        <link href="<c:url value="/Resources/css/bootstrap.min.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/font-awesome/css/font-awesome.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/css/animate.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/css/style.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/css/plugins/dropzone/basic.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/css/plugins/dropzone/dropzone.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/css/plugins/jasny/jasny-bootstrap.min.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/css/plugins/codemirror/codemirror.css"/>" rel="stylesheet">

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
                                    <a aria-expanded="false" role="button" href="layouts.html">Inicio</a>
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
                                        <li><a href=""><i class="fa fa-address-book-o"></i> Crear Cuenta</a></li>
                                        <li><a href=""><i class="fa fa-user-o"></i> Perfil</a></li>
                                        <li><a href=""><i class="fa fa-sign-out"></i> Iniciar sesión </a></li>
                                        <li><a href=""><i class="fa fa-sign-in"></i> Cerrar sesión</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </nav>
                </div>
                <div class="wrapper-content">
                    <div class="container">
                        <div class="middle-box text-center loginscreen   animated fadeInDown">
                            <div>
                                <h3>Registro en MisOfertas</h3>
                                <p>Creación de cuenta</p>
                                <form class="m-t" role="form" method="post" action="registrar.htm">
                                    <input type="text" class="form-control" placeholder="Usuario" required="" name="nombreUsuario" value="<c:out value="${nombreValue}"/>">
                                    <c:out value="${nombreError}"/>

                                    <div class="form-group">
                                        <input type="email" class="form-control" placeholder="Email" required=""  name="email"  value="<c:out value="${emailValue}"/>" >
                                        <c:out value="${emailError}"/>
                                    </div>
                                    <div class="form-group">
                                        <input type="password" class="form-control" placeholder="Contraseña" required=""  name="clave">
                                    </div>
                                    <div class="form-group">
                                        <input type="password" class="form-control" placeholder="Repita Contraseña" required=""  name="repetirClave">
                                        <c:out value="${claveError}"/>
                                    </div>

                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Rut" required=""  name="rut" value="<c:out value="${rutValue}"/>">
                                        <c:out value="${errorRut}"/>
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Primer Nombre" required=""  name="primerNombre" value="<c:out value="${primerNValue}"/>">
                                        <c:out value="${errorPrimerN}"/>
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Segundo Nombre" required=""  name="segundoNombre" value="<c:out value="${segundoNValue}"/>">
                                        <c:out value="${errorSegundoN}"/>
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Primer Apellido" required=""  name="primerApellido" value="<c:out value="${primerApellidoDevuelta}"/>">
                                        <c:out value="${errorPrimerA}"/>
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Segundo Apellido" required="" name="segundoApellido" value="<c:out value="${segundoApellidoDevuelta}"/>">
                                        <c:out value="${errorSegundoA}"/>
                                    </div>
                                    <div class="form-group">
                                        <input type="date" class="form-control" placeholder="Fecha de nacimiento" required=""  name="fechaNacimiento" value="<c:out value="${fechaValue}"/>">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Dirección" required=""  name="direccion" value="<c:out value="${direccionValue}"/>">
                                        <c:out value="${errorDireccion}"/>
                                    </div>
                                    <div class="form-group">
                                        <input type="number" class="form-control" placeholder="Telefono" required=""  name="telefono" value="<c:out value="${telefonoValue}"/>">
                                        <c:out value="${errorTelefono}"/>
                                    </div>
                                    <!--
                                    <div class="fileinput fileinput-new input-group" data-provides="fileinput">
                                        <span class="input-group-addon btn btn-default btn-file">
                                            <span class="fileinput-new">Subir imagen de perfil</span>
                                            <span class="fileinput-exists">Cargar</span>
                                            <input type="file" name="..."/>
                                        </span>
                                        <div class="form-control" data-trigger="fileinput">
                                            <i class="glyphicon glyphicon-file fileinput-exists"></i>
                                            <span class="fileinput-filename"></span>
                                        </div>
                                    
                                        <a href="#" class="input-group-addon btn btn-default fileinput-exists" data-dismiss="fileinput">Remover</a>
                                    -->

                                    <div class="form-group">
                                        <div class="checkbox i-checks"><label> <input type="checkbox"><i></i> Acepta los terminos </label></div>
                                    </div>
                                    <input type="submit" value="Registrar" class="btn btn-primary block full-width m-b">

                                    <p class="text-muted text-center"><small>Ya tienes cuenta?</small></p>
                                    <a class="btn btn-sm btn-white btn-block" href="login.html">Ingresar</a>
                                </form>
                            </div>
                            <p class="m-t"> <small>Grupo 1&copy; 2017</small> </p>
                        </div>
                    </div>


                </div>

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
