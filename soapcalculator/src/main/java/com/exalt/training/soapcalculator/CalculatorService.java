package com.exalt.training.soapcalculator;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

/**
 * This interface defines a SOAP web service for basic arithmetic operations.
 * It includes methods for addition, subtraction, multiplication, and division.
 * Each method is exposed as a web service operation.
 */
@WebService
public interface CalculatorService {

    /**
     * Adds two integers and returns the result.
     * This method is exposed as a SOAP web service operation.
     * @param a The first integer to be added.
     * @param b The second integer to be added.
     * @return The sum of the two integers.
     */
    @WebMethod
    int add(int a, int b);

    /**
     * Subtracts the second integer from the first and returns the result.
     * This method is exposed as a SOAP web service operation.
     * @param a The integer to subtract from.
     * @param b The integer to be subtracted.
     * @return The difference between the two integers.
     */
    @WebMethod
    int subtract(int a, int b);

    /**
     * Multiplies two integers and returns the result.
     * This method is exposed as a SOAP web service operation.
     * @param a The first integer to be multiplied.
     * @param b The second integer to be multiplied.
     * @return The product of the two integers.
     */
    @WebMethod
    int multiply(int a, int b);

    /**
     * Divides the first integer by the second and returns the result.
     * This method is exposed as a SOAP web service operation.
     * @param a The dividend.
     * @param b The divisor.
     * @return The quotient of the two integers as a float.
     * @throws IllegalArgumentException if the divisor (b) is zero.
     */
    @WebMethod
    float divide(int a, int b);
}
