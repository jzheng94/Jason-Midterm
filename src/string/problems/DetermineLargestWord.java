package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        for(String word: wordNLength.values()) {
            s = word.length() + " " + word;
        }
        System.out.println(s);

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        //implement
        String st[] = wordGiven.split(" ");
        String maxST = st[0];
        for (int i = 1; i < st.length; i++) {
            if(st[i].length() > maxST.length()){
                maxST = st[i];
            }
        }
        map.put(maxST.length(), maxST);
        return map;
    }
}
