package com.portafolio.servicios;

import com.portafolio.servicios.descuento.Descuento;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("modificarDescuento.htm")
public class ModificarDescuentoController {
    
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
public ModelAndView modificarDescuento(HttpServletRequest request,HttpSession sesion) {
    boolean errorGeneral = false;
     int idOferta = Integer.parseInt(request.getParameter("idOfertaModificar"));
           String nombre = request.getParameter("nombre");
        String nombreError = "";
        String nombreDev ="";
        if (nombre.isEmpty()) {
            nombreError = "El Nombre no debe venir vacio";
            errorGeneral = true;
        }else{
            nombreDev = nombre;
        }
        
        String descripcion = request.getParameter("descripcion");
        String descripcionError = "";
        String descripcionDev ="";
        if (descripcion.isEmpty()) {
            descripcionError = "La descripcion no debe venir vacio";
            errorGeneral = true;
        }else{
            descripcionDev = descripcion;
        }
        
        int descuento = Integer.parseInt(request.getParameter("descuento"));
        String descuentoError = "";  
        int descuentoDev = 0;
        if (descuento == 0) {
            descuentoError = "El descuento debe ser mayor a 0";
            errorGeneral = true;
        }else{
            descuentoDev = descuento;
        }
        
        String imagen = "imagen";
        
        String condiciones = request.getParameter("condiciones");
        String condicionesError = "";
        String condicionesDev ="";
        if (condiciones.isEmpty()) {
            condicionesError = "Las condiciones no debe venir vacio";
            errorGeneral = true;
        }else{
            condicionesDev = condiciones;
        }
        
        String fechaInicio = request.getParameter("fechainicio");
        String mensajefechaInicio = "";
        String fechaInicioDevuelta = "";
        if (fechaInicio == null) {
            mensajefechaInicio = "La fecha no debe venir en blanco";
        } else {
            /*Parsear la fecha*/
            fechaInicio = formatoFecha(fechaInicio);
            fechaInicioDevuelta = fechaInicio;
        }
        
        
        String fechaTermino = request.getParameter("fechatermino");
        String mensajefechaTermino = "";
        String fechaTerminoDevuelta = "";
        if (fechaTermino == null) {
            mensajefechaTermino = "La fecha no debe venir en blanco";
        } else {
            /*Parsear la fecha*/
            fechaTermino = formatoFecha(fechaTermino);
            fechaTerminoDevuelta = fechaTermino;
        }
       
        String activo = request.getParameter("activo");
        String activoError = "";
        if (activo.equals(("2"))) {
            activoError = "Debe seleccionar Activo";
            errorGeneral = true;
        }
        
        int idProducto = Integer.parseInt(request.getParameter("idProducto"));
        String productoError = "";
        if (idProducto == -1) {
            productoError = "Debe seleccionar un producto";
            errorGeneral = true;
        }


    if (errorGeneral == false) {
        /*Agregar A la BD*/                       
        ModelAndView mav = new ModelAndView();
        int nivelUsuario = (int) sesion.getAttribute("nivelUsuarioSesion");
        if (nivelUsuario == 1) {
            mav.setViewName("encargado/mantenedorDescuento");
        }else{
            mav.setViewName("administrador/mantenedorDescuento");
        }
                
        actualizarDescuento(idOferta, nombre, descripcion, descuento, imagen, condiciones,fechaInicioDevuelta , fechaTerminoDevuelta,activo,idProducto);
        
        mav.addObject("errorGeneral", "Se ha modificado Correctamente");
        
        ArrayList<Descuento> listado =(ArrayList<Descuento>) listarDescuentoProductoEmpresa();
        sesion.setAttribute("listarOferta", listado);
       
        return mav;
        
    }else{
        /*Mandar a La pagina con la lista de errores*/
        /*Este trozo de codigo esta malo hay que arreglar para que cumpla la condicion*/            
        ModelAndView mav = new ModelAndView();
        int nivelUsuario = (int) sesion.getAttribute("nivelUsuarioSesion");
        if (nivelUsuario == 1) {
            mav.setViewName("encargado/mantenedorDescuento");
        }else{
            mav.setViewName("administrador/mantenedorDescuento");
        }
        
            mav.addObject("nombreError", nombreError);
            mav.addObject("descripcionError", descripcionError);
            mav.addObject("descuentoError", descuentoError);
            mav.addObject("condicionesError", condicionesError);
            mav.addObject("mensajefechaInicio", mensajefechaInicio);
            mav.addObject("mensajefechaTermino", mensajefechaTermino);
            mav.addObject("productoError", productoError);
            /*Devolver Valores correctos en caso de error*/
            mav.addObject("nombreDev", nombreDev);
            mav.addObject("descripcionDev", descripcionDev);
            mav.addObject("descuentoDev", descuentoDev);
            mav.addObject("condicionesDev", condicionesDev);
            mav.addObject("fechainicioDev", fechaInicioDevuelta);
            mav.addObject("fechaterminoDev", fechaTerminoDevuelta);
            mav.addObject("idProductoDev", idProducto);
            mav.addObject("errorGeneral", "Error al modificar descuento. Revise los Campos Porfavor");
            
            ArrayList<Descuento> listado =(ArrayList<Descuento>) listarDescuentoProductoEmpresa();
        sesion.setAttribute("listarOferta", listado);
            
            return mav;
          
        
    }
            
}

    private static java.util.List<com.portafolio.servicios.descuento.Descuento> listarDescuentoProductoEmpresa() {
        com.portafolio.servicios.descuento.WSGestionarDescuento_Service service = new com.portafolio.servicios.descuento.WSGestionarDescuento_Service();
        com.portafolio.servicios.descuento.WSGestionarDescuento port = service.getWSGestionarDescuentoPort();
        return port.listarDescuentoProductoEmpresa();
    }

    private static boolean actualizarDescuento(int id, java.lang.String nombre, java.lang.String descripcion, int descuento, java.lang.String imagen, java.lang.String condiciones, java.lang.String fechaInicio, java.lang.String fechaTermino, java.lang.String activo, int idProducto) {
        com.portafolio.servicios.descuento.WSGestionarDescuento_Service service = new com.portafolio.servicios.descuento.WSGestionarDescuento_Service();
        com.portafolio.servicios.descuento.WSGestionarDescuento port = service.getWSGestionarDescuentoPort();
        return port.actualizarDescuento(id, nombre, descripcion, descuento, imagen, condiciones, fechaInicio, fechaTermino, activo, idProducto);
    }

  public String formatoFecha(String fecha){
        String fechaFormateada = "";
        /*La fecha viene asi 2017-10-24  y yo la quiero dejar asi 24/10/2017  */
        String[]cadena = fecha.split("-");
        fechaFormateada = cadena[2]+"/"+cadena[1]+"/"+cadena[0];       
        return fechaFormateada;
    }



}


