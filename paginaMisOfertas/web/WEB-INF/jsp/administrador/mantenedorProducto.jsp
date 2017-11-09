<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Mantenedor Producto</title>

        <link href="<c:url value="/Resources/css/bootstrap.min.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/font-awesome/css/font-awesome.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/css/plugins/footable/footable.core.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/css/animate.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/css/style.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/css/plugins/dropzone/basic.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/css/plugins/dropzone/dropzone.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/css/plugins/jasny/jasny-bootstrap.min.css"/>" rel="stylesheet">
        <link href="<c:url value="/Resources/css/plugins/codemirror/codemirror.css"/>" rel="stylesheet">

    </head>

    <body>

        <div id="wrapper">

            <!-- Navegacion-->
            <nav class="navbar-default navbar-static-side" role="navigation">
                <div class="sidebar-collapse">
                    <ul class="nav metismenu" id="side-menu">
                        <li class="nav-header">
                            <div class="dropdown profile-element"> <span>
                                    <img alt="image" class="img-circle" src="Resources/img/profile_small.jpg" />
                                </span>
                                <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                                    <span class="clear"> <span class="block m-t-xs"> <strong class="font-bold">Usuario:<c:out value="${nombreSesion}"/></strong>
                                        </span> <span class="text-muted text-xs block">Administrador<b class="caret"></b></span> </span> </a>
                                <ul class="dropdown-menu animated fadeInRight m-t-xs">
                                    <li><a href="profile.html">Perfil</a></li>
                                    <li class="divider"></li>
                                    <li><a href="cerrarSesion.htm">Cerrar sesion</a></li>
                                </ul>
                            </div>
                            <div class="logo-element">
                                M.O.
                            </div>
                        </li>
                        <li>
                            <a href="index.html"><i class="fa fa-th-large"></i> <span class="nav-label">Mantenedores</span> <span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level collapse"> 
                                 <li><a href="mantenedorUsuario.htm">Usuario</a></li>
                                <li><a href="mantenedorEmpresa.htm">Empresa</a></li>
                                <li class="active"><a href="mantenedorProducto.htm">Producto</a></li>
                                <li ><a href="mantenedorDescuento.htm">Descuento</a></li>
                            </ul>
                        </li>
                    </ul>

                </div>
            </nav>
            <!-- Navegacion-->
            <!-- Header-->

            <div id="page-wrapper" class="gray-bg">
                <div class="row border-bottom">
                    <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
                        <div class="navbar-header">
                            <a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i> </a>
                        </div>
                        <ul class="nav navbar-top-links navbar-right">
                            <li>
                                <span class="m-r-sm text-muted welcome-message">Bienvenido a MisOfertas Sr(a):<c:out value="${nombreSesion}"/></span>
                            </li>


                            <li>
                                <a href="cerrarSesion.htm">
                                    <i class="fa fa-sign-out"></i> Cerrar sesión
                                </a>
                            </li>
                        </ul>

                    </nav>
                    <!-- Header-->
                    <!-- Body--> 
                </div>
                <div class="row wrapper border-bottom white-bg page-heading">
                    <div class="col-lg-10">
                        <h2>Mantenedor Producto</h2>
                        <ol class="breadcrumb">
                            <li>
                                <a href="home.htm">Inicio</a>
                            </li>
                            <li>
                                <a>Mantenedores</a>
                            </li>
                            <li class="active">
                                <strong>Producto</strong>
                            </li>
                        </ol>
                    </div>
                    <div class="col-lg-2">

                    </div>
                </div>


                <div class="wrapper wrapper-content animated fadeInRight">

                    <div class="row">
                        <div class="col-lg-12">
                            <div class="ibox float-e-margins">
                                <div class="ibox-title">
                                    <h5>Mantenimiento de Producto</h5>
                                    <div class="text-right">
                                        <a data-toggle="modal" class="btn btn-primary" href="#modal-agregar">Agregar Producto</a>
                                        <a data-toggle="modal" class="btn btn-primary" href="#modal-modificar">Modificar Producto</a>
                                    </div>                                
                                </div>
                                <c:out value="${errorGeneral}"/>
                                <div class="ibox-content">
                                    <table class="footable table table-stripped toggle-arrow-tiny" name="tabEmpresa">
                                        <thead>
                                            <tr>                                             
                                                <th data-hide="all">ID</th>
                                                <th data-hide="all">Nombre</th>
                                                <th data-hide="all">Precio</th>
                                                <th data-hide="all">Descripción</th>
                                                <th data-hide="all">Fotografía</th>                                   
                                                <th data-hide="all">Activo</th>
                                                <th data-hide="all">Empresa</th>
                                                <th data-hide="all">Tipo de producto</th>
                                                <th data-hide="all">Fecha de ingreso</th>
                                                <th data-hide="all">fecha de caducidad</th>
                                                <th data-hide="all">Acción</th>

                                            </tr>
                                        </thead>
                                        <tbody>
                                            <!-- Aqui va el metodo Foreach -->

                                            <c:forEach items="${listadoProductoEmpresa}" var="map" >
                                                <tr>
                                                    <td>
                                                        ${map.idProducto}                                                              
                                                    </td>
                                                    <td>${map.nombre}</td>
                                                    <td>${map.precio    }</td>
                                                    <td>${map.descripcionProducto}</td>
                                                    <td>${map.urlFoto}</td>
                                                    <td>
                                                        <c:if test="${map.activo ==1}">
                                                            SI
                                                        </c:if>
                                                        <c:if test="${map.activo ==2}">
                                                            NO
                                                        </c:if>

                                                    </td>
                                                    <td>${map.empresa}</td>
                                                    <td>${map.tipoProducto}</td>
                                                    <td>${map.fechaIngreso}</td>
                                                    <td>${map.fechaCaducidad}</td>                                                 
                                                    <td>
                                                        <form action="eliminarProducto.htm" method="POST">
                                                            <input type="hidden" value="${map.idProducto}" name="idProductoEscondido">
                                                            <button type="submit" value="${map.idProducto}" class="btn btn-primary dropdown-toggle">Eliminar</button>
                                                        </form>  
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                        <tfoot>
                                            <tr>
                                                <td colspan="10">
                                                    <ul class="pagination pull-right"></ul>
                                                </td>
                                            </tr>
                                        </tfoot>
                                    </table>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!--body-->
                <!--footer-->
                <div class="footer">
                    <div class="pull-right">

                    </div>
                    <div>
                        Grupo 1 &copy; 2017
                    </div>
                </div>

            </div>
        </div>

        <div id="modal-agregar" class="modal fade" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-body">
                        <div class="row">
                            <div><h3 class="m-t-none m-b">Agregar Producto</h3>
                                <form role="form"  method="post" action="agregarProducto.htm">
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Nombre" required="" name="nombre" value="<c:out value="${nombreDev}"/>">
                                        <c:out value="${nombreError}"/>
                                    </div>
                                    <div class="form-group">
                                        <input type="number" class="form-control" placeholder="Precio" required="" name="precio"  value="<c:out value="${precioDev}"/>">
                                        <c:out value="${precioError}"/>
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Descripcion" required="" name="descripcion" value="<c:out value="${descripcionDev}"/>">
                                        <c:out value="${descripcionError}"/>
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="imagen" required="" name="imagen" value="">
                                        <c:out value=""/>
                                    </div>
                                    <div class="form-group">
                                        <c:out value="${activoError}"/>
                                        <select class="form-control m-b" name="activo">
                                            <option value="2" selected="selected" >¿Activo?</option>   
                                            <option value="1">Si</option>
                                            <option value="0">No</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <select class="form-control m-b" name="idEmpresa">
                                            <option value="-1" selected="selected" >Seleccione empresa</option>   
                                            <c:forEach items="${listadoEmpresas}" var="map" >
                                                <option value="${map.idEmpresa}">${map.nombre}</option>          
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <select class="form-control m-b" name="idTipoProducto">
                                            <option value="-1" selected="selected" >Seleccione tipo de producto</option>   
                                            <c:forEach items="${listarTipoProducto}" var="map2" >
                                                <option value="${map2.idProducto}">${map2.nombre}</option>          
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        Fecha de actual:<br>
                                        <input type="date" class="form-control" required="" name="fechaIngreso" value="<c:out value="${fechaIngresodDev}"/>">
                                        <c:out value="${fechaIngresoError}"/>
                                    </div>

                                    <div class="form-group">
                                        Fecha de caducidad:<br>

                                        <input type="date" class="form-control" required="" name="fechaCaducidad" value="<c:out value="${fechaCaducidadDev}"/>">
                                        <c:out value="${fechaCaducidadError}"/>
                                    </div>

                                    <input class="btn btn-primary" type="submit" value="Agregar producto">

                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div id="modal-modificar" class="modal fade" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-body">
                        <div class="row">
                            <div><h3 class="m-t-none m-b">Modificar Producto</h3>
                                <form role="form"  method="post" action="modificarProducto.htm">
                                    <select class="form-control m-b" name="idProductoModificar">
                                        <option value="-1" selected="selected" >Seleccione producto</option>   
                                        <c:forEach items="${listarProducto}" var="map" >
                                            <option value="${map.idProducto}">${map.nombre}</option>          
                                        </c:forEach>
                                    </select>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Nombre" required="" name="nombre" value="<c:out value="${nombreDev}"/>">
                                        <c:out value="${nombreError}"/>
                                    </div>
                                    <div class="form-group">
                                        <input type="number" class="form-control" placeholder="Precio" required="" name="precio"  value="<c:out value="${precioDev}"/>">
                                        <c:out value="${precioError}"/>
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Descripcion" required="" name="descripcion" value="<c:out value="${descripcionDev}"/>">
                                        <c:out value="${descripcionError}"/>
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="imagen" required="" name="imagen" value="">
                                        <c:out value=""/>
                                    </div>
                                    <div class="form-group">
                                        <c:out value="${activoError}"/>
                                        <select class="form-control m-b" name="activo">
                                            <option value="2" selected="selected" >¿Activo?</option>   
                                            <option value="1">Si</option>
                                            <option value="0">No</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <select class="form-control m-b" name="idEmpresa">
                                            <option value="-1" selected="selected" >Seleccione empresa</option>   
                                            <c:forEach items="${listadoEmpresas}" var="map" >
                                                <option value="${map.idEmpresa}">${map.nombre}</option>          
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <select class="form-control m-b" name="idTipoProducto">
                                            <option value="-1" selected="selected" >Seleccione tipo de producto</option>   
                                            <c:forEach items="${listarTipoProducto}" var="map2" >
                                                <option value="${map2.idProducto}">${map2.nombre}</option>          
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        Fecha de actual:<br>

                                        <input type="date" class="form-control" required="" name="fechaIngreso" value="<c:out value="${fechaIngresodDev}"/>">
                                        <c:out value="${fechaIngresoError}"/>
                                    </div>
                                    <div class="form-group">
                                        Fecha de caducidad:<br>

                                        <input type="date" class="form-control" required="" name="fechaCaducidad" value="<c:out value="${fechaCaducidadDev}"/>">
                                        <c:out value="${fechaCaducidadError}"/>
                                    </div>

                                    <input class="btn btn-primary" type="submit" value="Modificar producto">
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <!-- Mainly scripts -->
        <script src="<c:url value="/Resources/js/jquery-3.1.1.min.js"/>"></script>
        <script src="<c:url value="/Resources/js/bootstrap.min.js"/>"></script>
        <script src="<c:url value="/Resources/js/plugins/metisMenu/jquery.metisMenu.js"/>"></script>
        <script src="<c:url value="/Resources/js/plugins/slimscroll/jquery.slimscroll.min.js"/>"></script>

        <!-- FooTable -->
        <script src="<c:url value="/Resources/js/plugins/footable/footable.all.min.js"/>"></script>

        <!-- Custom and plugin javascript -->
        <script src="<c:url value="/Resources/js/inspinia.js"/>"></script>
        <script src="<c:url value="/Resources/js/plugins/pace/pace.min.js"/>"></script>

        <!-- Page-Level Scripts -->

        <!-- Page-Level Scripts -->
        <script>
            $(function () {
                $(".buscarIDModificar").each(function (index) {
                    $(this).on("click", function () {
                        var valor = $(this).val();
                        alert(valor);
                    });
                });
            });
        </script>
    </body>
</html>
