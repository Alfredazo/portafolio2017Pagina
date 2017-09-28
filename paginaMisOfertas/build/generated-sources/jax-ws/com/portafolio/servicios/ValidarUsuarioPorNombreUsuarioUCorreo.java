
package com.portafolio.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validarUsuarioPorNombreUsuarioUCorreo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validarUsuarioPorNombreUsuarioUCorreo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usuarioUCorreo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claveUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarUsuarioPorNombreUsuarioUCorreo", propOrder = {
    "usuarioUCorreo",
    "claveUsuario"
})
public class ValidarUsuarioPorNombreUsuarioUCorreo {

    protected String usuarioUCorreo;
    protected String claveUsuario;

    /**
     * Obtiene el valor de la propiedad usuarioUCorreo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioUCorreo() {
        return usuarioUCorreo;
    }

    /**
     * Define el valor de la propiedad usuarioUCorreo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioUCorreo(String value) {
        this.usuarioUCorreo = value;
    }

    /**
     * Obtiene el valor de la propiedad claveUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveUsuario() {
        return claveUsuario;
    }

    /**
     * Define el valor de la propiedad claveUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveUsuario(String value) {
        this.claveUsuario = value;
    }

}
