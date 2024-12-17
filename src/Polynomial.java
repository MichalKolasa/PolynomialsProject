/**
 * Represents a single polynomial with integer coefficients.
 * The polynomial is defined by its coefficients and degree.
 * Coefficients are stored in an array where the index corresponds to the power of x.
 */
public class Polynomial {
    final int max_deegre = 25;
    int[] coefficients = new int[max_deegre + 1];
    int degree = 0;
}
