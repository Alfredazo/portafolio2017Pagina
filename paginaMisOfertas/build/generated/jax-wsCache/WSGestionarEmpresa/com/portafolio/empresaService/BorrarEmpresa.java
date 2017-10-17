
package com.portafolio.empresaService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para borrarEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="borrarEmpresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idEmpresa" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "borrarEmpresa", propOrder = {
    "idEmpresa"
})
public class BorrarEmpresa {

    protected int idEmpresa;

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

}
