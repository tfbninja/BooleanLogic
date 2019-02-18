package booleanlogic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tim Barber
 */
public class BooleanLogic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String test1 = "x + y'";
        System.out.println(createTruthTable(test1));
    }

    /**
     *
     * @param expression
     * @return
     */
    public static ArrayList<Boolean> createTruthTable(String expression) {
        Scanner s = new Scanner(expression);
        ArrayList<Boolean> table = new ArrayList<>();
        s.useDelimiter("");
        ArrayList<Character> vars = new ArrayList<>();
        for (char c : expression.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                if (!vars.contains(c)) {
                    vars.add(c);
                }
            }
            if (c == ' ') {

            }
        }
        return null;
    }

}
