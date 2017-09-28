
package com.portafolio.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listarUsuariosPorRangoDePuntos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listarUsuariosPorRangoDePuntos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rangoInicial" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rangoFinal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarUsuariosPorRangoDePuntos", propOrder = {
    "rangoInicial",
    "rangoFinal"
})
public class ListarUsuariosPorRangoDePuntos {

    protected int rangoInicial;
    protected int rangoFinal;

    /**
     * Obtiene el valor de la propiedad rangoInicial.
     * 
     */
    public int getRangoInicial() {
        return rangoInicial;
    }

    /**
     * Define el valor de la propiedad rangoInicial.
     * 
     */
    public void setRangoInicial(int value) {
        this.rangoInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad rangoFinal.
     * 
     */
    public int getRangoFinal() {
        return rangoFinal;
    }

    /**
     * Define el valor de la propiedad rangoFinal.
     * 
     */
    public void setRangoFinal(int value) {
        this.rangoFinal = value;
    }

}
