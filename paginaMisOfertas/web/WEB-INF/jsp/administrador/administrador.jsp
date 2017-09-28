<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administración</title>
    </head>
    <body>
        <h1>Bienvenido al Panel de Administración</h1>
        <div class="">
            <h3> Nombre Adminsitrdor: </h3><c:out value="${nombre}"/>
            <a href="cerrarSesion.htm">Cerrar Sesión</a>
        </div>
        <div class="">
            <h3>Listado de Personas</h3>
            <table class=""> 
                <tr>
                    <th>RUT</th>
                    <th>1er Nombre</th> 
                    <th>2do Nombre</th> 
                    <th>A. Paterno</th> 
                    <th>A. Materno</th> 
                    <th>Usermame</th> 
                    <th>E-mail</th> 
                    <th>Total Puntos</th> 
                    <th>Nivel Usuario</th> 
                    <th>ID Usuario</th> 

                </tr>
                <c:forEach items="${listadoPersonas}" var="map" >
                    <tr>
                        <td>${map.rut}</td>
                        <td>${map.primerNombre}</td>
                        <td>${map.segundoNombre}</td>
                        <td>${map.primerApellido}</td>
                        <td>${map.segundoApellido}</td>                        
                        <td>${map.usuario}</td>                        
                        <td>${map.email}</td>                        
                        <td>${map.puntosAcumulados}</td>                        
                        <td>${map.nivelUsuario}</td>                        
                        <td>${map.usuarioID}</td>                        

                    </tr>
                </c:forEach>
            </table>
        </div>


    </body>
</html>
