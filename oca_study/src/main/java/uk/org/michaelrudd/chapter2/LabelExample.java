package uk.org.michaelrudd.chapter2;

public class LabelExample {

    /*
    Labels can be added at the head of any statement that allows the appllicatino flow to jump to, or break from it.
     */

    public static void main(String[] args) {
        labelExample();
    }

    private static void labelExample() {
        int[][] list = {{1, 3, 5}, {1, 2, 5}, {5, 2, 2}};
        int valueToSearchFor = 2;
        int positionX = -1;
        int positionY = -1;

        PARENT_LOOP:
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == valueToSearchFor) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;
                }
            }
        }
        if (positionX == -1) {
            System.out.println("No matching value was found");
        } else {
            System.out.println("Found value <" + valueToSearchFor + "> at position : {" + positionX + "," + positionY + "}");
        }
    }
}
