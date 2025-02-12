package dansverdlov.week5;

import java.util.HashMap;

public class FrequencyOfChars_DS {

    public static void main(String[] args) {
        String inputString = "AAABBCDD";
        String result = frequencyOfChars(inputString);
        System.out.println(result);  // Output: A3B2C1D2
    }

    public static String frequencyOfChars(String inputString) {
        // Use a HashMap to store the frequency of each character
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character
        for (char ch : inputString.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Build the result string in the desired format
        StringBuilder result = new StringBuilder();
        for (char ch : frequencyMap.keySet()) {
            result.append(ch).append(frequencyMap.get(ch));
        }

        return result.toString();
    }


}


