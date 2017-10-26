/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portafolio.servicios;

import com.portafolio.servicios.ofertas.AnuncioSistema;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("listaRecomendacion.htm")
public class ListaRecomendacionController {

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
                if (nivelUsuarioSesion == 1 || nivelUsuarioSesion == 3) {
                    mav.setViewName("encargado/listaRecomendacion");
                }
                ArrayList<AnuncioSistema> listado = (ArrayList<AnuncioSistema>) listaRecomendacionSistema();
                sesion.setAttribute("listadoSistema", listado);
                mav.addObject("nombreSesion", nombre);
                return mav;
            }

        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView registrarOferta(HttpServletRequest request, HttpSession sesion) {
        int idProducto = Integer.parseInt(request.getParameter("idProductoPublicar"));

        actualizarActivoProducto(idProducto);

        ArrayList<AnuncioSistema> listado = (ArrayList<AnuncioSistema>) listaRecomendacionSistema();
        sesion.setAttribute("listadoSistema", listado);

        return new ModelAndView("redirect:/listaRecomendacion.htm");
    }

    private static java.util.List<com.portafolio.servicios.ofertas.AnuncioSistema> listaRecomendacionSistema() {
        com.portafolio.servicios.ofertas.WSGestionarAnuncio_Service service = new com.portafolio.servicios.ofertas.WSGestionarAnuncio_Service();
        com.portafolio.servicios.ofertas.WSGestionarAnuncio port = service.getWSGestionarAnuncioPort();
        return port.listaRecomendacionSistema();
    }

    private static boolean actualizarActivoProducto(int idProducto) {
        com.portafolio.service.WSGestionarProducto_Service service = new com.portafolio.service.WSGestionarProducto_Service();
        com.portafolio.service.WSGestionarProducto port = service.getWSGestionarProductoPort();
        return port.actualizarActivoProducto(idProducto);
    }

}
