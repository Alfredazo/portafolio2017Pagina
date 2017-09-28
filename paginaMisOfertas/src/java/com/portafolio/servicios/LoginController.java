/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portafolio.servicios;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("login.htm")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home/login");
        return mav;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView createCustomer(HttpServletRequest request, HttpSession sesion) {

        String email = request.getParameter("txtNombreUsuario");
        String clave = request.getParameter("txtClave");
        boolean validado = validarUsuarioPorNombreUsuarioUCorreo(email, clave);
        if (validado) {
            /*Redireccionar a la ventana segun su nivel de usuario*/
            int nivelUsuario = devolverNivelUsuario(email);

            switch (nivelUsuario) {
                case 0:
                    /*Consumidor*/
                    sesion.setAttribute("nombre", email);
                    sesion.setAttribute("nivelUsuarioSesion", nivelUsuario);

                    return new ModelAndView("redirect:/consumidor.htm");
                case 1:
                    /*Encargado de Tienda*/
                    sesion.setAttribute("nombre", email);
                    sesion.setAttribute("nivelUsuarioSesion", nivelUsuario);

                    return new ModelAndView("redirect:/encargado.htm");
                case 2:
                    /*Gerente*/
                    sesion.setAttribute("nombre", email);
                    sesion.setAttribute("nivelUsuarioSesion", nivelUsuario);

                    return new ModelAndView("redirect:/gerente.htm");

                case 3:
                    /*Administrador*/
                    ArrayList<PersonaUsuario> listado = new ArrayList<PersonaUsuario>();
                    listado = (ArrayList<PersonaUsuario>) listarInformacionCompletaTodosLosUsuarios();
                    sesion.setAttribute("listadoPersonas", listado);
                    sesion.setAttribute("nombre", email);
                    sesion.setAttribute("nivelUsuarioSesion", nivelUsuario);

                    return new ModelAndView("redirect:/mantenedorUsuario.htm");

                default:
                    ModelAndView mavHome = new ModelAndView("");
                    mavHome.setViewName("home/home");
                    return mavHome;
            }
        } else {
            ModelAndView mav = new ModelAndView("");
            mav.setViewName("home/login");
            mav.addObject("errores", "Porfavor Revise sus credenciales");
            mav.addObject("nombre", email);
            return mav;
        }
    }

   

    private static boolean validarUsuarioPorNombreUsuarioUCorreo(java.lang.String usuarioUCorreo, java.lang.String claveUsuario) {
        com.portafolio.servicios.WSGestionarUsuario_Service service = new com.portafolio.servicios.WSGestionarUsuario_Service();
        com.portafolio.servicios.WSGestionarUsuario port = service.getWSGestionarUsuarioPort();
        return port.validarUsuarioPorNombreUsuarioUCorreo(usuarioUCorreo, claveUsuario);
    }

    private static int devolverNivelUsuario(java.lang.String correoUNombre) {
        com.portafolio.servicios.WSGestionarUsuario_Service service = new com.portafolio.servicios.WSGestionarUsuario_Service();
        com.portafolio.servicios.WSGestionarUsuario port = service.getWSGestionarUsuarioPort();
        return port.devolverNivelUsuario(correoUNombre);
    }

    private static java.util.List<com.portafolio.servicios.PersonaUsuario> listarInformacionCompletaTodosLosUsuarios() {
        com.portafolio.servicios.WSGestionarUsuario_Service service = new com.portafolio.servicios.WSGestionarUsuario_Service();
        com.portafolio.servicios.WSGestionarUsuario port = service.getWSGestionarUsuarioPort();
        return port.listarInformacionCompletaTodosLosUsuarios();
    }

}
