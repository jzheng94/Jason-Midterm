package string.problems;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        //Scanner for user input
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the first word or string.");
        String stringOne = userInput.nextLine();

        System.out.println("Enter the second word or string.");
        String stringTwo = userInput.nextLine();

        //Sets to lower case for accurate comparison.
        stringOne = stringOne.toLowerCase();
        stringTwo = stringTwo.toLowerCase();

        //Comparing both Strings, if String is equal length go forward.
        if(stringOne.length() ==  stringTwo.length()){
            char[] arrayOne = stringOne.toCharArray();
            char[] arrayTwo = stringTwo.toCharArray();

            //Sorting both arrays to check if the same letters are in both Strings.
            Arrays.sort(arrayOne);
            Arrays.sort(arrayTwo);
            boolean anagramCheck = Arrays.equals(arrayOne, arrayTwo);

            //If they have same letters, they are an array.
            if(anagramCheck) {
                System.out.println("The strings " +stringOne+ ", " +stringTwo+ " are an anagram!");
            }
            else{
                System.out.println("The strings " +stringOne+ ", " +stringTwo+ " are not an anagram!");
            }
        }
        else{
            System.out.println("The strings " +stringOne+ ", " +stringTwo+ " are not an anagram!");
        }
    }
}
