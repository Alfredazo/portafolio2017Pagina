
package com.portafolio.empresaService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarEmpresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idEmpresa" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idTipoEmpresa" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="activo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rutEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarEmpresa", propOrder = {
    "idEmpresa",
    "nombre",
    "descripcion",
    "idTipoEmpresa",
    "activo",
    "rol",
    "rutEmpresa"
})
public class ActualizarEmpresa {

    protected int idEmpresa;
    protected String nombre;
    protected String descripcion;
    protected int idTipoEmpresa;
    protected String activo;
    protected String rol;
    protected String rutEmpresa;

    /**
     * Obtiene el valor de la propiedad idEmpresa.
     * 
     */
    public int getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * Define el valor de la propiedad idEmpresa.
     * 
     */
    public void setIdEmpresa(int value) {
        this.idEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoEmpresa.
     * 
     */
    public int getIdTipoEmpresa() {
        return idTipoEmpresa;
    }

    /**
     * Define el valor de la propiedad idTipoEmpresa.
     * 
     */
    public void setIdTipoEmpresa(int value) {
        this.idTipoEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad activo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivo() {
        return activo;
    }

    /**
     * Define el valor de la propiedad activo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivo(String value) {
        this.activo = value;
    }

    /**
     * Obtiene el valor de la propiedad rol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRol() {
        return rol;
    }

    /**
     * Define el valor de la propiedad rol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRol(String value) {
        this.rol = value;
    }

    /**
     * Obtiene el valor de la propiedad rutEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutEmpresa() {
        return rutEmpresa;
    }

    /**
     * Define el valor de la propiedad rutEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutEmpresa(String value) {
        this.rutEmpresa = value;
    }

}
