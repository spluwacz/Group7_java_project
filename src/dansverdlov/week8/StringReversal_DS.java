package dansverdlov.week8;

public class StringReversal_DS {

    public static void main(String[] args) {
        String input = "ABCD";
        String reversed = reverseString(input);
        System.out.println("Reversed String : " + reversed);

    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input); //create a stringbuilder with the initialized contents of 'input'
        return reversed.reverse().toString(); // use .reverse from the stringbuilder class to reverse the toString.
    }
}
