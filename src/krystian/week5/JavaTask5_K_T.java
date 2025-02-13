package krystian.week5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class JavaTask5_K_T {

    /*
    Write a return method that can find the frequency of characters
    Ex: FrequentcyOfChars(*AAABBCDD*) ==> A3B2C1D2
     */
    public static void main(String[] args) {

        String str = "AAACCCDFG";

        System.out.println("frequencyOfCharacters(str) = " + frequencyOfCharacters(str));

    }




    public static String frequencyOfCharacters(String str) {

        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++){
            char key = str.charAt(i);

            if(!freqMap.containsKey(key)){
                freqMap.put(key,0);

            }

            freqMap.put(key,freqMap.get(key)+1);

            }
    return freqMap.toString();

        }


    }



