package com.portafolio.servicios;

import com.portafolio.empresaService.Empresa;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
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
            if (nivelUsuarioSesion == 0 || nivelUsuarioSesion == 2) {
                return new ModelAndView("redirect:/home.htm");
            } else {
                /*crear la vista aca recien*/
                ModelAndView mav = new ModelAndView();
                if (nivelUsuarioSesion == 1) {
                    mav.setViewName("encargado/mantenedorEmpresa");
                } else {
                    mav.setViewName("administrador/mantenedorEmpresa");
                }

                ArrayList<Empresa> listado;
                listado = (ArrayList<Empresa>) listarEmpresas();
                sesion.setAttribute("listadoEmpresas", listado);
                mav.addObject("nombreSesion", nombre);
                return mav;
            }

        }
    } 

    private static java.util.List<com.portafolio.empresaService.Empresa> listarEmpresas() {
        com.portafolio.empresaService.WSGestionarEmpresa_Service service = new com.portafolio.empresaService.WSGestionarEmpresa_Service();
        com.portafolio.empresaService.WSGestionarEmpresa port = service.getWSGestionarEmpresaPort();
        return port.listarEmpresas();
    }

}
