
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.spring.soap.ws.hello;

import java.util.logging.Logger;

import javax.jws.WebService;
import javax.xml.bind.JAXBElement;

import com.spring.soap.ws.hello.types.ObjectFactory;
import com.spring.soap.ws.hello.types.RequestMissType;

/**
 * This class was generated by Apache CXF 2.1.3 Fri Jan 23 09:13:16 CET 2009
 * Generated source version: 2.1.3
 * 
 */

@WebService(serviceName = "HelloDocumentService",
			portName = "HelloDocumentPort",
			targetNamespace = "http://soap.spring.com/ws/hello",
			endpointInterface = "com.spring.soap.ws.hello.HelloDocument")
public class HelloDocumentImpl implements HelloDocument {

	private static final Logger LOG = Logger.getLogger(HelloDocumentImpl.class.getName());

	
	public java.lang.String sayHelloMiss(RequestMissType requestMiss) {
		LOG.info("Executing operation sayHelloMiss");
		System.out.println(requestMiss);
		
		ObjectFactory helloFactory = new ObjectFactory();
		JAXBElement<String> response = helloFactory.createResponseMiss("Hello miss" + requestMiss.getFirstName() + " " + requestMiss.getLastName());
		return response.getValue();
	}

}
