package busraovali.week6;

public class removeDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBCCC"));
    }

    public static String removeDuplicates(String s) {
        String result = s.charAt(0)+"";
        for (int i = 0; i < s.length(); i++) {
            if(!result.contains(String.valueOf(s.charAt(i)))){
                result += s.charAt(i);
            }
        }
        return result;
        }


}
