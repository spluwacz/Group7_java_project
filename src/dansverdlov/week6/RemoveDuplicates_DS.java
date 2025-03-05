package dansverdlov.week6;

import java.util.*;

public class RemoveDuplicates_DS {



    public static void main(String[] args) {

        String input = "AAABBBCCC";
        String output = removeDup(input);
        System.out.println(output);




        //solution 2 - without method - from Practice Task

        List<String> list = new ArrayList<>(Arrays.asList("a", "a", "a", "b", "b", "b", "c", "c","c"));
        Set<String> unique = new HashSet<>(list);

        System.out.println(unique);

        //solution 3 - without method - from Practice Task

        List<String> list2 = new ArrayList<>(Arrays.asList("a", "a", "a", "b", "b", "b", "c", "c"));

        List<String> unique2 = new ArrayList<>();

        for(String each : list2) {
            if(!unique2.contains(each)) {
                unique2.add(each);
            }
        }
        Collections.sort(unique2);
        System.out.println(unique2);


    }

    public static String removeDup(String str) {
        StringBuilder result = new StringBuilder(); //We use a StringBuilder to build the result.

        //loop through the input string and check if the current character is already present in the result string.

        for (int i = 0; i < str.length(); i++) {
            // If the result string does not already contain the current character, it is appended to the result string.
            if (result.indexOf(String.valueOf(str.charAt(i))) == -1) { // indexOf() helps check if the character is already added to the result.
                result.append(str.charAt(i));
            }
        }
        return result.toString();

    }
}
