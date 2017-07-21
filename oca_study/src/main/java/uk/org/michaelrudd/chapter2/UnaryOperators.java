package uk.org.michaelrudd.chapter2;

public class UnaryOperators {

    public static void main(String[] args) {
        calculate1();
    }

    /*
     In this case x will be promoted to int and then double because it's operating on a float without an f, therefore
      defaults to be a double. Because multiplication and division have equal precedence, they are evaluated left to right.
     No compilation error because
     */
    private static void calculate1() {
        short x = 14;
        float y = 13; //no f to specify floating point value, therefore defaults to double.
        double z = 30;

        System.out.println(x * y / z);
    }

    private static void calculate2() {
        double x = 39.21;
        float y = 2.1f;
//        float y = 2.1; // compilation error because decimal value defaults to be double if no type specified.

        System.out.println(x + y);
    }
}
