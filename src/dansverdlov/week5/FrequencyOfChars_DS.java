package dansverdlov.week5;

public class FrequencyOfChars_DS {

    public static void main(String[] args) {
        String inputString = "AAABBCDD";
        String result = frequencyOfChars(inputString);
        System.out.println(result);  // Output: A3B2C1D2
    }

    public static String frequencyOfChars(String inputString) {
        StringBuilder result = new StringBuilder();
        // Create an array to store the frequency of each character (assuming only uppercase English letters)
        int[] frequency = new int[26];

        // Loop through the string and count the frequency of each character
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            frequency[ch - 'A']++;
        }

        // Build the result string in the desired format
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > 0) {
                result.append((char) (i + 'A'));  // Convert index back to character
                result.append(frequency[i]);      // Append the frequency
            }
        }

        return result.toString();
    }


}


