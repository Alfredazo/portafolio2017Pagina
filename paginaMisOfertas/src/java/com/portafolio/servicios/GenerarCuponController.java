/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portafolio.servicios;

import com.portafolio.modelo.GenerarPDF;
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
    public ModelAndView generarCupon() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("consumidor/generarcupon");

        return mav;
    }
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView filtrarPorTexto(HttpServletRequest request, HttpSession sesion) {

        /*metodo post + redirección*/
        ModelAndView mav = new ModelAndView();
        mav.setViewName("consumidor/generarcupon");
        try {
            GenerarPDF g = new GenerarPDF();
            Calendar fecha = Calendar.getInstance();
            String hola = fecha.getTime().toString();
            hola = hola.replace(" ", "");
            hola = hola.replace(":", "");
            System.out.println(hola);
            g.generarPDF("***********************", "CUPON", "DESCUENTO", "Pagina Mis Ofertas", "Alimentos\nRopa\nLinea Blancan\nElectronica", "Valido hasta 11/11/11", "C:\\Users\\Alfredazo\\Desktop\\GeneradoPdf\\GeneradorPdf\\src\\generadorpdf\\img\\Logo Mis ofertas.png", "C:\\Users\\Alfredazo\\Desktop\\cosoPDF\\" + hola + ".pdf", "1234567");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return mav;
        /*cargar lista*/

    }

}
