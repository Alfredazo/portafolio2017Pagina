package com.portafolio.servicios;

import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("mantenedorUsuario.htm")
public class MantenedorUsuarioController {
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
                mav.setViewName("administrador/mantenedorUsuario");                
                ArrayList<PersonaUsuario> listado;
                PersonaUsuario dato = null;
                listado = (ArrayList<PersonaUsuario>) sesion.getAttribute("listadoPersonas");

                mav.addObject("nombreSesion", nombre);
                mav.addObject("listadoPersonas", listado);
                mav.addObject("dato", dato);
                return mav;
            }

        }
    }
    
    @RequestMapping(value="eliminarUsuario.htm", method = RequestMethod.POST)
    public ModelAndView eliminar(HttpRequest request,HttpSession sesion) {
        
        System.out.println("Eliminar");
        return new ModelAndView("redirect:/mantenedorEmpresa.htm");
    }
    
     @RequestMapping(value="modificarUsuario.htm",method = RequestMethod.POST)
    public ModelAndView modificar(HttpRequest request,HttpSession sesion) {
        
        System.out.println("modificar");
        return new ModelAndView("redirect:/mantenedorEmpresa.htm");
    }
}
