package string.problems;
import java.util.Scanner;
/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    static void printPermutation(String string, String perm){
        if (string.length() == 0){
            System.out.println(perm + " ");
            return;
        }

        for ( int a = 0; a < string.length(); a++){
            char character = string.charAt(a);
            String remainder = string.substring(0, a) + string.substring(a + 1);

            printPermutation(remainder, perm + character);
        }
    }
    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a string: ");
        String string2 = input.nextLine();
        printPermutation(string2, "");
    }
}
