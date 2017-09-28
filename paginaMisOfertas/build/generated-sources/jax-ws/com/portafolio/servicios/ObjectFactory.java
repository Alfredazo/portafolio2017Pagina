
package com.portafolio.servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.portafolio.servicios package. 
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

    private final static QName _ComprobarNombreUsuario_QNAME = new QName("http://service.portafolio.com/", "comprobarNombreUsuario");
    private final static QName _ComprobarNombreUsuarioResponse_QNAME = new QName("http://service.portafolio.com/", "comprobarNombreUsuarioResponse");
    private final static QName _ComprobarsiExisteEmail_QNAME = new QName("http://service.portafolio.com/", "comprobarsiExisteEmail");
    private final static QName _ComprobarsiExisteEmailResponse_QNAME = new QName("http://service.portafolio.com/", "comprobarsiExisteEmailResponse");
    private final static QName _DevolverIdUsuario_QNAME = new QName("http://service.portafolio.com/", "devolverIdUsuario");
    private final static QName _DevolverIdUsuarioResponse_QNAME = new QName("http://service.portafolio.com/", "devolverIdUsuarioResponse");
    private final static QName _DevolverNivelUsuario_QNAME = new QName("http://service.portafolio.com/", "devolverNivelUsuario");
    private final static QName _DevolverNivelUsuarioResponse_QNAME = new QName("http://service.portafolio.com/", "devolverNivelUsuarioResponse");
    private final static QName _EliminarUsuario_QNAME = new QName("http://service.portafolio.com/", "eliminarUsuario");
    private final static QName _EliminarUsuarioResponse_QNAME = new QName("http://service.portafolio.com/", "eliminarUsuarioResponse");
    private final static QName _IngresarUsuario_QNAME = new QName("http://service.portafolio.com/", "ingresarUsuario");
    private final static QName _IngresarUsuarioResponse_QNAME = new QName("http://service.portafolio.com/", "ingresarUsuarioResponse");
    private final static QName _ListarInformacionCompletaDelUsuariosPorCorreoClave_QNAME = new QName("http://service.portafolio.com/", "listarInformacionCompletaDelUsuariosPorCorreoClave");
    private final static QName _ListarInformacionCompletaDelUsuariosPorCorreoClaveResponse_QNAME = new QName("http://service.portafolio.com/", "listarInformacionCompletaDelUsuariosPorCorreoClaveResponse");
    private final static QName _ListarInformacionCompletaDelUsuariosPorUsuarioClave_QNAME = new QName("http://service.portafolio.com/", "listarInformacionCompletaDelUsuariosPorUsuarioClave");
    private final static QName _ListarInformacionCompletaDelUsuariosPorUsuarioClaveResponse_QNAME = new QName("http://service.portafolio.com/", "listarInformacionCompletaDelUsuariosPorUsuarioClaveResponse");
    private final static QName _ListarInformacionCompletaTodosLosUsuarios_QNAME = new QName("http://service.portafolio.com/", "listarInformacionCompletaTodosLosUsuarios");
    private final static QName _ListarInformacionCompletaTodosLosUsuariosResponse_QNAME = new QName("http://service.portafolio.com/", "listarInformacionCompletaTodosLosUsuariosResponse");
    private final static QName _ListarUsuarios_QNAME = new QName("http://service.portafolio.com/", "listarUsuarios");
    private final static QName _ListarUsuariosPorNivel_QNAME = new QName("http://service.portafolio.com/", "listarUsuariosPorNivel");
    private final static QName _ListarUsuariosPorNivelResponse_QNAME = new QName("http://service.portafolio.com/", "listarUsuariosPorNivelResponse");
    private final static QName _ListarUsuariosPorRangoDePuntos_QNAME = new QName("http://service.portafolio.com/", "listarUsuariosPorRangoDePuntos");
    private final static QName _ListarUsuariosPorRangoDePuntosResponse_QNAME = new QName("http://service.portafolio.com/", "listarUsuariosPorRangoDePuntosResponse");
    private final static QName _ListarUsuariosResponse_QNAME = new QName("http://service.portafolio.com/", "listarUsuariosResponse");
    private final static QName _ModificarUsuario_QNAME = new QName("http://service.portafolio.com/", "modificarUsuario");
    private final static QName _ModificarUsuarioResponse_QNAME = new QName("http://service.portafolio.com/", "modificarUsuarioResponse");
    private final static QName _RetornarUltimoIDUsuario_QNAME = new QName("http://service.portafolio.com/", "retornarUltimoIDUsuario");
    private final static QName _RetornarUltimoIDUsuarioResponse_QNAME = new QName("http://service.portafolio.com/", "retornarUltimoIDUsuarioResponse");
    private final static QName _ValidarUsuarioPorNombreUsuarioUCorreo_QNAME = new QName("http://service.portafolio.com/", "validarUsuarioPorNombreUsuarioUCorreo");
    private final static QName _ValidarUsuarioPorNombreUsuarioUCorreoResponse_QNAME = new QName("http://service.portafolio.com/", "validarUsuarioPorNombreUsuarioUCorreoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.portafolio.servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComprobarNombreUsuario }
     * 
     */
    public ComprobarNombreUsuario createComprobarNombreUsuario() {
        return new ComprobarNombreUsuario();
    }

    /**
     * Create an instance of {@link ComprobarNombreUsuarioResponse }
     * 
     */
    public ComprobarNombreUsuarioResponse createComprobarNombreUsuarioResponse() {
        return new ComprobarNombreUsuarioResponse();
    }

    /**
     * Create an instance of {@link ComprobarsiExisteEmail }
     * 
     */
    public ComprobarsiExisteEmail createComprobarsiExisteEmail() {
        return new ComprobarsiExisteEmail();
    }

    /**
     * Create an instance of {@link ComprobarsiExisteEmailResponse }
     * 
     */
    public ComprobarsiExisteEmailResponse createComprobarsiExisteEmailResponse() {
        return new ComprobarsiExisteEmailResponse();
    }

    /**
     * Create an instance of {@link DevolverIdUsuario }
     * 
     */
    public DevolverIdUsuario createDevolverIdUsuario() {
        return new DevolverIdUsuario();
    }

    /**
     * Create an instance of {@link DevolverIdUsuarioResponse }
     * 
     */
    public DevolverIdUsuarioResponse createDevolverIdUsuarioResponse() {
        return new DevolverIdUsuarioResponse();
    }

    /**
     * Create an instance of {@link DevolverNivelUsuario }
     * 
     */
    public DevolverNivelUsuario createDevolverNivelUsuario() {
        return new DevolverNivelUsuario();
    }

    /**
     * Create an instance of {@link DevolverNivelUsuarioResponse }
     * 
     */
    public DevolverNivelUsuarioResponse createDevolverNivelUsuarioResponse() {
        return new DevolverNivelUsuarioResponse();
    }

    /**
     * Create an instance of {@link EliminarUsuario }
     * 
     */
    public EliminarUsuario createEliminarUsuario() {
        return new EliminarUsuario();
    }

    /**
     * Create an instance of {@link EliminarUsuarioResponse }
     * 
     */
    public EliminarUsuarioResponse createEliminarUsuarioResponse() {
        return new EliminarUsuarioResponse();
    }

    /**
     * Create an instance of {@link IngresarUsuario }
     * 
     */
    public IngresarUsuario createIngresarUsuario() {
        return new IngresarUsuario();
    }

    /**
     * Create an instance of {@link IngresarUsuarioResponse }
     * 
     */
    public IngresarUsuarioResponse createIngresarUsuarioResponse() {
        return new IngresarUsuarioResponse();
    }

    /**
     * Create an instance of {@link ListarInformacionCompletaDelUsuariosPorCorreoClave }
     * 
     */
    public ListarInformacionCompletaDelUsuariosPorCorreoClave createListarInformacionCompletaDelUsuariosPorCorreoClave() {
        return new ListarInformacionCompletaDelUsuariosPorCorreoClave();
    }

    /**
     * Create an instance of {@link ListarInformacionCompletaDelUsuariosPorCorreoClaveResponse }
     * 
     */
    public ListarInformacionCompletaDelUsuariosPorCorreoClaveResponse createListarInformacionCompletaDelUsuariosPorCorreoClaveResponse() {
        return new ListarInformacionCompletaDelUsuariosPorCorreoClaveResponse();
    }

    /**
     * Create an instance of {@link ListarInformacionCompletaDelUsuariosPorUsuarioClave }
     * 
     */
    public ListarInformacionCompletaDelUsuariosPorUsuarioClave createListarInformacionCompletaDelUsuariosPorUsuarioClave() {
        return new ListarInformacionCompletaDelUsuariosPorUsuarioClave();
    }

    /**
     * Create an instance of {@link ListarInformacionCompletaDelUsuariosPorUsuarioClaveResponse }
     * 
     */
    public ListarInformacionCompletaDelUsuariosPorUsuarioClaveResponse createListarInformacionCompletaDelUsuariosPorUsuarioClaveResponse() {
        return new ListarInformacionCompletaDelUsuariosPorUsuarioClaveResponse();
    }

    /**
     * Create an instance of {@link ListarInformacionCompletaTodosLosUsuarios }
     * 
     */
    public ListarInformacionCompletaTodosLosUsuarios createListarInformacionCompletaTodosLosUsuarios() {
        return new ListarInformacionCompletaTodosLosUsuarios();
    }

    /**
     * Create an instance of {@link ListarInformacionCompletaTodosLosUsuariosResponse }
     * 
     */
    public ListarInformacionCompletaTodosLosUsuariosResponse createListarInformacionCompletaTodosLosUsuariosResponse() {
        return new ListarInformacionCompletaTodosLosUsuariosResponse();
    }

    /**
     * Create an instance of {@link ListarUsuarios }
     * 
     */
    public ListarUsuarios createListarUsuarios() {
        return new ListarUsuarios();
    }

    /**
     * Create an instance of {@link ListarUsuariosPorNivel }
     * 
     */
    public ListarUsuariosPorNivel createListarUsuariosPorNivel() {
        return new ListarUsuariosPorNivel();
    }

    /**
     * Create an instance of {@link ListarUsuariosPorNivelResponse }
     * 
     */
    public ListarUsuariosPorNivelResponse createListarUsuariosPorNivelResponse() {
        return new ListarUsuariosPorNivelResponse();
    }

    /**
     * Create an instance of {@link ListarUsuariosPorRangoDePuntos }
     * 
     */
    public ListarUsuariosPorRangoDePuntos createListarUsuariosPorRangoDePuntos() {
        return new ListarUsuariosPorRangoDePuntos();
    }

    /**
     * Create an instance of {@link ListarUsuariosPorRangoDePuntosResponse }
     * 
     */
    public ListarUsuariosPorRangoDePuntosResponse createListarUsuariosPorRangoDePuntosResponse() {
        return new ListarUsuariosPorRangoDePuntosResponse();
    }

    /**
     * Create an instance of {@link ListarUsuariosResponse }
     * 
     */
    public ListarUsuariosResponse createListarUsuariosResponse() {
        return new ListarUsuariosResponse();
    }

    /**
     * Create an instance of {@link ModificarUsuario }
     * 
     */
    public ModificarUsuario createModificarUsuario() {
        return new ModificarUsuario();
    }

    /**
     * Create an instance of {@link ModificarUsuarioResponse }
     * 
     */
    public ModificarUsuarioResponse createModificarUsuarioResponse() {
        return new ModificarUsuarioResponse();
    }

    /**
     * Create an instance of {@link RetornarUltimoIDUsuario }
     * 
     */
    public RetornarUltimoIDUsuario createRetornarUltimoIDUsuario() {
        return new RetornarUltimoIDUsuario();
    }

    /**
     * Create an instance of {@link RetornarUltimoIDUsuarioResponse }
     * 
     */
    public RetornarUltimoIDUsuarioResponse createRetornarUltimoIDUsuarioResponse() {
        return new RetornarUltimoIDUsuarioResponse();
    }

    /**
     * Create an instance of {@link ValidarUsuarioPorNombreUsuarioUCorreo }
     * 
     */
    public ValidarUsuarioPorNombreUsuarioUCorreo createValidarUsuarioPorNombreUsuarioUCorreo() {
        return new ValidarUsuarioPorNombreUsuarioUCorreo();
    }

    /**
     * Create an instance of {@link ValidarUsuarioPorNombreUsuarioUCorreoResponse }
     * 
     */
    public ValidarUsuarioPorNombreUsuarioUCorreoResponse createValidarUsuarioPorNombreUsuarioUCorreoResponse() {
        return new ValidarUsuarioPorNombreUsuarioUCorreoResponse();
    }

    /**
     * Create an instance of {@link PersonaUsuario }
     * 
     */
    public PersonaUsuario createPersonaUsuario() {
        return new PersonaUsuario();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobarNombreUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "comprobarNombreUsuario")
    public JAXBElement<ComprobarNombreUsuario> createComprobarNombreUsuario(ComprobarNombreUsuario value) {
        return new JAXBElement<ComprobarNombreUsuario>(_ComprobarNombreUsuario_QNAME, ComprobarNombreUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobarNombreUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "comprobarNombreUsuarioResponse")
    public JAXBElement<ComprobarNombreUsuarioResponse> createComprobarNombreUsuarioResponse(ComprobarNombreUsuarioResponse value) {
        return new JAXBElement<ComprobarNombreUsuarioResponse>(_ComprobarNombreUsuarioResponse_QNAME, ComprobarNombreUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobarsiExisteEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "comprobarsiExisteEmail")
    public JAXBElement<ComprobarsiExisteEmail> createComprobarsiExisteEmail(ComprobarsiExisteEmail value) {
        return new JAXBElement<ComprobarsiExisteEmail>(_ComprobarsiExisteEmail_QNAME, ComprobarsiExisteEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobarsiExisteEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "comprobarsiExisteEmailResponse")
    public JAXBElement<ComprobarsiExisteEmailResponse> createComprobarsiExisteEmailResponse(ComprobarsiExisteEmailResponse value) {
        return new JAXBElement<ComprobarsiExisteEmailResponse>(_ComprobarsiExisteEmailResponse_QNAME, ComprobarsiExisteEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevolverIdUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "devolverIdUsuario")
    public JAXBElement<DevolverIdUsuario> createDevolverIdUsuario(DevolverIdUsuario value) {
        return new JAXBElement<DevolverIdUsuario>(_DevolverIdUsuario_QNAME, DevolverIdUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevolverIdUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "devolverIdUsuarioResponse")
    public JAXBElement<DevolverIdUsuarioResponse> createDevolverIdUsuarioResponse(DevolverIdUsuarioResponse value) {
        return new JAXBElement<DevolverIdUsuarioResponse>(_DevolverIdUsuarioResponse_QNAME, DevolverIdUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevolverNivelUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "devolverNivelUsuario")
    public JAXBElement<DevolverNivelUsuario> createDevolverNivelUsuario(DevolverNivelUsuario value) {
        return new JAXBElement<DevolverNivelUsuario>(_DevolverNivelUsuario_QNAME, DevolverNivelUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevolverNivelUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "devolverNivelUsuarioResponse")
    public JAXBElement<DevolverNivelUsuarioResponse> createDevolverNivelUsuarioResponse(DevolverNivelUsuarioResponse value) {
        return new JAXBElement<DevolverNivelUsuarioResponse>(_DevolverNivelUsuarioResponse_QNAME, DevolverNivelUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "eliminarUsuario")
    public JAXBElement<EliminarUsuario> createEliminarUsuario(EliminarUsuario value) {
        return new JAXBElement<EliminarUsuario>(_EliminarUsuario_QNAME, EliminarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "eliminarUsuarioResponse")
    public JAXBElement<EliminarUsuarioResponse> createEliminarUsuarioResponse(EliminarUsuarioResponse value) {
        return new JAXBElement<EliminarUsuarioResponse>(_EliminarUsuarioResponse_QNAME, EliminarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "ingresarUsuario")
    public JAXBElement<IngresarUsuario> createIngresarUsuario(IngresarUsuario value) {
        return new JAXBElement<IngresarUsuario>(_IngresarUsuario_QNAME, IngresarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "ingresarUsuarioResponse")
    public JAXBElement<IngresarUsuarioResponse> createIngresarUsuarioResponse(IngresarUsuarioResponse value) {
        return new JAXBElement<IngresarUsuarioResponse>(_IngresarUsuarioResponse_QNAME, IngresarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarInformacionCompletaDelUsuariosPorCorreoClave }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "listarInformacionCompletaDelUsuariosPorCorreoClave")
    public JAXBElement<ListarInformacionCompletaDelUsuariosPorCorreoClave> createListarInformacionCompletaDelUsuariosPorCorreoClave(ListarInformacionCompletaDelUsuariosPorCorreoClave value) {
        return new JAXBElement<ListarInformacionCompletaDelUsuariosPorCorreoClave>(_ListarInformacionCompletaDelUsuariosPorCorreoClave_QNAME, ListarInformacionCompletaDelUsuariosPorCorreoClave.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarInformacionCompletaDelUsuariosPorCorreoClaveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "listarInformacionCompletaDelUsuariosPorCorreoClaveResponse")
    public JAXBElement<ListarInformacionCompletaDelUsuariosPorCorreoClaveResponse> createListarInformacionCompletaDelUsuariosPorCorreoClaveResponse(ListarInformacionCompletaDelUsuariosPorCorreoClaveResponse value) {
        return new JAXBElement<ListarInformacionCompletaDelUsuariosPorCorreoClaveResponse>(_ListarInformacionCompletaDelUsuariosPorCorreoClaveResponse_QNAME, ListarInformacionCompletaDelUsuariosPorCorreoClaveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarInformacionCompletaDelUsuariosPorUsuarioClave }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "listarInformacionCompletaDelUsuariosPorUsuarioClave")
    public JAXBElement<ListarInformacionCompletaDelUsuariosPorUsuarioClave> createListarInformacionCompletaDelUsuariosPorUsuarioClave(ListarInformacionCompletaDelUsuariosPorUsuarioClave value) {
        return new JAXBElement<ListarInformacionCompletaDelUsuariosPorUsuarioClave>(_ListarInformacionCompletaDelUsuariosPorUsuarioClave_QNAME, ListarInformacionCompletaDelUsuariosPorUsuarioClave.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarInformacionCompletaDelUsuariosPorUsuarioClaveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "listarInformacionCompletaDelUsuariosPorUsuarioClaveResponse")
    public JAXBElement<ListarInformacionCompletaDelUsuariosPorUsuarioClaveResponse> createListarInformacionCompletaDelUsuariosPorUsuarioClaveResponse(ListarInformacionCompletaDelUsuariosPorUsuarioClaveResponse value) {
        return new JAXBElement<ListarInformacionCompletaDelUsuariosPorUsuarioClaveResponse>(_ListarInformacionCompletaDelUsuariosPorUsuarioClaveResponse_QNAME, ListarInformacionCompletaDelUsuariosPorUsuarioClaveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarInformacionCompletaTodosLosUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "listarInformacionCompletaTodosLosUsuarios")
    public JAXBElement<ListarInformacionCompletaTodosLosUsuarios> createListarInformacionCompletaTodosLosUsuarios(ListarInformacionCompletaTodosLosUsuarios value) {
        return new JAXBElement<ListarInformacionCompletaTodosLosUsuarios>(_ListarInformacionCompletaTodosLosUsuarios_QNAME, ListarInformacionCompletaTodosLosUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarInformacionCompletaTodosLosUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "listarInformacionCompletaTodosLosUsuariosResponse")
    public JAXBElement<ListarInformacionCompletaTodosLosUsuariosResponse> createListarInformacionCompletaTodosLosUsuariosResponse(ListarInformacionCompletaTodosLosUsuariosResponse value) {
        return new JAXBElement<ListarInformacionCompletaTodosLosUsuariosResponse>(_ListarInformacionCompletaTodosLosUsuariosResponse_QNAME, ListarInformacionCompletaTodosLosUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "listarUsuarios")
    public JAXBElement<ListarUsuarios> createListarUsuarios(ListarUsuarios value) {
        return new JAXBElement<ListarUsuarios>(_ListarUsuarios_QNAME, ListarUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuariosPorNivel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "listarUsuariosPorNivel")
    public JAXBElement<ListarUsuariosPorNivel> createListarUsuariosPorNivel(ListarUsuariosPorNivel value) {
        return new JAXBElement<ListarUsuariosPorNivel>(_ListarUsuariosPorNivel_QNAME, ListarUsuariosPorNivel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuariosPorNivelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "listarUsuariosPorNivelResponse")
    public JAXBElement<ListarUsuariosPorNivelResponse> createListarUsuariosPorNivelResponse(ListarUsuariosPorNivelResponse value) {
        return new JAXBElement<ListarUsuariosPorNivelResponse>(_ListarUsuariosPorNivelResponse_QNAME, ListarUsuariosPorNivelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuariosPorRangoDePuntos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "listarUsuariosPorRangoDePuntos")
    public JAXBElement<ListarUsuariosPorRangoDePuntos> createListarUsuariosPorRangoDePuntos(ListarUsuariosPorRangoDePuntos value) {
        return new JAXBElement<ListarUsuariosPorRangoDePuntos>(_ListarUsuariosPorRangoDePuntos_QNAME, ListarUsuariosPorRangoDePuntos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuariosPorRangoDePuntosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "listarUsuariosPorRangoDePuntosResponse")
    public JAXBElement<ListarUsuariosPorRangoDePuntosResponse> createListarUsuariosPorRangoDePuntosResponse(ListarUsuariosPorRangoDePuntosResponse value) {
        return new JAXBElement<ListarUsuariosPorRangoDePuntosResponse>(_ListarUsuariosPorRangoDePuntosResponse_QNAME, ListarUsuariosPorRangoDePuntosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "listarUsuariosResponse")
    public JAXBElement<ListarUsuariosResponse> createListarUsuariosResponse(ListarUsuariosResponse value) {
        return new JAXBElement<ListarUsuariosResponse>(_ListarUsuariosResponse_QNAME, ListarUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "modificarUsuario")
    public JAXBElement<ModificarUsuario> createModificarUsuario(ModificarUsuario value) {
        return new JAXBElement<ModificarUsuario>(_ModificarUsuario_QNAME, ModificarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "modificarUsuarioResponse")
    public JAXBElement<ModificarUsuarioResponse> createModificarUsuarioResponse(ModificarUsuarioResponse value) {
        return new JAXBElement<ModificarUsuarioResponse>(_ModificarUsuarioResponse_QNAME, ModificarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornarUltimoIDUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "retornarUltimoIDUsuario")
    public JAXBElement<RetornarUltimoIDUsuario> createRetornarUltimoIDUsuario(RetornarUltimoIDUsuario value) {
        return new JAXBElement<RetornarUltimoIDUsuario>(_RetornarUltimoIDUsuario_QNAME, RetornarUltimoIDUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornarUltimoIDUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "retornarUltimoIDUsuarioResponse")
    public JAXBElement<RetornarUltimoIDUsuarioResponse> createRetornarUltimoIDUsuarioResponse(RetornarUltimoIDUsuarioResponse value) {
        return new JAXBElement<RetornarUltimoIDUsuarioResponse>(_RetornarUltimoIDUsuarioResponse_QNAME, RetornarUltimoIDUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarUsuarioPorNombreUsuarioUCorreo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "validarUsuarioPorNombreUsuarioUCorreo")
    public JAXBElement<ValidarUsuarioPorNombreUsuarioUCorreo> createValidarUsuarioPorNombreUsuarioUCorreo(ValidarUsuarioPorNombreUsuarioUCorreo value) {
        return new JAXBElement<ValidarUsuarioPorNombreUsuarioUCorreo>(_ValidarUsuarioPorNombreUsuarioUCorreo_QNAME, ValidarUsuarioPorNombreUsuarioUCorreo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarUsuarioPorNombreUsuarioUCorreoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portafolio.com/", name = "validarUsuarioPorNombreUsuarioUCorreoResponse")
    public JAXBElement<ValidarUsuarioPorNombreUsuarioUCorreoResponse> createValidarUsuarioPorNombreUsuarioUCorreoResponse(ValidarUsuarioPorNombreUsuarioUCorreoResponse value) {
        return new JAXBElement<ValidarUsuarioPorNombreUsuarioUCorreoResponse>(_ValidarUsuarioPorNombreUsuarioUCorreoResponse_QNAME, ValidarUsuarioPorNombreUsuarioUCorreoResponse.class, null, value);
    }

}
