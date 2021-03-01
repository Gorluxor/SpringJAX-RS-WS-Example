package com.spring.soap.ws.style.doc.wrap;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2020-12-26T07:28:56.719+01:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "HelloDocWrappedService", 
                  wsdlLocation = "classpath:wsdl/HelloDocWrapped.wsdl",
                  targetNamespace = "http://soap.spring.com/ws/style/doc/wrap") 
public class HelloDocWrappedService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soap.spring.com/ws/style/doc/wrap", "HelloDocWrappedService");
    public final static QName HelloDocWrappedPort = new QName("http://soap.spring.com/ws/style/doc/wrap", "HelloDocWrappedPort");
    static {
        URL url = HelloDocWrappedService.class.getClassLoader().getResource("wsdl/HelloDocWrapped.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(HelloDocWrappedService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/HelloDocWrapped.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public HelloDocWrappedService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloDocWrappedService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloDocWrappedService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public HelloDocWrappedService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HelloDocWrappedService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HelloDocWrappedService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns HelloDocWrapped
     */
    @WebEndpoint(name = "HelloDocWrappedPort")
    public HelloDocWrapped getHelloDocWrappedPort() {
        return super.getPort(HelloDocWrappedPort, HelloDocWrapped.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloDocWrapped
     */
    @WebEndpoint(name = "HelloDocWrappedPort")
    public HelloDocWrapped getHelloDocWrappedPort(WebServiceFeature... features) {
        return super.getPort(HelloDocWrappedPort, HelloDocWrapped.class, features);
    }

}