package uk.org.michaelrudd.chapter2;

public class ContinueStatement {

    /*
    A continue statement is similar to a break statement, but, will skip to the end of the innermost loop (if unlabeled)
    a evaluate the boolean expression that controls the loop.
     */

    public static void main(String[] args) {
        continueExample();
    }

    private static void continueExample(){
        String searchText = "peter piper picked a peck of pickled peppers";

        int numOfPs = 0;
        for(int i =0; i < searchText.length(); i++){
            if(searchText.charAt(i) != 'p'){
                continue; // will cause the increment counter to not get executed if the letter isn't a p
            }
            ++numOfPs;
        }
        System.out.println("There are " + numOfPs + " matching letters in the supplied text.");
    }

}
