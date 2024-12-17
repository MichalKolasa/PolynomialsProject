/**
 * Interface of polynomials operations.
 */
public interface PolynomialsOperations {
    /**
     * Adds two polynomials and returns the resulting polynomial
     * @param polynomial1 The first polynomial
     * @param polynomial2 The second polynomial
     * @return A new polynomial representing the sum of polynomial1 and polynomial2.
     */
    Polynomial addition(Polynomial polynomial1, Polynomial polynomial2);

    /**
     * Subtracts the second polynomial from the first and returns the resulting polynomial.
     * @param polynomial1 The first polynomial.
     * @param polynomial2 The second polynomial.
     * @return A new polynomial representing the difference polynomial1 - polynomial2.
     */
    Polynomial subtraction(Polynomial polynomial1, Polynomial polynomial2);

    /**
     * Multiplies two polynomials and returns the resulting polynomial.
     * @param polynomial1 The first polynomial.
     * @param polynomial2 The second polynomial.
     * @return A new polynomial representing the product of polynomial1 and polynomial2.
     */
    Polynomial multiplication(Polynomial polynomial1, Polynomial polynomial2);

    /**
     * Evaluates a polynomial at a given point using Horner's Algorithm.
     * @param polynomial The polynomial to evaluate.
     * @param x The point at which to evaluate the polynomial.
     * @return The value of the polynomial at x.
     */
    double HornerAlgorithm(Polynomial polynomial, double x);

    /**
     * Prints a polynomial in human-readable format.
     * @param polynomial The polynomial to print.
     */
    void printPolynomial(Polynomial polynomial);
}
