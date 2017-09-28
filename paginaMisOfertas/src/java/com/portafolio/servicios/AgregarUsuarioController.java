/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portafolio.servicios;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Alfredazo
 */
public class AgregarUsuarioController {

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
    public ModelAndView registrarse(HttpServletRequest request) {
        /*Rescatar Datos*/
        boolean error = false;
        String nombreUsuario = request.getParameter("nombreUsuario");
        String mensajeNombre = "";
        String nombreDevuelta = "";
        String mensajedeErrores = "";
        if (nombreUsuario.isEmpty()) {
            error = true;
            mensajeNombre = "El nombre no debe venir vacio";
        } else {
            if (comprobarNombreUsuario(nombreUsuario)) {
                error = true;
                mensajeNombre = "El nombre ya existe";
                mensajedeErrores += mensajeNombre;
            } else {
                nombreDevuelta = nombreUsuario;
            }
        }

        String email = request.getParameter("email");
        String mensajeEmail = "";
        String mensajeDevuelta = "";
        if (email.isEmpty()) {
            error = true;
            mensajeDevuelta = "El nombre no debe venir vacio";
        } else {
            if (comprobarsiExisteEmail(email)) {
                error = true;
                mensajeEmail = "El email ya existe";
                mensajedeErrores += "\n" + mensajeEmail;
            } else {
                mensajeDevuelta = email;
            }
        }

        String clave = request.getParameter("clave");
        String repetirClave = request.getParameter("repetirClave");
        String mensajeClave = "";
        if (!clave.equals(repetirClave)) {
            error = true;
            mensajeClave = "Las claves no coinciden entre si";
        } else {
            if (clave.length() < 6) {
                error = true;
                mensajeClave = "La clave debe contener más de 6 Caracteres";
            }
        }

        int puntosAcumulados = 0;
        int nivelUsuario = 0;
        String rescatarDatosSelected = request.getParameter("nivelUsuario");
        if (rescatarDatosSelected.equals("Consumidor")) {
            nivelUsuario = 0;
        } else if (rescatarDatosSelected.equals("Gerente")) {
            nivelUsuario = 2;
        } else if (rescatarDatosSelected.equals("Encargado")) {
            nivelUsuario = 1;
        } else if (rescatarDatosSelected.equals("Adminsitrador")) {
            nivelUsuario = 3;
        }
        System.out.println(nivelUsuario);
        String urlImagen = "N/A";

        /*Usuario Validado - Validar Persona ahora*/
        boolean errorPersona = false;
        String rut = request.getParameter("rut");
        String mensajeRut = "";
        String rutDevuelta = "";
        if (rut.isEmpty()) {
            errorPersona = true;
            mensajeRut = "El Rut no debe venir Vacio";
        } else {
            if (validarRut(rut) == false) {
                errorPersona = true;
                mensajeRut = "El rut es incorrecto";
            } else {
                if (comprobarSiExisteRut(rut)) {
                    errorPersona = true;
                    mensajeRut = "El rut ya esta Registrado";
                } else {
                    rutDevuelta = rut;
                }
            }
        }

        String primerNombre = request.getParameter("primerNombre");
        String mensajePrimerN = "";
        String primerNDevuelta = "";
        if (primerNombre.isEmpty()) {
            errorPersona = true;
            mensajePrimerN = "El primer N. no debe venir Vacio";
        } else {
            primerNDevuelta = primerNombre;
        }

        String segundoNombre = request.getParameter("segundoNombre");
        String mensajeSegundoN = "";
        String segundoNDevuelta = "";
        if (segundoNombre.isEmpty()) {
            errorPersona = true;
            mensajeSegundoN = "El Segundo N. no debe venir Vacio";
        } else {
            segundoNDevuelta = segundoNombre;
        }

        String primerApellido = request.getParameter("primerApellido");
        String mensajePrimerApellido = "";
        String primerApellidoDevuelta = "";
        if (primerApellido.isEmpty()) {
            errorPersona = true;
            mensajePrimerApellido = "El Apellido P. no debe venir Vacio";
        } else {
            primerApellidoDevuelta = primerApellido;
        }

        String segundoApellido = request.getParameter("segundoApellido");
        String mensajeSegundoApellido = "";
        String segundoApellidoDevuelta = "";
        if (segundoApellido.isEmpty()) {
            errorPersona = true;
            mensajeSegundoApellido = "El Apellido M. no debe venir Vacio";
        } else {
            segundoApellidoDevuelta = segundoApellido;
        }

        String fechaNacimiento = request.getParameter("fechaNacimiento");
        String mensajeFecha = "";
        String fechaDevuelta = "";
        if (fechaNacimiento == null) {
            mensajeFecha = "La fecha no debe venir en blanco";
        } else {
            /*Parsear la fecha*/
            fechaDevuelta = fechaNacimiento;
        }

        System.out.println("Fecha: " + fechaNacimiento);

        String direccion = request.getParameter("direccion");
        String mensajeDireccion = "";
        String direccionDevuelta = "";
        if (direccion.isEmpty()) {
            mensajeDireccion = "La dirección no debe venir en blanco";
        } else {
            direccionDevuelta = direccion;
        }

        int telefono = Integer.parseInt(request.getParameter("telefono"));
        String mensajeTelefono = "";
        String telefonoDevuelta = "";
        if (String.valueOf(telefono).isEmpty()) {
            mensajeTelefono = "El Telefono no debe venir en blanco";
        } else {
            telefonoDevuelta = String.valueOf(telefono);
        }
        String erroresGenerales = "";
        if (error == false && errorPersona == false) {
            /*creo las cosas*/
            if (ingresarUsuario(nombreUsuario, clave, email, puntosAcumulados, nivelUsuario, urlImagen)) {
                int idUsuarioPersona = retornarUltimoIDUsuario();
                /*Ingresar Persona*/
                if (ingresarPersona(rut, primerNombre, segundoNombre, primerApellido, segundoApellido, fechaNacimiento, direccion, telefono, idUsuarioPersona)) {
                    return new ModelAndView("redirect:/home.htm");
                } else {
                    System.out.println("ERROR PERSONA");
                    ModelAndView mavErrores = new ModelAndView();
                    mavErrores.setViewName("administrador/mantenedorUsuario");
                    mavErrores.addObject("nombreError", mensajeNombre);
                    mavErrores.addObject("emailError", mensajeEmail);
                    mavErrores.addObject("claveError", mensajeClave);
                    mavErrores.addObject("errorRut", mensajeRut);
                    mavErrores.addObject("errorPrimerN", mensajePrimerN);
                    mavErrores.addObject("errorSegundoN", mensajeSegundoN);
                    mavErrores.addObject("errorPrimerA", mensajePrimerApellido);
                    mavErrores.addObject("errorSegundoA", mensajeSegundoApellido);
                    mavErrores.addObject("errorFechaN", mensajeFecha);
                    mavErrores.addObject("errorDireccion", mensajeDireccion);
                    mavErrores.addObject("errorTelefono", mensajeTelefono);

                    mavErrores.addObject("nombreValue", nombreDevuelta);
                    mavErrores.addObject("emailValue", mensajeDevuelta);
                    mavErrores.addObject("rutValue", rutDevuelta);
                    mavErrores.addObject("primerNValue", primerNDevuelta);
                    mavErrores.addObject("segundoNValue", segundoNDevuelta);
                    mavErrores.addObject("primerAValue", primerApellidoDevuelta);
                    mavErrores.addObject("segundoAValue", segundoApellidoDevuelta);
                    mavErrores.addObject("fechaValue", fechaDevuelta);
                    mavErrores.addObject("direccionValue", direccionDevuelta);
                    mavErrores.addObject("telefonoValue", telefonoDevuelta);
                    return mavErrores;
                }
            }
            System.out.println("ERROR Usuario");
            ModelAndView mavErrores = new ModelAndView();
            mavErrores.setViewName("administrador/mantenedorUsuario");
            mavErrores.addObject("nombreError", mensajeNombre);
            mavErrores.addObject("emailError", mensajeEmail);
            mavErrores.addObject("claveError", mensajeClave);
            mavErrores.addObject("errorRut", mensajeRut);
            mavErrores.addObject("errorPrimerN", mensajePrimerN);
            mavErrores.addObject("errorSegundoN", mensajeSegundoN);
            mavErrores.addObject("errorPrimerA", mensajePrimerApellido);
            mavErrores.addObject("errorSegundoA", mensajeSegundoApellido);
            mavErrores.addObject("errorFechaN", mensajeFecha);
            mavErrores.addObject("errorDireccion", mensajeDireccion);
            mavErrores.addObject("errorTelefono", mensajeTelefono);
            mavErrores.addObject("errorGeneral", "No se pudo crear revise nuevamente el modal.");

            mavErrores.addObject("nombreValue", nombreDevuelta);
            mavErrores.addObject("emailValue", mensajeDevuelta);
            mavErrores.addObject("rutValue", rutDevuelta);
            mavErrores.addObject("primerNValue", primerNDevuelta);
            mavErrores.addObject("segundoNValue", segundoNDevuelta);
            mavErrores.addObject("primerAValue", primerApellidoDevuelta);
            mavErrores.addObject("segundoAValue", segundoApellidoDevuelta);
            mavErrores.addObject("fechaValue", fechaDevuelta);
            mavErrores.addObject("direccionValue", direccionDevuelta);
            mavErrores.addObject("telefonoValue", telefonoDevuelta);

        } else {
            ModelAndView mavErrores = new ModelAndView();
            mavErrores.setViewName("administrador/mantenedorUsuario");
            mavErrores.addObject("nombreError", mensajeNombre);
            mavErrores.addObject("emailError", mensajeEmail);
            mavErrores.addObject("claveError", mensajeClave);
            mavErrores.addObject("errorRut", mensajeRut);
            mavErrores.addObject("errorPrimerN", mensajePrimerN);
            mavErrores.addObject("errorSegundoN", mensajeSegundoN);
            mavErrores.addObject("errorPrimerA", mensajePrimerApellido);
            mavErrores.addObject("errorSegundoA", mensajeSegundoApellido);
            mavErrores.addObject("errorFechaN", mensajeFecha);
            mavErrores.addObject("errorDireccion", mensajeDireccion);
            mavErrores.addObject("errorTelefono", mensajeTelefono);
            mavErrores.addObject("errorGeneral", "No se pudo crear revise nuevamente el modal.");

            mavErrores.addObject("nombreValue", nombreDevuelta);
            mavErrores.addObject("emailValue", mensajeDevuelta);
            mavErrores.addObject("rutValue", rutDevuelta);
            mavErrores.addObject("primerNValue", primerNDevuelta);
            mavErrores.addObject("segundoNValue", segundoNDevuelta);
            mavErrores.addObject("primerAValue", primerApellidoDevuelta);
            mavErrores.addObject("segundoAValue", segundoApellidoDevuelta);
            mavErrores.addObject("fechaValue", fechaDevuelta);
            mavErrores.addObject("direccionValue", direccionDevuelta);
            mavErrores.addObject("telefonoValue", telefonoDevuelta);

            return mavErrores;
        }
        return null;
    }

