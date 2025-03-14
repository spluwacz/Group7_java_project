package krystian.week6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueElements {

    public static void main(String[] args) {

        String str = "AAABBBCCCDDDD";

        System.out.println(removeDuplicates(str));


    }

    public static String removeDuplicates(String string){
    char[] chars = string.toCharArray();
    Set<Character> charSet = new LinkedHashSet<>();

        for(char each : chars){
            charSet.add(each);
        }


    return charSet.toString();




    }


}
