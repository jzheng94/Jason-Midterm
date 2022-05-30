package string.problems;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        //Init Strings and Scanner
        String string1, string2= "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to check if it is a palindrome: ");
        string1 = input.nextLine();

        int a, b = string1.length();

        //reversing and checking strings
        for ( a = b - 1; a >= 0; a--){
            string2 = string2 + string1.charAt(a);
        }if(string1.equalsIgnoreCase(string2)){
            System.out.println("The word you entered is a palindrome!");
        }
        else{
            System.out.println("The word you entered is not a palindrome!");
        }

    }
}
