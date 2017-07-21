package uk.org.michaelrudd.chapter2;

public class IncrementDecrementOperators {

    public static void main(String[] args) {
        calculate();
        calculate2();
    }

    /*
    The in/decrement operators are first resolved from left to right
    Then the calculation takes place.
     */
    private static void calculate() {
        int x = 3;
        int y = ++x * 5 / x-- + --x;

        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }

    /*
    CASTING PRIMITIVES
     */

    private static void calculate2() {
        short x = 3;
        short y = 10;
//        short result = x * y; //compiler error because short types get promoted to int when using arithmetic operation
        //to fix, will need to cast because we're going from a larger data type to a smaller data type. e.g.:

        short result = (short) (x * y);
        System.out.println(result);

    }
}
