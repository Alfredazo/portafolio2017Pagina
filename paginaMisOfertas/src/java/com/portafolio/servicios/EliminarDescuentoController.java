package com.portafolio.servicios;

import com.portafolio.servicios.descuento.Descuento;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("eliminarDescuento.htm")
public class EliminarDescuentoController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView eliminarDescuentoController(HttpServletRequest request, HttpSession sesion) {
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
    public ModelAndView eliminarDescuento(HttpServletRequest request, HttpSession sesion) {
        int idOferta = Integer.parseInt(request.getParameter("idOfertaEscondido"));
        int nivelUsuarioSesion = (int) sesion.getAttribute("nivelUsuarioSesion");
        if (nivelUsuarioSesion == 0 || nivelUsuarioSesion == 2) {
            return new ModelAndView("redirect:/home.htm");
        } else {
            /*crear la vista aca recien*/

            ModelAndView mav = new ModelAndView();
            if (nivelUsuarioSesion == 1) {
                mav.setViewName("encargado/mantenedorDescuento");
            } else {
                mav.setViewName("administrador/mantenedorDescuento");
            }
            
            if (borrarDescuentoPorID(idOferta)) {
                mav.addObject("errorGeneral", "Borrado correctamente");
            }

            ArrayList<Descuento> listado;
            listado = (ArrayList<Descuento>) listarDescuentoProductoEmpresa();
            sesion.setAttribute("listarOferta", listado);
            return mav;
        }

    }

    private static boolean borrarDescuentoPorID(int idOferta) {
        com.portafolio.servicios.descuento.WSGestionarDescuento_Service service = new com.portafolio.servicios.descuento.WSGestionarDescuento_Service();
        com.portafolio.servicios.descuento.WSGestionarDescuento port = service.getWSGestionarDescuentoPort();
        return port.borrarDescuentoPorID(idOferta);
    }

    private static java.util.List<com.portafolio.servicios.descuento.Descuento> listarDescuentoProductoEmpresa() {
        com.portafolio.servicios.descuento.WSGestionarDescuento_Service service = new com.portafolio.servicios.descuento.WSGestionarDescuento_Service();
        com.portafolio.servicios.descuento.WSGestionarDescuento port = service.getWSGestionarDescuentoPort();
        return port.listarDescuentoProductoEmpresa();
    }

    
}