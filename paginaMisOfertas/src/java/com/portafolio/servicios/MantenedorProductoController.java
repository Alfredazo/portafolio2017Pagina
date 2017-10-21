package com.portafolio.servicios;



import com.portafolio.empresaService.Empresa;
import com.portafolio.service.Producto;
import com.portafolio.service.ProductoEmpresa;
import com.portafolio.service.TipoProducto;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("mantenedorProducto.htm")
public class MantenedorProductoController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView mantenedorProducto(HttpSession sesion) {
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
                    mav.setViewName("encargado/mantenedorProducto");
                } else {
                    mav.setViewName("administrador/mantenedorProducto");
                }

                ArrayList<Producto> listado =(ArrayList<Producto>) listarProducto();
                sesion.setAttribute("listarProducto", listado);
                
                ArrayList<TipoProducto> listado2 = (ArrayList<TipoProducto>) listarTipoProducto();
                sesion.setAttribute("listarTipoProducto", listado2);
                
                ArrayList<Empresa> listado3 = (ArrayList<Empresa>) listarEmpresas();
                sesion.setAttribute("listadoEmpresas", listado3);
                
                ArrayList<ProductoEmpresa> listado4 =(ArrayList<ProductoEmpresa>) listarProductoEmpresa();
                sesion.setAttribute("listadoProductoEmpresa", listado4);
                
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

    private static java.util.List<com.portafolio.service.Producto> listarProducto() {
        com.portafolio.service.WSGestionarProducto_Service service = new com.portafolio.service.WSGestionarProducto_Service();
        com.portafolio.service.WSGestionarProducto port = service.getWSGestionarProductoPort();
        return port.listarProducto();
    }

    private static java.util.List<com.portafolio.service.TipoProducto> listarTipoProducto() {
        com.portafolio.service.WSGestionarProducto_Service service = new com.portafolio.service.WSGestionarProducto_Service();
        com.portafolio.service.WSGestionarProducto port = service.getWSGestionarProductoPort();
        return port.listarTipoProducto();
    }

    private static java.util.List<com.portafolio.service.ProductoEmpresa> listarProductoEmpresa() {
        com.portafolio.service.WSGestionarProducto_Service service = new com.portafolio.service.WSGestionarProducto_Service();
        com.portafolio.service.WSGestionarProducto port = service.getWSGestionarProductoPort();
        return port.listarProductoEmpresa();
    }

 

}
