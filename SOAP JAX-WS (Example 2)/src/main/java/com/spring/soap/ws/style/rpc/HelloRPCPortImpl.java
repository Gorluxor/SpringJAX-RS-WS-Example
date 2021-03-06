
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.spring.soap.ws.style.rpc;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2020-12-26T04:55:32.776+01:00
 * Generated source version: 3.2.1
 * 
 */

@javax.jws.WebService(
                      serviceName = "HelloRPCService",
                      portName = "HelloRPCPort",
                      targetNamespace = "http://soap.spring.com/ws/style/rpc",
                      wsdlLocation = "classpath:wsdl/HelloRPC.wsdl",
                      endpointInterface = "com.spring.soap.ws.style.rpc.HelloRPC")
                      
public class HelloRPCPortImpl implements HelloRPC {

    private static final Logger LOG = Logger.getLogger(HelloRPCPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.spring.soap.ws.style.rpc.HelloRPC#sayHelloSeparated(java.lang.String firstName, java.lang.String lastName)*
     */
    public java.lang.String sayHelloSeparated(java.lang.String firstName, java.lang.String lastName) { 
        LOG.info("Executing operation sayHelloSeparated");
        System.out.println(firstName);
        System.out.println(lastName);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.spring.soap.ws.style.rpc.HelloRPC#sayHello(com.spring.soap.ws.style.rpc.Person person)*
     */
    public java.lang.String sayHello(Person person) { 
        LOG.info("Executing operation sayHello");
        System.out.println(person);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
