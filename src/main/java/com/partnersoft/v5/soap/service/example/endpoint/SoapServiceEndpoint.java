package com.partnersoft.v5.soap.service.example.endpoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import com.partnersoft.v5.soap.service.example.multispeak.model.ArrayOfStringWrapper;
import com.partnersoft.v5.soap.service.example.multispeak.model.GetMethods;
import com.partnersoft.v5.soap.service.example.multispeak.model.GetMethodsResponse;
import com.partnersoft.v5.soap.service.example.multispeak.model.MultiSpeakMsgHeader;
import com.partnersoft.v5.soap.service.example.multispeak.model.ObjectFactory;
import com.partnersoft.v5.soap.service.example.multispeak.model.PingURL;
import com.partnersoft.v5.soap.service.example.multispeak.model.PingURLResponse;
import com.partnersoft.v5.soap.service.example.multispeak.model.StakedWorkOrderNotification;
import com.partnersoft.v5.soap.service.example.multispeak.model.StakedWorkOrderNotificationResponse;


/**
 * EndPoint for Soap services.
 * @author Lane Chasteen
 */
@Endpoint
public class SoapServiceEndpoint {
	//-- logging --//
	private static final Logger log = LoggerFactory.getLogger(SoapServiceEndpoint.class);

	//-- properties --//
	private static final String NAMESPACE_URI = "http://www.multispeak.org/Version_3.0";

	/**
	 * {@link List} of methods that are supported by this service.
	 * <br><br>
	 * Add any end point methods to this list.
	 * <br><br>
	 * Used by the {@link GetMethods} end point.
	 */
	private static final List<String> METHODS_LIST;

	static {
		List<String> tempMethodsList = new ArrayList<>();
		tempMethodsList.add("PingURL");
		tempMethodsList.add("GetMethods");
		// TODO add additional supported methods.
		METHODS_LIST = Collections.unmodifiableList(tempMethodsList);
	}

	//-- constructors --//
	/**
	 * Returns a {@link PingURLResponse} object for the GetMethods end point.
	 * @param methods - {@link PingURL} request object.
	 * @return {@link PingURLResponse} object for the GetMethods end point.
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "PingURL")
	@ResponsePayload
	public PingURLResponse pingURL(@RequestPayload PingURL methods) {

		log.info("... server pingURL() request received.");
		ObjectFactory factory = new ObjectFactory();
		PingURLResponse response = factory.createPingURLResponse();
		return response;
	}

	/**
	 * Returns a {@link GetMethodsResponse} object for the GetMethods end point.
	 * @param methods - {@link GetMethods} request object.
	 * @param messageContext - {@link org.springframework.ws.context.MessageContext} for
	 * the header response. 
	 * @return {@link GetMethodsResponse} object for the GetMethods end point.
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetMethods")
	@ResponsePayload
	public GetMethodsResponse getMethods(
			@RequestPayload GetMethods methods,  
			org.springframework.ws.context.MessageContext messageContext) {

		log.info("... server getMethods() request received.");
		GetMethodsResponse response = new GetMethodsResponse();

		try {
			setHeader(messageContext);
		}
		catch (Exception e) {
			log.error("Error creating SOAP response header!", e);
			return response;
		}

		List<String> methodList = new ArrayList<>(getSupportedMethodsList());
		ArrayOfStringWrapper value = new ArrayOfStringWrapper(methodList);
		response.setGetMethodsResult(value.getValue());
		return response;
	}

	/**
	 * Returns a {@link GetMethodsResponse} object for the GetMethods end point.
	 * @param methods - {@link GetMethods} request object.
	 * @param messageContext - {@link org.springframework.ws.context.MessageContext} for
	 * the header response. 
	 * @return {@link GetMethodsResponse} object for the GetMethods end point.
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "StakedWorkOrderNotification")
	@ResponsePayload
	public StakedWorkOrderNotificationResponse setStakedWorkOrderNotification(
			@RequestPayload StakedWorkOrderNotification swan,  
			org.springframework.ws.context.MessageContext messageContext) {
		
		StakedWorkOrderNotificationResponse response = new StakedWorkOrderNotificationResponse();
		
		try {
			setHeader(messageContext);
		}
		catch (Exception e) {
			log.error("Error creating SOAP response header!", e);
			return response;
		}
		return response;

	}

	/**
	 * Returns a list of all supported methods.
	 * @return {@link List} of all supported methods.
	 */
	public static List<String> getSupportedMethodsList() {
		return METHODS_LIST;
	}

	/**
	 * Helper method to sets the {@link MultiSpeakMsgHeader} by reference for the response.
	 * @param messageContext - {@link MessageContext} for the response header.
	 * @throws JAXBException if there is a problem setting the header.
	 */
	private void setHeader(MessageContext messageContext) throws JAXBException {

		MultiSpeakMsgHeader responseMsg = getConfiguredMsgHeader(null);
		SaajSoapMessage soapResponse = (SaajSoapMessage) messageContext
				.getResponse();

		org.springframework.ws.soap.SoapHeader respheader = 
				soapResponse.getSoapHeader();

		JAXBContext context = JAXBContext.newInstance("com.partnersoft.v5.soap.service.example.multispeak.model");
		ObjectFactory objectFactory = new ObjectFactory();
		JAXBElement<MultiSpeakMsgHeader> je = objectFactory.createMultiSpeakMsgHeader(responseMsg);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(je, respheader.getResult());
	}

	/**
	 * Configures and returns {@link MultiSpeakMsgHeader}
	 * @param lastSent - String to set in headers last sent value. Ignored if {@code null}
	 * @return {@link MultiSpeakMsgHeader}
	 */
	private MultiSpeakMsgHeader getConfiguredMsgHeader(String lastSent) {
		MultiSpeakMsgHeader header = new MultiSpeakMsgHeader();
		// TODO reasonable defaults for required elements
		header.setVersion("3.0");
		header.setAppVersion("3.0");
		String companyName ="Partner";
		// TODO split company/app
		header.setAppName(companyName);
		header.setCompany(companyName);
		header.setUserID("user");
		header.setPwd("password");
		if (lastSent != null) {
			header.setLastSent(lastSent);
		}
		return header;
	}
}
