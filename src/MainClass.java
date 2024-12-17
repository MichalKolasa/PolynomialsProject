import java.util.Scanner;

/**
 * Main class to test implemented operations.
 */
public class MainClass extends Polynomials {

    public static void main (String[] args) {
        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();

        Scanner scanner = new Scanner(System.in);
        Polynomials polynomials = new Polynomials();

        // Wczytanie i wypisanie wielomianu 1
        System.out.print("Please enter the degree of first polynomial: ");
        p1.degree = scanner.nextInt();

        for (int i = 0; i <= p1.degree; i++) {
            System.out.print("Coefficient at x^" + i + ": ");
            p1.coefficients[i] = scanner.nextInt();
        }
        polynomials.printPolynomial(p1);


        // Wczytanie i wypisanie wielomianu 2
        System.out.print("Please enter the degree of second polynomial: ");
        p2.degree = scanner.nextInt();

        for (int i = 0; i <= p2.degree; i++) {
            System.out.print("Coefficient at x^" + i + ": ");
            p2.coefficients[i] = scanner.nextInt();
        }
        polynomials.printPolynomial(p2);


        // Dodawanie wielomianów
        System.out.println();
        Polynomial suma = polynomials.addition(p1, p2);
        System.out.print("Sum of polynomials: ");
        polynomials.printPolynomial(suma);
        System.out.println();


        // Odejmowanie wielomianów
        Polynomial roznica = polynomials.subtraction(p1, p2);
        System.out.print("Difference of polynomials: ");
        polynomials.printPolynomial(roznica);
        System.out.println();


        // Mnożenie wielomianów
        Polynomial iloczyn = polynomials.multiplication(p1, p2);
        System.out.print("Product of polynomials: ");
        polynomials.printPolynomial(iloczyn);
        System.out.println();


        // Algortym Hornera dla wielomianu 1
        double x;
        System.out.print("Please enter x for which the value of polynomial 1 is to be calculated: ");
        x = scanner.nextInt();
        System.out.println("The value of the polynomial for x = " + x + ": " + polynomials.HornerAlgorithm(p1, x));
    }
}
