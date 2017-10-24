/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portafolio.servicios;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jared
 */
public class ModificarProductoController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView modificarControlador(HttpServletRequest request, HttpSession sesion) {
        String nombre = (String) sesion.getAttribute("nombre");
        if (nombre == null) {
            return new ModelAndView("redirect:/login.htm");
        } else {
            int nivelUsuarioSesion = (int) sesion.getAttribute("nivelUsuarioSesion");
            if (nivelUsuarioSesion == 0 || nivelUsuarioSesion == 2) {
                return new ModelAndView("redirect:/home.htm");
            } else {
                return new ModelAndView("redirect:/gerente.htm");
            }

        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView modificarProducto(HttpServletRequest request, HttpSession sesion) {
        boolean errorGeneral = false;
        int idProducto = Integer.parseInt(request.getParameter("idProductoModificar"));
        String nombre = request.getParameter("nombre");
        String nombreError = "";
        String nombreDev = "";
        if (nombre.isEmpty()) {
            nombreError = "El Nombre no debe venir vacio";
            errorGeneral = true;
        } else {
            nombreDev = nombre;
        }

        int precio = Integer.parseInt(request.getParameter("precio"));
        String precioError = "";
        if (precio == 0) {
            precioError = "El precio debe ser mayor a 0";
            errorGeneral = true;
        } else {

        }

        String descripcion = request.getParameter("descripcion");
        String descripcionError = "";
        String descripcionDev = "";
        if (descripcion.isEmpty()) {
            descripcionError = "La descripcion no debe venir vacia";
            errorGeneral = true;
        } else {
            descripcionDev = descripcion;
        }

        String fotografia = "";

        int activo = Integer.parseInt(request.getParameter("activo"));
        String activoError = "";
        if (activo == 2) {
            activoError = "Seleccione SI o NO";
            errorGeneral = true;
        }

        int idEmpresa = Integer.parseInt(request.getParameter("idEmpresa"));
        String idEmpresaError = "";
        if (idEmpresa == -1) {
            idEmpresaError = "Seleccione empresa";
            errorGeneral = true;
        }

        int idTipoProducto = Integer.parseInt(request.getParameter("idTipoProducto"));
        String idTipoProductoError = "";
        if (idTipoProducto == -1) {
            idTipoProductoError = "Seleccione tipo de producto";
            errorGeneral = true;
        }

        String fechaIngreso = request.getParameter("fechaIngreso");
        String mensajeFecha1 = "";
        String fechaDevuelta1 = "";
        if (fechaIngreso == null) {
            mensajeFecha1 = "La fecha no debe venir en blanco";
        } else {
            /*Parsear la fecha*/
            fechaIngreso = formatoFecha(fechaIngreso);
            fechaDevuelta1 = fechaIngreso;
        }
        String fechaCaducidad = request.getParameter("fechaCaducidad");
        String mensajeFecha = "";
        String fechaDevuelta = "";
        if (fechaCaducidad == null) {
            mensajeFecha = "La fecha no debe venir en blanco";
        } else {
            /*Parsear la fecha*/
            fechaCaducidad = formatoFecha(fechaCaducidad);
            fechaDevuelta = fechaCaducidad;
        }

        if (errorGeneral == false) {
            /*Agregar A la BD*/
            ModelAndView mav = new ModelAndView();
            int nivelUsuario = (int) sesion.getAttribute("nivelUsuarioSesion");
            if (nivelUsuario == 1) {
                mav.setViewName("encargado/mantenedorProducto");
            } else {
                mav.setViewName("administrador/mantenedorProducto");
            }
            String activoPaso = "";
            if (activo == 1) {
                activoPaso = "1";
            } else {
                activoPaso = "0";
            }
            actualizarProducto(idProducto, nombre, precio, descripcion, fotografia, activoPaso, idEmpresa, idTipoProducto, fechaIngreso, fechaCaducidad);

            mav.addObject("errorGeneral", "Se ha modificado Correctamente");

            return mav;

        } else {
            /*Mandar a La pagina con la lista de errores*/
 /*Este trozo de codigo esta malo hay que arreglar para que cumpla la condicion*/
            ModelAndView mav = new ModelAndView();
            int nivelUsuario = (int) sesion.getAttribute("nivelUsuarioSesion");
            if (nivelUsuario == 1) {
                mav.setViewName("encargado/mantenedorProducto");
            } else {
                mav.setViewName("administrador/mantenedorProducto");
            }

            mav.addObject("nombreError", nombreError);
            mav.addObject("precioError", precioError);
            mav.addObject("descripcionError", descripcionError);
            mav.addObject("activoError", activoError);
            mav.addObject("idEmpresaError", idEmpresaError);
            mav.addObject("idTipoProductoError", idTipoProductoError);
            /*Devolver Valores correctos en caso de error*/
            mav.addObject("nombreDev", nombreDev);
            mav.addObject("descripcionDev", descripcionDev);
            mav.addObject("errorGeneral", "Error al agregar Empresa. Revise los Campos Porfavor");

            return mav;

        }

    }

    private static boolean actualizarProducto(int idProducto, java.lang.String nombre, int precio, java.lang.String descripcionProducto, java.lang.String urlFoto, java.lang.String activo, int idEmpresa, int tipoProductoID, java.lang.String fechaIngreso, java.lang.String fechaCaducidad) {
        com.portafolio.service.WSGestionarProducto_Service service = new com.portafolio.service.WSGestionarProducto_Service();
        com.portafolio.service.WSGestionarProducto port = service.getWSGestionarProductoPort();
        return port.actualizarProducto(idProducto, nombre, precio, descripcionProducto, urlFoto, activo, idEmpresa, tipoProductoID, fechaIngreso, fechaCaducidad);
    }

    public String formatoFecha(String fecha) {
        String fechaFormateada = "";
        /*La fecha viene asi 2017-10-24  y yo la quiero dejar asi 24/10/2017  */
        String[] cadena = fecha.split("-");
        fechaFormateada = cadena[2] + "/" + cadena[1] + "/" + cadena[0];
        return fechaFormateada;
    }
}
