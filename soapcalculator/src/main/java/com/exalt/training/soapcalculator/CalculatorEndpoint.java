package com.exalt.training.soapcalculator;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.exalt.training.soapcalculator.jaxb.*;

/**
 * This class is a SOAP web service endpoint that handles requests for basic arithmetic operations.
 * It defines methods for addition, subtraction, multiplication, and division,
 * and maps these methods to corresponding SOAP requests.
 */
@Endpoint
public class CalculatorEndpoint {

    // The namespace URI for the SOAP web service, used to uniquely identify the service.
    private static final String NAMESPACE_URI = "http://www.exalt.training.com/calculator/";

    // A reference to the CalculatorService, which provides the business logic for arithmetic operations.
    private final CalculatorService calculatorService;

    /**
     * Constructor that initializes the CalculatorEndpoint with a CalculatorService.
     * @param calculatorService The service that performs the actual arithmetic operations.
     */
    public CalculatorEndpoint(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    /**
     * Handles SOAP requests for addition.
     * Maps the incoming request to the add method of CalculatorService and returns the result.
     * @param request The SOAP request containing two integers (a and b) to be added.
     * @return A SOAP response containing the result of the addition.
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddRequest")
    @ResponsePayload
    public AddResponse add(@RequestPayload AddRequest request) {
        int result = calculatorService.add(request.getA(), request.getB());
        AddResponse response = new AddResponse();
        response.setResult(result);
        return response;
    }

    /**
     * Handles SOAP requests for subtraction.
     * Maps the incoming request to the subtract method of CalculatorService and returns the result.
     * @param request The SOAP request containing two integers (a and b) to be subtracted.
     * @return A SOAP response containing the result of the subtraction.
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SubtractRequest")
    @ResponsePayload
    public SubtractResponse subtract(@RequestPayload SubtractRequest request) {
        int result = calculatorService.subtract(request.getA(), request.getB());
        SubtractResponse response = new SubtractResponse();
        response.setResult(result);
        return response;
    }

    /**
     * Handles SOAP requests for multiplication.
     * Maps the incoming request to the multiply method of CalculatorService and returns the result.
     * @param request The SOAP request containing two integers (a and b) to be multiplied.
     * @return A SOAP response containing the result of the multiplication.
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "MultiplyRequest")
    @ResponsePayload
    public MultiplyResponse multiply(@RequestPayload MultiplyRequest request) {
        int result = calculatorService.multiply(request.getA(), request.getB());
        MultiplyResponse response = new MultiplyResponse();
        response.setResult(result);
        return response;
    }

    /**
     * Handles SOAP requests for division.
     * Maps the incoming request to the divide method of CalculatorService and returns the result.
     * @param request The SOAP request containing two integers (a and b), where a is divided by b.
     * @return A SOAP response containing the result of the division.
     * @throws IllegalArgumentException if the divisor (b) is zero.
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DivideRequest")
    @ResponsePayload
    public DivideResponse divide(@RequestPayload DivideRequest request) {
        float result = calculatorService.divide(request.getA(), request.getB());
        DivideResponse response = new DivideResponse();
        response.setResult(result);
        return response;
    }
}
