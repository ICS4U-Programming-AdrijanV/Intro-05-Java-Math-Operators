/**
* The HelloWorld program implements an application that
* simply displays my plans for next year to the standard output.
*
* @author  Adrijan Vranjkovic
* @version 1.0
* @since   2023-02-08
*/
public final class MathOperators {

    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private MathOperators() {
        throw new IllegalStateException("Utility class.");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        System.out.println("8 + 3 = " + (8 + 3));
        System.out.println("6 - 5 = " + (6 - 5));
        System.out.println("5 * 4 = " + (5 * 4));
        System.out.println("8 / 4 = " + (8 / 4));
        System.out.println("11 / 6 = " + (11f / 6f));
        System.out.println("11 / 6 = " + (11d / 6d));
        System.out.println("7^2 = " + (Math.pow(7, 2)));
        System.out.println("4^3 = " + (Math.pow(4, 3)));
        System.out.println("√36 = " + (Math.sqrt(36)));
    }
}
