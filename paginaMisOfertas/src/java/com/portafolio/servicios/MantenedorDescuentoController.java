package com.portafolio.servicios;

import com.portafolio.empresaService.Empresa;
import com.portafolio.servicios.descuento.Descuento;
import com.portafolio.service.Producto;
import com.portafolio.service.ProductoEmpresa;
import com.portafolio.service.TipoProducto;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("mantenedorDescuento.htm")
public class MantenedorDescuentoController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView mantenedorDescuento(HttpSession sesion) {
        String nombre = (String) sesion.getAttribute("nombre");
        if (nombre == null) {
            return new ModelAndView("redirect:/login.htm");
        } else {
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
                
                ArrayList<Descuento> listado =(ArrayList<Descuento>) listarDescuentoProductoEmpresa();
                sesion.setAttribute("listarOferta", listado);
                ArrayList<Producto> listado2 =(ArrayList<Producto>) listarProducto();
                sesion.setAttribute("listarProducto", listado2);
           
                mav.addObject("nombreSesion", nombre);
                return mav;
            }

        }
    } 

    private static java.util.List<com.portafolio.service.Producto> listarProducto() {
        com.portafolio.service.WSGestionarProducto_Service service = new com.portafolio.service.WSGestionarProducto_Service();
        com.portafolio.service.WSGestionarProducto port = service.getWSGestionarProductoPort();
        return port.listarProducto();
    }

    private static java.util.List<com.portafolio.servicios.descuento.Descuento> listarDescuentoProductoEmpresa() {
        com.portafolio.servicios.descuento.WSGestionarDescuento_Service service = new com.portafolio.servicios.descuento.WSGestionarDescuento_Service();
        com.portafolio.servicios.descuento.WSGestionarDescuento port = service.getWSGestionarDescuentoPort();
        return port.listarDescuentoProductoEmpresa();
    }

   
}
