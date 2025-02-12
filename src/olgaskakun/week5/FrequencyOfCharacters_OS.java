package olgaskakun.week5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// write a return method that can find the frequency of characters
// ex: FrequencyOfChars(*AAABBCDD*) ==> A3B2C1D2

public class FrequencyOfCharacters_OS {


    public static void main(String[] args) {
        String input = "AAABBCDD";
        System.out.println(FrequencyOfChars(input));
    }

    public static String FrequencyOfChars(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }




}








