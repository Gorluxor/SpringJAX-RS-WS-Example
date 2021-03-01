package com.spring.soap.ws.style.doc.bare;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2020-12-26T04:55:32.425+01:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "HelloDocBareService", 
                  wsdlLocation = "classpath:wsdl/HelloDocBare.wsdl",
                  targetNamespace = "http://soap.spring.com/ws/style/doc/bare") 
public class HelloDocBareService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soap.spring.com/ws/style/doc/bare", "HelloDocBareService");
    public final static QName HelloDocBarePort = new QName("http://soap.spring.com/ws/style/doc/bare", "HelloDocBarePort");
    static {
        URL url = HelloDocBareService.class.getResource("wsdl/HelloDocBare.wsdl");
        if (url == null) {
            url = HelloDocBareService.class.getClassLoader().getResource("wsdl/HelloDocBare.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(HelloDocBareService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "wsdl/HelloDocBare.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public HelloDocBareService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloDocBareService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloDocBareService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public HelloDocBareService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HelloDocBareService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HelloDocBareService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns HelloDocBare
     */
    @WebEndpoint(name = "HelloDocBarePort")
    public HelloDocBare getHelloDocBarePort() {
        return super.getPort(HelloDocBarePort, HelloDocBare.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloDocBare
     */
    @WebEndpoint(name = "HelloDocBarePort")
    public HelloDocBare getHelloDocBarePort(WebServiceFeature... features) {
        return super.getPort(HelloDocBarePort, HelloDocBare.class, features);
    }

}