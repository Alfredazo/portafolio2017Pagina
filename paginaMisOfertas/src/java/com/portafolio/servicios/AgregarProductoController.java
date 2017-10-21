package com.portafolio.servicios;

import com.portafolio.empresaService.Empresa;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("agregarProducto.htm")
public class AgregarProductoController {
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView agregarControlador(HttpServletRequest request, HttpSession sesion) {
        String nombre = (String) sesion.getAttribute("nombre");
        if (nombre == null) {
            return new ModelAndView("redirect:/login.htm");
        } else {
            int nivelUsuarioSesion = (int) sesion.getAttribute("nivelUsuarioSesion");
            if (nivelUsuarioSesion == 0 || nivelUsuarioSesion == 2) {
                return new ModelAndView("redirect:/home.htm");
            } else {
                return new ModelAndView("redirect:/encargado.htm");
            }
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView registrarProducto(HttpServletRequest request,HttpSession sesion) {
        boolean errorGeneral = false;
        String nombre = request.getParameter("nombre");
        String nombreError = "";
        String nombreDev ="";
        if (nombre.isEmpty()) {
            nombreError = "El Nombre no debe venir vacio";
            errorGeneral = true;
        }else{
            nombreDev = nombre;
        }
        
        int precio = Integer.parseInt(request.getParameter("precio"));
        String precioError = "";       
        if (precio == 0) {
            precioError = "El precio debe ser mayor a 0";
            errorGeneral = true;
        }else{
            
        }

        String descripcion = request.getParameter("descripcion");
        String descripcionError = "";
        String descripcionDev="";
        if (descripcion.isEmpty()) {
            descripcionError = "La descripcion no debe venir vacia";
            errorGeneral = true;
        }else{
            descripcionDev=descripcion;
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
        
        Date fechaIngresoPaso = new Date(); 
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaIngreso = dateFormat.format(fechaIngresoPaso);

        String fechaCaducidad = request.getParameter("fechaCaducidad");
        String mensajeFecha = "";
        String fechaDevuelta = "";
        if (fechaCaducidad == null) {
            mensajeFecha = "La fecha no debe venir en blanco";
        } else {
            /*Parsear la fecha*/
            fechaDevuelta = fechaCaducidad;
        }

        if (errorGeneral == false) {
            /*Agregar A la BD*/                       
            ModelAndView mav = new ModelAndView();
            int nivelUsuario = (int) sesion.getAttribute("nivelUsuarioSesion");
            if (nivelUsuario == 1) {
                mav.setViewName("encargado/mantenedorProducto");
            }else{
                mav.setViewName("administrador/mantenedorProducto");
            }
            String activoPaso="";
            if (activo==1) {
                activoPaso ="1";
            }else{
                activoPaso ="0";
            }         
            registrarProducto_1(nombre, precio, descripcion, fotografia, activoPaso, idEmpresa, idTipoProducto, fechaIngreso, fechaCaducidad);
            
            mav.addObject("errorGeneral", "Se ha agregado Correctamente");
           
            return mav;
            
        }else{
            /*Mandar a La pagina con la lista de errores*/
            /*Este trozo de codigo esta malo hay que arreglar para que cumpla la condicion*/            
            ModelAndView mav = new ModelAndView();
            int nivelUsuario = (int) sesion.getAttribute("nivelUsuarioSesion");
            if (nivelUsuario == 1) {
                mav.setViewName("encargado/mantenedorProducto");
            }else{
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
//            return new ModelAndView("redirect:/home.htm");
            
        }
                
    }

    private static boolean registrarProducto_1(java.lang.String nombre, int precio, java.lang.String descripcion, java.lang.String urlFoto, java.lang.String activo, int idEmpresa, int tipoProductoID, java.lang.String fechaIngreso, java.lang.String fechaCaducidad) {
        com.portafolio.service.WSGestionarProducto_Service service = new com.portafolio.service.WSGestionarProducto_Service();
        com.portafolio.service.WSGestionarProducto port = service.getWSGestionarProductoPort();
        return port.registrarProducto(nombre, precio, descripcion, urlFoto, activo, idEmpresa, tipoProductoID, fechaIngreso, fechaCaducidad);
    }




    
}
