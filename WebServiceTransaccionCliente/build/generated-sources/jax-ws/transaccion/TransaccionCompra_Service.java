
package transaccion;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TransaccionCompra", targetNamespace = "http://Transaccion/", wsdlLocation = "http://localhost:8080/WebServiceTransaccion/TransaccionCompra?wsdl")
public class TransaccionCompra_Service
    extends Service
{

    private final static URL TRANSACCIONCOMPRA_WSDL_LOCATION;
    private final static WebServiceException TRANSACCIONCOMPRA_EXCEPTION;
    private final static QName TRANSACCIONCOMPRA_QNAME = new QName("http://Transaccion/", "TransaccionCompra");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WebServiceTransaccion/TransaccionCompra?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRANSACCIONCOMPRA_WSDL_LOCATION = url;
        TRANSACCIONCOMPRA_EXCEPTION = e;
    }

    public TransaccionCompra_Service() {
        super(__getWsdlLocation(), TRANSACCIONCOMPRA_QNAME);
    }

    public TransaccionCompra_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRANSACCIONCOMPRA_QNAME, features);
    }

    public TransaccionCompra_Service(URL wsdlLocation) {
        super(wsdlLocation, TRANSACCIONCOMPRA_QNAME);
    }

    public TransaccionCompra_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRANSACCIONCOMPRA_QNAME, features);
    }

    public TransaccionCompra_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TransaccionCompra_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TransaccionCompra
     */
    @WebEndpoint(name = "TransaccionCompraPort")
    public TransaccionCompra getTransaccionCompraPort() {
        return super.getPort(new QName("http://Transaccion/", "TransaccionCompraPort"), TransaccionCompra.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TransaccionCompra
     */
    @WebEndpoint(name = "TransaccionCompraPort")
    public TransaccionCompra getTransaccionCompraPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Transaccion/", "TransaccionCompraPort"), TransaccionCompra.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRANSACCIONCOMPRA_EXCEPTION!= null) {
            throw TRANSACCIONCOMPRA_EXCEPTION;
        }
        return TRANSACCIONCOMPRA_WSDL_LOCATION;
    }

}
