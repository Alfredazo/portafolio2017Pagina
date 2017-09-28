
package com.portafolio.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para devolverIdUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="devolverIdUsuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="correoUNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "devolverIdUsuario", propOrder = {
    "correoUNombre"
})
public class DevolverIdUsuario {

    protected String correoUNombre;

    /**
     * Obtiene el valor de la propiedad correoUNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoUNombre() {
        return correoUNombre;
    }

    /**
     * Define el valor de la propiedad correoUNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoUNombre(String value) {
        this.correoUNombre = value;
    }

}
