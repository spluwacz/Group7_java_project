package busraovali.week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindUnique {
    public static void main(String[] args) {
        System.out.println(findUniqueChar("AAABBBCCCDEF"));
    }

    public static String findUniqueChar(String str) {
        ArrayList<Character> chars=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        chars.removeIf(p -> Collections.frequency(chars, p) > 1);
        StringBuilder result = new StringBuilder();
        for (Character c : chars) {
            result.append(c);
        }

        return result.toString();
    }


}


