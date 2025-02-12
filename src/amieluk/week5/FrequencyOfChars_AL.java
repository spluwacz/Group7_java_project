package amieluk.week5;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChars_AL {

    public static void main(String[] args) {


        // creat a string
        String str = "AAABBCDD";

        /* create a map for the key  Character, Integer for the value.
        character = represents each unique key "AAABBCDD"
        integer = counts the frequency of the character
        linkedHashmap = guarantees the same order as the key vs hashmap does not
         */
        Map<Character,Integer > counter = new LinkedHashMap<>();

        for (int i = 0; i < str.length() ; i++) {
            char key = str.charAt(i);

            // if statement will check if map contains each character
            if (!counter.containsKey(key)) {
               counter.put(key,0);
            }
            // this will read the value  add a value of one
            counter.put(key,counter.get(key)+1);

        }
        System.out.println(counter);

    }
}
