package angel_a.week5;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str= "bbbccaaa";
        Map<Character, Integer> counter = new LinkedHashMap<>();

       for(int i =0; i< str.length();i++){
           char key=str.charAt(i);
           if(counter.containsKey(key)){// if counters contains map
               counter.put(key, counter.get(key)+1);//updated the key
           }else {
               counter.put(key,1);
           }


        }
        System.out.println(counter);
    }

}
