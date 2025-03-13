package amieluk.week7;

import java.util.LinkedHashMap;
import java.util.Map;

public class String_FindTheUnique_AL {

    public static void main(String[] args) {

        //Write a return method that can find the unique characters from the string

        String str = "AAABBBCCDEF";
        Map<Character, Integer> map = new LinkedHashMap<>();
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);

            if (!checked.contains("" + key) && !map.containsKey(key)) {
                map.put(key, 1);
                checked += key;
            } else {
                map.remove(key);

            }
        }
            System.out.println(map);


    }
}


