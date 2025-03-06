package busraovali.week5;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfCharacters {

    public static void main(String[] args) {
        String str1 = "AAABBCDD";

        System.out.println(frequencyOfChar(str1));
    }

    public static String frequencyOfChar(String str) {
        String exp = "";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (!map.containsKey(key)) {
                map.put(key, 0);
            }
            map.put(key, map.get(key) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            exp += entry.getKey() + "" + entry.getValue();
        }

        return exp;
    }
}



