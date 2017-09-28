
package com.portafolio.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ingresarUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ingresarUsuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claveUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="puntosAcumulados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nivelUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="urlImagenUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ingresarUsuario", propOrder = {
    "nombreUsuario",
    "claveUsuario",
    "emailUsuario",
    "puntosAcumulados",
    "nivelUsuario",
    "urlImagenUsuario"
})
public class IngresarUsuario {

    protected String nombreUsuario;
    protected String claveUsuario;
    protected String emailUsuario;
    protected int puntosAcumulados;
    protected int nivelUsuario;
    protected String urlImagenUsuario;

    /**
     * Obtiene el valor de la propiedad nombreUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Define el valor de la propiedad nombreUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUsuario(String value) {
        this.nombreUsuario = value;
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

    /**
     * Obtiene el valor de la propiedad emailUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailUsuario() {
        return emailUsuario;
    }

    /**
     * Define el valor de la propiedad emailUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailUsuario(String value) {
        this.emailUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad puntosAcumulados.
     * 
     */
    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    /**
     * Define el valor de la propiedad puntosAcumulados.
     * 
     */
    public void setPuntosAcumulados(int value) {
        this.puntosAcumulados = value;
    }

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

    /**
     * Obtiene el valor de la propiedad urlImagenUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlImagenUsuario() {
        return urlImagenUsuario;
    }

    /**
     * Define el valor de la propiedad urlImagenUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlImagenUsuario(String value) {
        this.urlImagenUsuario = value;
    }

}