    private static boolean ingresarUsuario(java.lang.String nombreUsuario, java.lang.String claveUsuario, java.lang.String emailUsuario, int puntosAcumulados, int nivelUsuario, java.lang.String urlImagenUsuario) {
        com.portafolio.servicios.WSGestionarUsuario_Service service = new com.portafolio.servicios.WSGestionarUsuario_Service();
        com.portafolio.servicios.WSGestionarUsuario port = service.getWSGestionarUsuarioPort();
        return port.ingresarUsuario(nombreUsuario, claveUsuario, emailUsuario, puntosAcumulados, nivelUsuario, urlImagenUsuario);
    }

    private static boolean validarRut(String rut) {
        boolean validacion = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

    private static boolean ingresarPersona(java.lang.String rut, java.lang.String primerNombre, java.lang.String segundoNombre, java.lang.String primerApellido, java.lang.String segundoApellido, java.lang.String fechaNacimiento, java.lang.String direccion, int telefono, int idUsuario) {
        com.portafolio.modelo.WSGestionarPersona_Service service = new com.portafolio.modelo.WSGestionarPersona_Service();
        com.portafolio.modelo.WSGestionarPersona port = service.getWSGestionarPersonaPort();
        return port.ingresarPersona(rut, primerNombre, segundoNombre, primerApellido, segundoApellido, fechaNacimiento, direccion, telefono, idUsuario);
    }

    private static int retornarUltimoIDUsuario() {
        com.portafolio.servicios.WSGestionarUsuario_Service service = new com.portafolio.servicios.WSGestionarUsuario_Service();
        com.portafolio.servicios.WSGestionarUsuario port = service.getWSGestionarUsuarioPort();
        return port.retornarUltimoIDUsuario();
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

    private static boolean comprobarSiExisteRut(java.lang.String rut) {
        com.portafolio.modelo.WSGestionarPersona_Service service = new com.portafolio.modelo.WSGestionarPersona_Service();
        com.portafolio.modelo.WSGestionarPersona port = service.getWSGestionarPersonaPort();
        return port.comprobarSiExisteRut(rut);
    }

}
