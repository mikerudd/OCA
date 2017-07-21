package uk.org.michaelrudd.chapter2;

public class CompoundAssignment {

    /*
    Assignment operation is anything that assigns a value to something.
   Compound Assignment is an assignment operator that does more than just a single thing. e.g. (+=, -=)
     */
    public static void main(String[] args) {
        calculate();
    }

    /*
    The result of an assignment operator is an expression in and of itself, that is equal to the value of the assignment.
     */
    private static void calculate() {
        long x = 5;
        long y = (x = 3);

        System.out.println("This is x : " + x);
        System.out.println("This is y : " + y);
    }

    /*
    Compound assignment will cast automatically, so need to code for it.
     */
    private static void calculate2() {
        long x = 10;
        int y = 5;
        y += x;

        System.out.println("This is y : " + y);
    }
    //Without using compound assignment
    private static void calculate3(){
        long x = 10;
        int y = 5;
//        y = y + x; //Compiler error because result of y + x is of type long and trying to assign to an int.

        System.out.println("This is y : " + y);
    }
}
