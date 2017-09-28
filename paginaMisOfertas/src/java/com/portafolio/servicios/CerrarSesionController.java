/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portafolio.servicios;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("cerrarSesion.htm")
public class CerrarSesionController {
     @RequestMapping(method = RequestMethod.GET)
     public ModelAndView cerrarSesion(HttpSession sesion) {
        String nombre = (String) sesion.getAttribute("nombre");
        if (nombre == null) {
            return new ModelAndView("redirect:/login.htm");
        }else{
            sesion.invalidate();
            return new ModelAndView("redirect:/home.htm");
        }
     
     }
    
    
}
