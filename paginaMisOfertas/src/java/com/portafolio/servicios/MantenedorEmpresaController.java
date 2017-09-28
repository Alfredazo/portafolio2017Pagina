package com.portafolio.servicios;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("mantenedorEmpresa.htm")
public class MantenedorEmpresaController {
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView mantendorEmpresa(HttpSession sesion) {
         String nombre = (String) sesion.getAttribute("nombre");
        if (nombre == null) {
            return new ModelAndView("redirect:/login.htm");
        } else {
            int nivelUsuarioSesion = (int) sesion.getAttribute("nivelUsuarioSesion");
            if (nivelUsuarioSesion == 0 || nivelUsuarioSesion == 1 || nivelUsuarioSesion == 2) {
                return new ModelAndView("redirect:/home.htm");
            } else {
                /*crear la vista aca recien*/
                ModelAndView mav = new ModelAndView();
                mav.setViewName("administrador/mantenedorEmpresa");                
//                ArrayList<PersonaUsuario> listado;
//                PersonaUsuario dato = null;
//                listado = (ArrayList<PersonaUsuario>) sesion.getAttribute("listadoPersonas");

                mav.addObject("nombreSesion", nombre);
//                mav.addObject("listadoPersonas", listado);
//                mav.addObject("dato", dato);
                return mav;
            }

        }       
    }
}
