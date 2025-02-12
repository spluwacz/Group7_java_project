package dansverdlov.week5;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChars_DS {


    public static void main(String[] args) {
        // Test the function with the input string "AAABBCDD"
        String input = "AAABBCDD";
        System.out.println(FrequencyOfChars(input));  // Output: A3B2C1D2
    }

    public static String FrequencyOfChars(String str) {
        // Create a HashMap to store the frequency of characters
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through the string and update the frequency of each character
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Iterate over the frequency map and build the result string
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        // Return the resulting string
        return result.toString();
    }




}


