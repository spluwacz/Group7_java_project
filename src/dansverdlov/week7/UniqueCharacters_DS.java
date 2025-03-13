package dansverdlov.week7;

public class UniqueCharacters_DS {

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        System.out.println(unique(input));  // Output: DEF
    }

    public static String unique(String str) {
        StringBuilder uniqueChars = new StringBuilder();

        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Check if the character appears only once in the string
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) { //  indexOf(currentChar): Finds the first occurrence of the character.
                uniqueChars.append(currentChar); //lastIndexOf(currentChar): Finds the last occurrence of the character.

                // If both the first and last occurrences of a character are the same,
                // it means the character appears only once in the string, and it is then added to the string builder.

            }
        }

        return uniqueChars.toString();
    }


}
