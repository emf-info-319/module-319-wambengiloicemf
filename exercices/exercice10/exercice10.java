public class Exercice10 {

    public static void main(String[] args) {

        direBonjour();
        dire("Nicolas");

        int a = -4;
        int b = 9;
        int c = 2;
        int d = 3;

        // Min
        int minimum = Math.min(a, b);  // minimum = -4
        System.out.println("Min: " + minimum);

        int maximum = Math.max(a, b);  // maximum = 9
        System.out.println("Max: " + maximum);

        // Pow
        double power = Math.pow(c, d);  // power = 2^3 = 8.0
        System.out.println("Pow: " + power);

        // Sqrt
        double squareRoot = Math.sqrt(b);  // racinecarré = sqrt(9) = 3.0
        System.out.println("Sqrt: " + squareRoot);

        // Abs
        int absoluteValue = Math.abs(a);  // absoluteValue retourne  = |-4| = 4
        System.out.println("Abs: " + absoluteValue);

    }

    public static void direBonjour() {

        System.out.println("Bonjour");
    }

    public static void dire(String mot) {
        System.out.println(mot);

    }


}
