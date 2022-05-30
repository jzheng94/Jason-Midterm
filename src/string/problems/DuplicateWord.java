package string.problems;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static HashMap<String, Integer> duplicateWords(String source) {
        HashMap<String, Integer> hash = new HashMap<String, Integer>();

        //split string into multiple words
        String[] words = source.split("\\s+");

        //Iterate over array and check for periods before putting into hash map
        for (String a : words) {
            if (a.contains(".")) {
                a = a.replace(".", "");
                a = a.toLowerCase();
            }
            if (hash.containsKey(a)) {
                hash.put(a, hash.get(a) + 1);
            } else {
                hash.put(a, 1);
            }
        }
        //Remove values of 1
        hash.entrySet().removeIf(a -> (1 == a.getValue()));
        return hash;
    }

    //Method for average length
    public static double Average(String source) {
        double average = 0;
        String[] words = source.split("\\s+");
        int sum = 0;
        for (String a : words) {
            if (a.contains(".")) {
                a = a.replace(".", "");
            }
            sum += a.length();
        }
        average = (double) sum / words.length;
        return average;
    }

    public static void main (String[] args){
            /*
             * Write a java program to find the duplicate words and their number of occurrences in the string.
             * Also Find the average length of the words.
             */

            String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

            HashMap<String, Integer> numOfOccurences = new HashMap<String, Integer>();
            numOfOccurences = duplicateWords(st);

            for (Map.Entry<String, Integer> a : numOfOccurences.entrySet()) {
                System.out.println(a.getKey() + " : " + a.getValue());
            }
            //sout average length of words
            System.out.println("Average Length :" + String.format("%4f", Average(st)));
    }

}

