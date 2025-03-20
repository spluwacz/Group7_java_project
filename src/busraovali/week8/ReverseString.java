package busraovali.week8;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("ABCD"));
    }

    public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length()-1; i>=0 ; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }
}
