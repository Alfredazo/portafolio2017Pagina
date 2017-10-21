/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portafolio.servicios;

import com.portafolio.service.Producto;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Alfredazo
 */
@Controller
@RequestMapping("eliminarProducto.htm")
public class EliminarProductoController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView eliminarProductoController(HttpServletRequest request, HttpSession sesion) {
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
    public ModelAndView eliminarUsuarioController(HttpServletRequest request, HttpSession sesion) {
        int idProducto = Integer.parseInt(request.getParameter("idProductoEscondido"));
        int nivelUsuarioSesion = (int) sesion.getAttribute("nivelUsuarioSesion");
        if (nivelUsuarioSesion == 0 || nivelUsuarioSesion == 2) {
            return new ModelAndView("redirect:/home.htm");
        } else {
            /*crear la vista aca recien*/

            ModelAndView mav = new ModelAndView();
            if (nivelUsuarioSesion == 1) {
                mav.setViewName("encargado/mantenedorProducto");
            } else {
                mav.setViewName("administrador/mantenedorProducto");
            }
            
            if (borrarProductoPorID(idProducto)) {
                mav.addObject("errorGeneral", "Borrado correctamente");
            }

            ArrayList<Producto> listado;
            listado = (ArrayList<Producto>) listarProducto();
            sesion.setAttribute("listarProducto", listado);
            return mav;
        }

    }

    private static java.util.List<com.portafolio.service.Producto> listarProducto() {
        com.portafolio.service.WSGestionarProducto_Service service = new com.portafolio.service.WSGestionarProducto_Service();
        com.portafolio.service.WSGestionarProducto port = service.getWSGestionarProductoPort();
        return port.listarProducto();
    }

    private static boolean borrarProductoPorID(int idProducto) {
        com.portafolio.service.WSGestionarProducto_Service service = new com.portafolio.service.WSGestionarProducto_Service();
        com.portafolio.service.WSGestionarProducto port = service.getWSGestionarProductoPort();
        return port.borrarProductoPorID(idProducto);
    }
}