/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portafolio.servicios;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("eliminarUsuario.htm")
public class EliminarUsuarioController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView eliminarControlador(HttpServletRequest request, HttpSession sesion) {
        String nombre = (String) sesion.getAttribute("nombre");
        if (nombre == null) {
            return new ModelAndView("redirect:/login.htm");
        } else {
            int nivelUsuarioSesion = (int) sesion.getAttribute("nivelUsuarioSesion");
            if (nivelUsuarioSesion == 0 || nivelUsuarioSesion == 1 || nivelUsuarioSesion == 2) {
                return new ModelAndView("redirect:/home.htm");
            } else {
                return new ModelAndView("redirect:/gerente.htm");
            }

        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView eliminarUsuarioController(HttpServletRequest request, HttpSession sesion) {
        /*hacer metodo para borrar*/
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/administrador/mantenedorUsuario");
        String mensaje = "";
        String nombreEliminado = request.getParameter("nombreEliminado");

        int resultado = nombreEliminado.indexOf("@");
        if (resultado != -1) {
            /*Valido Metodo de Correo*/
            if (comprobarsiExisteEmail(nombreEliminado)) {
                int idUsuario = devolverIdUsuario(nombreEliminado);
                eliminarPersona(idUsuario);
                eliminarUsuario(nombreEliminado);
                mensaje = "Se elimino correctamente";
            } else {
                mensaje = "El usuario con ese correo no existe";
            }

        } else {
            /*Valido Metodo Usuario*/
            if (comprobarNombreUsuario(nombreEliminado)) {
                int idUsuario = devolverIdUsuario(nombreEliminado);
                eliminarPersona(idUsuario);
                eliminarUsuario(nombreEliminado);
                mensaje = "Se elimino correctamente";
            } else {
                mensaje = "El usuario con ese nombre no existe";
            }
        }
        ArrayList<PersonaUsuario> listado = new ArrayList<PersonaUsuario>();
        listado = (ArrayList<PersonaUsuario>) listarInformacionCompletaTodosLosUsuarios();
        sesion.setAttribute("listadoPersonas", listado);
        mav.addObject("mensajeInformar", mensaje);
        return mav;

    }

    private static boolean eliminarPersona(int idUsuario) {
        com.portafolio.modelo.WSGestionarPersona_Service service = new com.portafolio.modelo.WSGestionarPersona_Service();
        com.portafolio.modelo.WSGestionarPersona port = service.getWSGestionarPersonaPort();
        return port.eliminarPersona(idUsuario);
    }

    private static boolean eliminarUsuario(java.lang.String nombreUsuario) {
        com.portafolio.servicios.WSGestionarUsuario_Service service = new com.portafolio.servicios.WSGestionarUsuario_Service();
        com.portafolio.servicios.WSGestionarUsuario port = service.getWSGestionarUsuarioPort();
        return port.eliminarUsuario(nombreUsuario);
    }

    private static int devolverIdUsuario(java.lang.String correoUNombre) {
        com.portafolio.servicios.WSGestionarUsuario_Service service = new com.portafolio.servicios.WSGestionarUsuario_Service();
        com.portafolio.servicios.WSGestionarUsuario port = service.getWSGestionarUsuarioPort();
        return port.devolverIdUsuario(correoUNombre);
    }

    private static boolean comprobarNombreUsuario(java.lang.String nombreUsuario) {
        com.portafolio.servicios.WSGestionarUsuario_Service service = new com.portafolio.servicios.WSGestionarUsuario_Service();
        com.portafolio.servicios.WSGestionarUsuario port = service.getWSGestionarUsuarioPort();
        return port.comprobarNombreUsuario(nombreUsuario);
    }

    private static boolean comprobarsiExisteEmail(java.lang.String emailUsuario) {
        com.portafolio.servicios.WSGestionarUsuario_Service service = new com.portafolio.servicios.WSGestionarUsuario_Service();
        com.portafolio.servicios.WSGestionarUsuario port = service.getWSGestionarUsuarioPort();
        return port.comprobarsiExisteEmail(emailUsuario);
    }

    private static java.util.List<com.portafolio.servicios.PersonaUsuario> listarInformacionCompletaTodosLosUsuarios() {
        com.portafolio.servicios.WSGestionarUsuario_Service service = new com.portafolio.servicios.WSGestionarUsuario_Service();
        com.portafolio.servicios.WSGestionarUsuario port = service.getWSGestionarUsuarioPort();
        return port.listarInformacionCompletaTodosLosUsuarios();
    }

}
