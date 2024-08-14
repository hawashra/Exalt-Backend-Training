package com.exalt.training.soapcalculator;

import org.springframework.stereotype.Service;

/**
 * This class implements the CalculatorService interface and provides
 * the business logic for basic arithmetic operations: addition, subtraction,
 * multiplication, and division.
 *
 * It is annotated with @Service, making it a Spring-managed bean.
 */
@Service
public class CalculatorServiceImpl implements CalculatorService {

    /**
     * Adds two integers and returns the result.
     * @param a The first integer to be added.
     * @param b The second integer to be added.
     * @return The sum of the two integers.
     */
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first and returns the result.
     * @param a The integer to subtract from.
     * @param b The integer to be subtracted.
     * @return The difference between the two integers.
     */
    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers and returns the result.
     * @param a The first integer to be multiplied.
     * @param b The second integer to be multiplied.
     * @return The product of the two integers.
     */
    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second and returns the result.
     * If the divisor is zero, throws an IllegalArgumentException.
     * @param a The dividend.
     * @param b The divisor.
     * @return The quotient of the two integers as a float.
     * @throws IllegalArgumentException if the divisor (b) is zero.
     */
    @Override
    public float divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (float) a / b;
    }
}
