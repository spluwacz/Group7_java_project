package jasmina.week6;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates_JP {

    public static void main(String[] args) {

        String str = "AAABBBCCC";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);
            if (result.contains(ch)) {
                continue;
            }
            result += ch;
        }
        System.out.println(result);
    }



}
