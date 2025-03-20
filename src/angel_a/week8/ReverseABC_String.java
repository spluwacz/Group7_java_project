package angel_a.week8;

public class ReverseABC_String {

    public static void main(String[] args) {
        System.out.println(reverseAString("ABCD"));

    }
    public static String reverseAString(String input){

        String reverse=" ";
        for (int i = input.length()-1; i >=0 ; i--) {
            reverse +=input.charAt(i);
            
        }
        return reverse;
    }
}
