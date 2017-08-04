package uk.org.michaelrudd.chapter3.understandingEquality;

import java.util.Arrays;

public class StringPool {
    public static void main(String[] args) {

        StringPool sp = new StringPool();
        String y = sp.assignValueY();

        String x = "Hello World";
        //== is object reference equality
        if(x == y){
            System.out.println("value of x : " + x + " value of y :" + y);
        } else{
            System.out.println("object did not match :(");
        }

        if(x.equals(y)){
            System.out.println("I will get printed because string equals method will evaluate to true, because the string object's" +
                    " values are the same");
        }
    }


    //despite calling the trim method, the literal matches at compile time. Hence the object reference will match x.
    //if put an additional space in, the string literal at compile time will be different a therefore a different String
    // object will be returned following the trim operation.
    private String assignValueY(){
        return "Hello World ".trim();
    }

    Arrays.sort();
}
