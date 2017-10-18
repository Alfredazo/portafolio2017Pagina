/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portafolio.servicios;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("agregarEmpresa.htm")
public class AgregarEmpresaController {
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView agregarControlador(HttpServletRequest request, HttpSession sesion) {
        String nombre = (String) sesion.getAttribute("nombre");
        if (nombre == null) {
            return new ModelAndView("redirect:/login.htm");
        } else {
            int nivelUsuarioSesion = (int) sesion.getAttribute("nivelUsuarioSesion");
            if (nivelUsuarioSesion == 0 || nivelUsuarioSesion == 2) {
                return new ModelAndView("redirect:/home.htm");
            } else {
                return new ModelAndView("redirect:/encargado.htm");
            }
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView registrarEmpresa(HttpServletRequest request) {
        boolean errorGeneral = false;
        String nombre = request.getParameter("nombreEmpresa");
        String nombreError = "";
        String nombreDev ="";
        if (nombre.isEmpty()) {
            nombreError = "El Nombre no debe venir vacio";
            errorGeneral = true;
        }else{
            nombreDev = nombre;
        }

        String descripcion = request.getParameter("descripcion");
        String descripcionError = "";
        String descripDev="";
        if (descripcionError.isEmpty()) {
            descripcionError = "La dirección no debe venir vacia";
            errorGeneral = true;
        }else{
            descripDev=descripcion;
        }

        int tipoEmpresa = Integer.parseInt(request.getParameter("tipoEmpresa"));
        String tipoEmpresaError = "";       
        if (tipoEmpresa == 0) {
            tipoEmpresaError = "Seleccione un tipo de Empresa";
            errorGeneral = true;
        }else{
            
        }

        int activo = Integer.parseInt(request.getParameter("empresaActiva"));
        String activoError = "";
        if (activo == 3) {
            activoError = "Seleccione SI o NO";
            errorGeneral = true;
        }

        String rolEmpresa = request.getParameter("rolEmpresa");
        String rolError = "";
        String rolDev ="";
        if (rolError.isEmpty()) {
            rolError = "El rol no debe venir vacio";
            errorGeneral = true;
        }else{
            rolDev = rolEmpresa;
        }

        String rutEmpresa = request.getParameter("rutEmpresa");
        String rutEmpresaError = "";
        String rutDev="";
        if (rutEmpresaError.isEmpty()) {
            rutEmpresaError = "El rut no debe venir vacio";
            errorGeneral = true;
        }else{
            if (validarRutEmpresa(rutEmpresa)) {
                rutEmpresa.replace(".", "");
                rutDev=rutEmpresa;
            }else{
               rutEmpresaError ="El rut que ingreso no Existe";
               errorGeneral=true;
            }            
        }

        if (errorGeneral == false) {
            /*Agregar A la BD*/
            return new ModelAndView("redirect:/mantenedorEmpresa.htm");
        }else{
            /*Mandar a La pagina con la lista de errores*/
            /*Este trozo de codigo esta malo hay que arreglar para que cumpla la condicion*/
            
//            ModelAndView mav = new ModelAndView();
//            mav.setViewName("home.htm");
//            mav.addObject("nombreError", nombreError);
//            mav.addObject("descripcionError", descripcionError);
//            mav.addObject("tipoEmpresaError", tipoEmpresaError);
//            mav.addObject("activoError", activoError);
//            mav.addObject("rolError", rolError);
//            mav.addObject("rutEmpresaError", rutEmpresaError);    
//            /*Devolver Valores correctos en caso de error*/
//            mav.addObject("nombreDev", nombreDev);
//            mav.addObject("descripDev", descripDev);
//            mav.addObject("nombreDev", nombreDev);
//            mav.addObject("rolDev", rolDev);
//            mav.addObject("rutDev", rutDev);
//            
//            return mav;
            return new ModelAndView("redirect:/home.htm");
            
        }
                
    }

    private static boolean validarRutEmpresa(String rut) {
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
    
}
