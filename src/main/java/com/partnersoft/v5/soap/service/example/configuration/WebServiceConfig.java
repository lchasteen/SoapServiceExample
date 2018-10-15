package com.partnersoft.v5.soap.service.example.configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;

/**
 * {@link WsConfigurerAdapter} as the soap service configuration.
 * <br><br>
 * @author Lane Chasteen
 */
@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	//-- properties --//
	//-- constructors --//
	/**
	 * Returns the {@link ServletRegistrationBean} for the {@link MessageDispatcherServlet} from the {@link ApplicationContext}.
	 * @param applicationContext - {@link ApplicationContext}.
	 * @return {@link ServletRegistrationBean} for the {@link MessageDispatcherServlet} from the {@link ApplicationContext}.
	 */
	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<MessageDispatcherServlet>(servlet, "/ws/*");
	}

	/**
	 * Returns the {@link Wsdl11Definition} from the classpath resource.
	 * @return {@link Wsdl11Definition} from the classpath resource.
	 */
	@Bean(name = "FA_Server")
	public Wsdl11Definition defaultWsdl11Definition() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition.setWsdl(new ClassPathResource("FA_Server.wsdl"));
		
		return wsdl11Definition;
	}
}