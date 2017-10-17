
package com.portafolio.empresaService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.portafolio.empresaService package. 
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

    private final static QName _ActualizarEmpresa_QNAME = new QName("http://service.portafolio.com/", "actualizarEmpresa");
    private final static QName _ActualizarEmpresaResponse_QNAME = new QName("http://service.portafolio.com/", "actualizarEmpresaResponse");
    private final static QName _BorrarEmpresa_QNAME = new QName("http://service.portafolio.com/", "borrarEmpresa");
    private final static QName _BorrarEmpresaResponse_QNAME = new QName("http://service.portafolio.com/", "borrarEmpresaResponse");
    private final static QName _IngresarEmpresa_QNAME = new QName("http://service.portafolio.com/", "ingresarEmpresa");
    private final static QName _IngresarEmpresaResponse_QNAME = new QName("http://service.portafolio.com/", "ingresarEmpresaResponse");
    private final static QName _ListarEmpresas_QNAME = new QName("http://service.portafolio.com/", "listarEmpresas");
    private final static QName _ListarEmpresasResponse_QNAME = new QName("http://service.portafolio.com/", "listarEmpresasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.portafolio.empresaService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarEmpresa }
     * 
     */
    public ActualizarEmpresa createActualizarEmpresa() {
        return new ActualizarEmpresa();
    }

    /**
     * Create an instance of {@link ActualizarEmpresaResponse }
     * 
     */
    public ActualizarEmpresaResponse createActualizarEmpresaResponse() {
        return new ActualizarEmpresaResponse();
    }

    /**
     * Create an instance of {@link BorrarEmpresa }
     * 
     */
    public BorrarEmpresa createBorrarEmpresa() {
        return new BorrarEmpresa();
    }

    /**
     * Create an instance of {@link BorrarEmpresaResponse }
     * 
     */
    public BorrarEmpresaResponse createBorrarEmpresaResponse() {
        return new BorrarEmpresaResponse();
    }

    /**
     * Create an instance of {@link IngresarEmpresa }
     * 
     */
    public IngresarEmpresa createIngresarEmpresa() {
        return new IngresarEmpresa();
    }

    /**
     * Create an instance of {@link IngresarEmpresaResponse }
     * 
     */
    public IngresarEmpresaResponse createIngresarEmpresaResponse() {
        return new IngresarEmpresaResponse();
    }

    /**
     * Create an instance of {@link ListarEmpresas }
     * 
     */
    public ListarEmpresas createListarEmpresas() {
        return new ListarEmpresas();
    }

    /**
     * Create an instance of {@link ListarEmpresasResponse }
     * 
     */
    public ListarEmpresasResponse createListarEmpresasResponse() {
        return new ListarEmpresasResponse();
    }

    /**
     * Create an instance of {@link Empresa }
     * 
     */
    public Empresa createEmpresa() {
        return new Empresa();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarEmpresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "actualizarEmpresa")
    public JAXBElement<ActualizarEmpresa> createActualizarEmpresa(ActualizarEmpresa value) {
        return new JAXBElement<ActualizarEmpresa>(_ActualizarEmpresa_QNAME, ActualizarEmpresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarEmpresaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "actualizarEmpresaResponse")
    public JAXBElement<ActualizarEmpresaResponse> createActualizarEmpresaResponse(ActualizarEmpresaResponse value) {
        return new JAXBElement<ActualizarEmpresaResponse>(_ActualizarEmpresaResponse_QNAME, ActualizarEmpresaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarEmpresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "borrarEmpresa")
    public JAXBElement<BorrarEmpresa> createBorrarEmpresa(BorrarEmpresa value) {
        return new JAXBElement<BorrarEmpresa>(_BorrarEmpresa_QNAME, BorrarEmpresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarEmpresaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "borrarEmpresaResponse")
    public JAXBElement<BorrarEmpresaResponse> createBorrarEmpresaResponse(BorrarEmpresaResponse value) {
        return new JAXBElement<BorrarEmpresaResponse>(_BorrarEmpresaResponse_QNAME, BorrarEmpresaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarEmpresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "ingresarEmpresa")
    public JAXBElement<IngresarEmpresa> createIngresarEmpresa(IngresarEmpresa value) {
        return new JAXBElement<IngresarEmpresa>(_IngresarEmpresa_QNAME, IngresarEmpresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarEmpresaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "ingresarEmpresaResponse")
    public JAXBElement<IngresarEmpresaResponse> createIngresarEmpresaResponse(IngresarEmpresaResponse value) {
        return new JAXBElement<IngresarEmpresaResponse>(_IngresarEmpresaResponse_QNAME, IngresarEmpresaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEmpresas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "listarEmpresas")
    public JAXBElement<ListarEmpresas> createListarEmpresas(ListarEmpresas value) {
        return new JAXBElement<ListarEmpresas>(_ListarEmpresas_QNAME, ListarEmpresas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEmpresasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "listarEmpresasResponse")
    public JAXBElement<ListarEmpresasResponse> createListarEmpresasResponse(ListarEmpresasResponse value) {
        return new JAXBElement<ListarEmpresasResponse>(_ListarEmpresasResponse_QNAME, ListarEmpresasResponse.class, null, value);
    }

}
