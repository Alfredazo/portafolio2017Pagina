
package com.portafolio.ws.producto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.portafolio.ws.producto package. 
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

    private final static QName _Hello_QNAME = new QName("http://service.portafolio.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://service.portafolio.com/", "helloResponse");
    private final static QName _RegistrarProducto_QNAME = new QName("http://service.portafolio.com/", "registrarProducto");
    private final static QName _RegistrarProductoResponse_QNAME = new QName("http://service.portafolio.com/", "registrarProductoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.portafolio.ws.producto
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link RegistrarProducto }
     * 
     */
    public RegistrarProducto createRegistrarProducto() {
        return new RegistrarProducto();
    }

    /**
     * Create an instance of {@link RegistrarProductoResponse }
     * 
     */
    public RegistrarProductoResponse createRegistrarProductoResponse() {
        return new RegistrarProductoResponse();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "registrarProducto")
    public JAXBElement<RegistrarProducto> createRegistrarProducto(RegistrarProducto value) {
        return new JAXBElement<RegistrarProducto>(_RegistrarProducto_QNAME, RegistrarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "registrarProductoResponse")
    public JAXBElement<RegistrarProductoResponse> createRegistrarProductoResponse(RegistrarProductoResponse value) {
        return new JAXBElement<RegistrarProductoResponse>(_RegistrarProductoResponse_QNAME, RegistrarProductoResponse.class, null, value);
    }

}
