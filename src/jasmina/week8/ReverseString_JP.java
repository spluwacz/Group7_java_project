package jasmina.week8;

public class ReverseString_JP {

    public static void main(String[] args) {

        String str = "ABCD";
        System.out.println(reverseString(str));

    }

    public static String reverseString(String input ) {
        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }

     return reverse;

    }
}
