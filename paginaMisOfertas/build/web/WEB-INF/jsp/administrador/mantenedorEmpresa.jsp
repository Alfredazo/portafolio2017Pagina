<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Mantenedor empresa</title>

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
                        <li class="active"><a href="mantenedorEmpresa.htm">Empresa</a></li>
                        <li><a href="dashboard_3.html">Producto</a></li>
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
                    <h2>Mantenedor Empresa</h2>
                    <ol class="breadcrumb">
                        <li>
                            <a href="home.htm">Inicio</a>
                        </li>
                        <li>
                            <a>Mantenedores</a>
                        </li>
                        <li class="active">
                            <strong>Empresa</strong>
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
                            <h5>Mantenimiento de Empresas</h5>
                        <div class="text-right">
                            <a data-toggle="modal" class="btn btn-primary" href="#modal-agregar">Agregar Empresa</a>
                        </div>

                    </div>
                        <div class="ibox-content">

                            <table class="footable table table-stripped toggle-arrow-tiny">
                                <thead>
                                <tr>
                                             
                                    <th data-hide="all">ID</th>
                                    <th data-hide="all">Nombre</th>
                                    <th data-hide="all">Descripcion</th>
                                    <th data-hide="all">ID Tipo Empresa</th>
                                    <th data-hide="all">Activo</th>
                                    <th data-hide="all">Producto ID</th>
                                    <th data-hide="all">ROL</th>
                                    <th data-hide="all">RUT</th>
                                    <th data-hide="all">Accion</th>
                                    
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                                                      
                                    <td>1</td>
                                    <td>Tottus</td>
                                    <td>Descripcion</td>
                                    <td>1</td>
                                    <td>1</td> 
                                    <td>3</td>
                                    <td>Venta de Productos</td>
                                    <td>783344332</td>
                            <td><div class="btn-group">
                                            <button data-toggle="dropdown" class="btn btn-primary dropdown-toggle">Acción <span class="caret"></span></button>
                                        <ul class="dropdown-menu">
                                            <li><a data-toggle="modal" href="#modal-Modificar">Modificar</a></li>
                                            <li class="divider"></li>
                                            <li><a data-toggle="modal" href="#modal-eliminar">Eliminar</a></li>
                                        </ul>
                                        </div>




                                </tr>
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
                                                <div><h3 class="m-t-none m-b">Agregar Empresa</h3>
                                                    <form role="form">
                                                        
                                                        <div class="form-group">
                                                            <input type="email" class="form-control" placeholder="Nombre" required="">
                                                        </div>
                                                        <div class="form-group">
                                                            <input type="password" class="form-control" placeholder="Descripcion" required="">
                                                        </div>
                                                       
                                                         <div class="form-group">
                                                            <select class="form-control m-b" name="account">
                                                                <option selected="selected" >Tipo Empresa</option>   
                                                                <option>Compañia LTDA</option>
                                                                <option>Sociedad Anonima</option>
                                                                
                                                            </select>
                                                        </div>
                                                        
                                                        <div class="form-group">
                                                            <input type="text" class="form-control" placeholder="Activo" required="">
                                                        </div>
                                                        <div class="form-group">
                                                            <input type="text" class="form-control" placeholder="Producto" required="">
                                                        </div>
                                                        <div class="form-group">
                                                            <input type="text" class="form-control" placeholder="ROL" required="">
                                                        </div>
                                                        
                                                        <div class="form-group">
                                                            <input type="text" class="form-control" placeholder="RUT
                                                            " required="">
                                                        </div>
                                                         <div class="text-right">
                            <a class="btn btn-primary" href="">Agregar </a>
                        </div>
                                                       
                                                    </form>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                        </div>
    
 <div id="modal-Modificar" class="modal fade" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-body">
                                            <div class="row">
                                                <div><h3 class="m-t-none m-b">Modificar Empresa</h3>
                                                    <form role="form">
                                                        
                                                        <div class="form-group">
                                                            <input type="email" class="form-control" placeholder="Nombre" required="">
                                                        </div>
                                                        <div class="form-group">
                                                            <input type="password" class="form-control" placeholder="Descripcion" required="">
                                                        </div>
                                                       
                                                         <div class="form-group">
                                                            <select class="form-control m-b" name="account">
                                                                <option selected="selected" >Tipo Empresa</option>   
                                                                <option>Compañia LTDA</option>
                                                                <option>Sociedad Anonima</option>
                                                                
                                                            </select>
                                                        </div>
                                                        
                                                        <div class="form-group">
                                                            <input type="text" class="form-control" placeholder="Activo" required="">
                                                        </div>
                                                        <div class="form-group">
                                                            <input type="text" class="form-control" placeholder="Producto" required="">
                                                        </div>
                                                        <div class="form-group">
                                                            <input type="text" class="form-control" placeholder="ROL" required="">
                                                        </div>
                                                        
                                                        <div class="form-group">
                                                            <input type="text" class="form-control" placeholder="RUT
                                                            " required="">
                                                        </div>
                                                         <div class="text-right">
                            <a class="btn btn-primary" >Modificar</a>
                        </div>

                                                       
                                                    </form>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                        </div>

                        <div id="modal-eliminar" class="modal fade" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-body">
                                            <div class="row">
                                                <div><h3 class="m-t-none m-b">Eliminar Empresa</h3>
                                                    <form role="form">
                                                        
                                                        <div class="form-group">
                                                            <input type="email" class="form-control" placeholder="ID Empresa" required="">
                                                        </div>
                                     <div class="text-right">
                            <a class="btn btn-primary" href="">Eliminar</a>
                        </div>
                                                       
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
