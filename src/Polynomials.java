/**
 * Class implementing basic operations on polynomials using boards. Each operation has O(n) time complexity,
 * where n is the max degree of greater polynomial.
 * Only multiplication has O(n^2) time complexity because of two nested loops.
 */
public class Polynomials implements PolynomialsOperations {

    @Override
    public Polynomial addition(Polynomial polynomial1, Polynomial polynomial2) {
        Polynomial result = new Polynomial();
        result.degree = Math.max(polynomial1.degree, polynomial2.degree);

        for (int i = 0; i <= result.degree; i++) {
            result.coefficients[i] = polynomial1.coefficients[i] + polynomial2.coefficients[i];
        }

        return result;
    }

    @Override
    public Polynomial subtraction(Polynomial polynomial1, Polynomial polynomial2) {
        Polynomial result = new Polynomial();
        result.degree = Math.max(polynomial1.degree, polynomial2.degree);

        for (int i = 0; i <= result.degree; i++) {
            result.coefficients[i] = polynomial1.coefficients[i] - polynomial2.coefficients[i];
        }

        return result;
    }

    @Override
    public Polynomial multiplication(Polynomial polynomial1, Polynomial polynomial2) {
        Polynomial result = new Polynomial();
        result.degree = polynomial1.degree + polynomial2.degree;

        for (int i = 0; i <= polynomial1.degree; ++i) {
            for (int j = 0; j <= polynomial2.degree; ++j) {
                result.coefficients[i + j] += polynomial1.coefficients[i] * polynomial2.coefficients[j];
            }
        }

        return result;
    }

    @Override
    public double HornerAlgorithm(Polynomial polynomial, double x) {
        double result = polynomial.coefficients[polynomial.degree];

        for(int i = polynomial.degree - 1; i >= 0; i--) {
            result = result * x + polynomial.coefficients[i];
        }

        return result;
    }

    @Override
    public void printPolynomial(Polynomial polynomial) {
        for (int i = polynomial.degree; i >= 0; i--){
            if (i == 0) {
                System.out.println(polynomial.coefficients[i]);
            } else {
                System.out.print(polynomial.coefficients[i] + "x^" + i);
            }
            if (i != 0) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }
}
