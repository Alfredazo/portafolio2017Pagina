
package com.portafolio.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listarUsuariosPorNivel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listarUsuariosPorNivel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nivelUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarUsuariosPorNivel", propOrder = {
    "nivelUsuario"
})
public class ListarUsuariosPorNivel {

    protected int nivelUsuario;

    /**
     * Obtiene el valor de la propiedad nivelUsuario.
     * 
     */
    public int getNivelUsuario() {
        return nivelUsuario;
    }

    /**
     * Define el valor de la propiedad nivelUsuario.
     * 
     */
    public void setNivelUsuario(int value) {
        this.nivelUsuario = value;
    }

}
