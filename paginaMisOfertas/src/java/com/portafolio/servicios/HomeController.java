package com.portafolio.servicios;

import com.portafolio.servicios.descuento.Descuento;
import com.portafolio.servicios.ofertas.Anuncio;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("home.htm")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView mantenedorDescuento(HttpSession sesion) {
        ModelAndView mav = new ModelAndView();
         String nombre = (String) sesion.getAttribute("nombre");
        if (nombre == null) {
            mav.setViewName("home/home");
        }else{
            mav.setViewName("consumidor/home");
        }
               

        ArrayList<Anuncio> listaAlimentos= (ArrayList<Anuncio>) mostrarAnuncioAlimentosHOME();
        ArrayList<Anuncio> listaElectronica= (ArrayList<Anuncio>) mostrarAnuncioElectronicaHOME();
        ArrayList<Anuncio> listaLineaBlanca= (ArrayList<Anuncio>) mostrarAnuncioLineaBlancaHOME();
        ArrayList<Anuncio> listaRopa= (ArrayList<Anuncio>) mostrarAnuncioROPAHOME();
        ArrayList<Descuento> listaOfertas= (ArrayList<Descuento>) listarDescuentoProductoEmpresa();
        
        mav.addObject("listaAlimentos",listaAlimentos);
        mav.addObject("listaElectronica",listaElectronica);
        mav.addObject("listaLineaBlanca",listaLineaBlanca);
        mav.addObject("listaRopa",listaRopa);
        mav.addObject("listaOfertas",listaOfertas);

        return mav;
    }

    private static java.util.List<com.portafolio.servicios.ofertas.Anuncio> mostrarAnuncioAlimentosHOME() {
        com.portafolio.servicios.ofertas.WSGestionarAnuncio_Service service = new com.portafolio.servicios.ofertas.WSGestionarAnuncio_Service();
        com.portafolio.servicios.ofertas.WSGestionarAnuncio port = service.getWSGestionarAnuncioPort();
        return port.mostrarAnuncioAlimentosHOME();
    }

    private static java.util.List<com.portafolio.servicios.ofertas.Anuncio> mostrarAnuncioElectronicaHOME() {
        com.portafolio.servicios.ofertas.WSGestionarAnuncio_Service service = new com.portafolio.servicios.ofertas.WSGestionarAnuncio_Service();
        com.portafolio.servicios.ofertas.WSGestionarAnuncio port = service.getWSGestionarAnuncioPort();
        return port.mostrarAnuncioElectronicaHOME();
    }

    private static java.util.List<com.portafolio.servicios.ofertas.Anuncio> mostrarAnuncioLineaBlancaHOME() {
        com.portafolio.servicios.ofertas.WSGestionarAnuncio_Service service = new com.portafolio.servicios.ofertas.WSGestionarAnuncio_Service();
        com.portafolio.servicios.ofertas.WSGestionarAnuncio port = service.getWSGestionarAnuncioPort();
        return port.mostrarAnuncioLineaBlancaHOME();
    }

    private static java.util.List<com.portafolio.servicios.ofertas.Anuncio> mostrarAnuncioROPAHOME() {
        com.portafolio.servicios.ofertas.WSGestionarAnuncio_Service service = new com.portafolio.servicios.ofertas.WSGestionarAnuncio_Service();
        com.portafolio.servicios.ofertas.WSGestionarAnuncio port = service.getWSGestionarAnuncioPort();
        return port.mostrarAnuncioROPAHOME();
    }

    private static java.util.List<com.portafolio.servicios.descuento.Descuento> listarDescuentoProductoEmpresa() {
        com.portafolio.servicios.descuento.WSGestionarDescuento_Service service = new com.portafolio.servicios.descuento.WSGestionarDescuento_Service();
        com.portafolio.servicios.descuento.WSGestionarDescuento port = service.getWSGestionarDescuentoPort();
        return port.listarDescuentoProductoEmpresa();
    }

}
