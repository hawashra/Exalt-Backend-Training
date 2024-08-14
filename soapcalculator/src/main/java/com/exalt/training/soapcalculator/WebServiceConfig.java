package com.exalt.training.soapcalculator;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.core.io.ClassPathResource;

/**
 * This configuration class sets up the SOAP web service in the Spring Boot application.
 * It is annotated with @EnableWs to enable SOAP web services and @Configuration to mark it as a
 * source of bean definitions for the application context.
 */
@EnableWs
@Configuration
public class WebServiceConfig {

    /**
     * Registers the MessageDispatcherServlet, which is the central dispatcher for
     * handling SOAP messages. It processes incoming requests and routes them to the
     * appropriate endpoint.
     *
     * @param applicationContext The Spring application context.
     * @return A ServletRegistrationBean that registers the MessageDispatcherServlet
     *         at the "/ws/*" URL pattern.
     */
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    /**
     * Defines the WSDL file for the SOAP web service. This bean configures the WSDL generation
     * based on the provided XSD schema.
     *
     * @param calculatorSchema The XSD schema that defines the structure of the SOAP messages.
     * @return A DefaultWsdl11Definition bean that sets up the WSDL for the "calculator" service.
     */
    @Bean(name = "calculator")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema calculatorSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CalculatorPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.exalt.training.com/calculator");
        wsdl11Definition.setSchema(calculatorSchema);
        return wsdl11Definition;
    }

    /**
     * Loads and returns the XSD schema that defines the structure of the SOAP messages
     * for the calculator service.
     *
     * @return An XsdSchema bean that loads the "calculator.xsd" file from the classpath.
     */
    @Bean
    public XsdSchema calculatorSchema() {
        return new SimpleXsdSchema(new ClassPathResource("calculator.xsd"));
    }
}
