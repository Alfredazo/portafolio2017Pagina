/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@RequestMapping("destacados.htm")
public class DestacadoController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView mantenedorDescuento() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home/destacados");

        ArrayList<Descuento> listaOfertas = (ArrayList<Descuento>) listarDescuentoProductoEmpresa();
        mav.addObject("listaOfertas", listaOfertas);
        return mav;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView filtrarPorTexto(HttpServletRequest request, HttpSession sesion) {

        String erroresGeneral = "";
        boolean errorG = false;

        String texto = request.getParameter("ofertaBuscar");
        if (texto.isEmpty()) {
            erroresGeneral = "Ingrese Algo Para buscar";
            errorG = true;
        }else{
            texto = texto.toUpperCase();
        }

        if (errorG == false) {
            /*metodo post + redirección*/
            ModelAndView mav = new ModelAndView();
            mav.setViewName("home/destacados");
            ArrayList<Descuento> listaOfertas = (ArrayList<Descuento>) listarPorFiltroNombreOfertaUProducto(texto);
            if (listaOfertas.isEmpty()) {
                mav.addObject("erroresGeneral", "No se encontro nada Relacionado");
            } else {
                mav.addObject("listaOfertas", listaOfertas);
            }
            return mav;
            /*cargar lista*/
        } else {
            ModelAndView mav = new ModelAndView();
            mav.setViewName("home/destacados");
            mav.addObject("erroresGeneral", erroresGeneral);
            return mav;
        }
    }

    private static java.util.List<com.portafolio.servicios.descuento.Descuento> listarDescuentoProductoEmpresa() {
        com.portafolio.servicios.descuento.WSGestionarDescuento_Service service = new com.portafolio.servicios.descuento.WSGestionarDescuento_Service();
        com.portafolio.servicios.descuento.WSGestionarDescuento port = service.getWSGestionarDescuentoPort();
        return port.listarDescuentoProductoEmpresa();
    }

    private static java.util.List<com.portafolio.servicios.descuento.Descuento> listarPorFiltroNombreOfertaUProducto(java.lang.String textoFiltrado) {
        com.portafolio.servicios.descuento.WSGestionarDescuento_Service service = new com.portafolio.servicios.descuento.WSGestionarDescuento_Service();
        com.portafolio.servicios.descuento.WSGestionarDescuento port = service.getWSGestionarDescuentoPort();
        return port.listarPorFiltroNombreOfertaUProducto(textoFiltrado);
    }

}
