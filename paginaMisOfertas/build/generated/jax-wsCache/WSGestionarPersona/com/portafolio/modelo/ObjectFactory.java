
package com.portafolio.modelo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.portafolio.modelo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ComprobarSiExisteRut_QNAME = new QName("http://service.portafolio.com/", "comprobarSiExisteRut");
    private final static QName _ComprobarSiExisteRutResponse_QNAME = new QName("http://service.portafolio.com/", "comprobarSiExisteRutResponse");
    private final static QName _EliminarPersona_QNAME = new QName("http://service.portafolio.com/", "eliminarPersona");
    private final static QName _EliminarPersonaResponse_QNAME = new QName("http://service.portafolio.com/", "eliminarPersonaResponse");
    private final static QName _Hello_QNAME = new QName("http://service.portafolio.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://service.portafolio.com/", "helloResponse");
    private final static QName _IngresarPersona_QNAME = new QName("http://service.portafolio.com/", "ingresarPersona");
    private final static QName _IngresarPersonaResponse_QNAME = new QName("http://service.portafolio.com/", "ingresarPersonaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.portafolio.modelo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComprobarSiExisteRut }
     * 
     */
    public ComprobarSiExisteRut createComprobarSiExisteRut() {
        return new ComprobarSiExisteRut();
    }

    /**
     * Create an instance of {@link ComprobarSiExisteRutResponse }
     * 
     */
    public ComprobarSiExisteRutResponse createComprobarSiExisteRutResponse() {
        return new ComprobarSiExisteRutResponse();
    }

    /**
     * Create an instance of {@link EliminarPersona }
     * 
     */
    public EliminarPersona createEliminarPersona() {
        return new EliminarPersona();
    }

    /**
     * Create an instance of {@link EliminarPersonaResponse }
     * 
     */
    public EliminarPersonaResponse createEliminarPersonaResponse() {
        return new EliminarPersonaResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link IngresarPersona }
     * 
     */
    public IngresarPersona createIngresarPersona() {
        return new IngresarPersona();
    }

    /**
     * Create an instance of {@link IngresarPersonaResponse }
     * 
     */
    public IngresarPersonaResponse createIngresarPersonaResponse() {
        return new IngresarPersonaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobarSiExisteRut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "comprobarSiExisteRut")
    public JAXBElement<ComprobarSiExisteRut> createComprobarSiExisteRut(ComprobarSiExisteRut value) {
        return new JAXBElement<ComprobarSiExisteRut>(_ComprobarSiExisteRut_QNAME, ComprobarSiExisteRut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobarSiExisteRutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "comprobarSiExisteRutResponse")
    public JAXBElement<ComprobarSiExisteRutResponse> createComprobarSiExisteRutResponse(ComprobarSiExisteRutResponse value) {
        return new JAXBElement<ComprobarSiExisteRutResponse>(_ComprobarSiExisteRutResponse_QNAME, ComprobarSiExisteRutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "eliminarPersona")
    public JAXBElement<EliminarPersona> createEliminarPersona(EliminarPersona value) {
        return new JAXBElement<EliminarPersona>(_EliminarPersona_QNAME, EliminarPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "eliminarPersonaResponse")
    public JAXBElement<EliminarPersonaResponse> createEliminarPersonaResponse(EliminarPersonaResponse value) {
        return new JAXBElement<EliminarPersonaResponse>(_EliminarPersonaResponse_QNAME, EliminarPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "ingresarPersona")
    public JAXBElement<IngresarPersona> createIngresarPersona(IngresarPersona value) {
        return new JAXBElement<IngresarPersona>(_IngresarPersona_QNAME, IngresarPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "ingresarPersonaResponse")
    public JAXBElement<IngresarPersonaResponse> createIngresarPersonaResponse(IngresarPersonaResponse value) {
        return new JAXBElement<IngresarPersonaResponse>(_IngresarPersonaResponse_QNAME, IngresarPersonaResponse.class, null, value);
    }

}
