/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@RequestMapping("modificarEmpresa.htm")
public class ModificarEmpresaController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView eliminarControlador(HttpServletRequest request, HttpSession sesion) {
        String nombre = (String) sesion.getAttribute("nombre");
        if (nombre == null) {
            return new ModelAndView("redirect:/login.htm");
        } else {
            int nivelUsuarioSesion = (int) sesion.getAttribute("nivelUsuarioSesion");
            if (nivelUsuarioSesion == 0 || nivelUsuarioSesion == 2) {
                return new ModelAndView("redirect:/home.htm");
            } else {
                return new ModelAndView("redirect:/gerente.htm");
            }

        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView eliminarUsuarioController(HttpServletRequest request, HttpSession sesion) {
        int idEmpresa = Integer.parseInt(request.getParameter("idEmpresaModi"));
        int nivelUsuarioSesion = (int) sesion.getAttribute("nivelUsuarioSesion");
        if (nivelUsuarioSesion == 0 || nivelUsuarioSesion == 2) {
            return new ModelAndView("redirect:/home.htm");
        } else {           
            /*rescatar los datos del modal modificar*/
            boolean errorGeneral = false;
            String nombre = request.getParameter("nombreEmpresa");
            String nombreError = "";
            String nombreDev = "";
            if (nombre.isEmpty()) {
                nombreError = "El Nombre no debe venir vacio";
                errorGeneral = true;
            } else {
                nombreDev = nombre;
            }

            String descripcion = request.getParameter("descripcion");
            String descripcionError = "";
            String descripDev = "";
            if (descripcion.isEmpty()) {
                descripcionError = "La dirección no debe venir vacia";
                errorGeneral = true;
            } else {
                descripDev = descripcion;
            }

            int tipoEmpresa = Integer.parseInt(request.getParameter("tipoEmpresa"));
            String tipoEmpresaError = "";
            if (tipoEmpresa == 0) {
                tipoEmpresaError = "Seleccione un tipo de Empresa";
                errorGeneral = true;
            } else {

            }

            int activo = Integer.parseInt(request.getParameter("empresaActiva"));
            String activoError = "";
            if (activo == 3) {
                activoError = "Seleccione SI o NO";
                errorGeneral = true;
            }

            String rolEmpresa = request.getParameter("rolEmpresa");
            String rolError = "";
            String rolDev = "";
            if (rolEmpresa.isEmpty()) {
                rolError = "El rol no debe venir vacio";
                errorGeneral = true;
            } else {
                rolDev = rolEmpresa;
            }

            String rutEmpresa = request.getParameter("rutEmpresa");
            String rutEmpresaError = "";
            String rutDev = "";
            if (rutEmpresa.isEmpty()) {
                rutEmpresaError = "El rut no debe venir vacio";
                errorGeneral = true;
            } else {
                if (validarRutEmpresa(rutEmpresa)) {
                    rutEmpresa.replace(".", "");
                    rutDev = rutEmpresa;
                } else {
                    rutEmpresaError = "El rut que ingreso no Existe";
                    errorGeneral = true;
                }
            }

            if (errorGeneral == false) {
                /*Agregar A la BD*/
                ModelAndView mav = new ModelAndView();
                int nivelUsuario = (int) sesion.getAttribute("nivelUsuarioSesion");
                if (nivelUsuario == 1) {
                    mav.setViewName("encargado/mantenedorEmpresa");
                } else {
                    mav.setViewName("administrador/mantenedorEmpresa");
                }
                String activoPaso = "";
                if (activo == 1) {
                    activoPaso = "1";
                } else {
                    activoPaso = "0";
                }
                
                actualizarEmpresa(idEmpresa, nombre, descripcion, tipoEmpresa, activoPaso, rolDev, rutEmpresa);

                mav.addObject("errorGeneral", "Se ha Modificado Correctamente");
                /*Refrescar la Lista*/
                ArrayList<Empresa> listado;
                listado = (ArrayList<Empresa>) listarEmpresas();
                sesion.setAttribute("listadoEmpresas", listado);
                return mav;
            } else {
                /*Mandar a La pagina con la lista de errores*/

                ModelAndView mav = new ModelAndView();
                int nivelUsuario = (int) sesion.getAttribute("nivelUsuarioSesion");
                if (nivelUsuario == 1) {
                    mav.setViewName("encargado/mantenedorEmpresa");
                } else {
                    mav.setViewName("administrador/mantenedorEmpresa");
                }

                mav.addObject("nombreErrorM", nombreError);
                mav.addObject("descripcionErrorM", descripcionError);
                mav.addObject("tipoEmpresaErrorM", tipoEmpresaError);
                mav.addObject("activoErrorM", activoError);
                mav.addObject("rolErrorM", rolError);
                mav.addObject("rutEmpresaErrorM", rutEmpresaError);
                /*Devolver Valores correctos en caso de error*/
                mav.addObject("nombreDevM", nombreDev);
                mav.addObject("descripDevM", descripDev);
                mav.addObject("nombreDevM", nombreDev);
                mav.addObject("rolDevM", rolDev);
                mav.addObject("rutDevM", rutDev);
                mav.addObject("errorGeneral", "Error al modificar Empresa. Revise los Campos Porfavor");

                return mav;
//            return new ModelAndView("redirect:/home.htm");

            }
        }

    }

    private static java.util.List<com.portafolio.empresaService.Empresa> listarEmpresas() {
        com.portafolio.empresaService.WSGestionarEmpresa_Service service = new com.portafolio.empresaService.WSGestionarEmpresa_Service();
        com.portafolio.empresaService.WSGestionarEmpresa port = service.getWSGestionarEmpresaPort();
        return port.listarEmpresas();
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

    private static boolean actualizarEmpresa(int idEmpresa, java.lang.String nombre, java.lang.String descripcion, int idTipoEmpresa, java.lang.String activo, java.lang.String rol, java.lang.String rutEmpresa) {
        com.portafolio.empresaService.WSGestionarEmpresa_Service service = new com.portafolio.empresaService.WSGestionarEmpresa_Service();
        com.portafolio.empresaService.WSGestionarEmpresa port = service.getWSGestionarEmpresaPort();
        return port.actualizarEmpresa(idEmpresa, nombre, descripcion, idTipoEmpresa, activo, rol, rutEmpresa);
    }
}
