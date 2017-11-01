/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portafolio.servicios;

import com.portafolio.modelo.GenerarPDF;
import java.awt.Desktop;
import java.io.File;
import java.util.Calendar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("generarcupon.htm")
public class GenerarCuponController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView generarCupon(HttpSession sesion) {
        String nombre = (String) sesion.getAttribute("nombre");
        if (nombre == null) {
            return new ModelAndView("redirect:/login.htm");
        } else {
            int nivelUsuarioSesion = (int) sesion.getAttribute("nivelUsuarioSesion");
            if (nivelUsuarioSesion == 1 || nivelUsuarioSesion == 2) {
                return new ModelAndView("redirect:/home.htm");
            } else {
                /*crear la vista aca recien*/
                ModelAndView mav = new ModelAndView();
                mav.setViewName("consumidor/generarcupon");
                return mav;
            }

        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView filtrarPorTexto(HttpServletRequest request, HttpSession sesion) {
        /*metodo post + redirección*/
        String listadoDescuento = "";
        String cantidadDescuento = "";
        String primerNombre = request.getParameter("primerNombre");
        String primerApellido = request.getParameter("apellidoP");
        String segundoApellido = request.getParameter("apellidoM");   

        String nombreUsuario = primerNombre+" "+primerApellido+" "+segundoApellido.charAt(0);
        
        /*Validar Cuantos puntos tiene  y realizar % Descuento*/
        int cantidadPuntos = Integer.parseInt(request.getParameter("cantidadPuntos"));
        if (cantidadPuntos >= 0 && cantidadPuntos <= 100) {
            listadoDescuento = "Alimentos\n";
            cantidadDescuento = "5%";
            /*Ingresar metodo que reste lo que tiene*/
        } else if (cantidadPuntos > 100 && cantidadPuntos <= 500) {
            listadoDescuento = "Alimentos\nElectronica\nLinea Blanca";
            cantidadDescuento = "10%";
            /*Ingresar metodo que reste lo que tiene*/
        } else if (cantidadPuntos > 500) {
            listadoDescuento = "Alimentos\nElectronica\nLinea Blanca\nRopa";
            cantidadDescuento = "15%";
            /*Ingresar metodo que reste lo que tiene*/
        }

        ModelAndView mav = new ModelAndView();
        mav.setViewName("consumidor/generarcupon");
        try {
            GenerarPDF g = new GenerarPDF();
            Calendar fecha = Calendar.getInstance();
            String hola = fecha.getTime().toString();
            hola = hola.replace(" ", "");
            hola = hola.replace(":", "");
            String nombreSistema = System.getProperty("user.name");
            String urlImagen = "C:\\Users\\" + nombreSistema + "\\Desktop\\portafolio2017Pagina\\paginaMisOfertas\\web\\Resources\\img\\Logo Mis ofertas.png";
            String urlGuardar = "C:\\Users\\" + nombreSistema + "\\Downloads\\" + hola;
            String formato = ".pdf";
            System.out.println(hola);
            g.generarPDF("***********************", "CUPON", "DESCUENTO", "Pagina Mis Ofertas", listadoDescuento, "Usuario:"+nombreUsuario+"."+" Porcentaje Descuento:" + cantidadDescuento, urlImagen, urlGuardar + formato, "1234327");
            File path = new File(urlGuardar + formato);
            System.out.println(urlGuardar);
            
            mav.addObject("erroresGeneral","Se ha guardado su cupon en "+urlGuardar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return mav;
        /*cargar lista*/

    }

}
