package busraovali.week4;

public class reverse_negative_number {

    public static int reverseNegative(int num) {
        if (num >= 0) {
            throw new IllegalArgumentException("Number must be negative");
        }

        String reversedStr = new StringBuilder(String.valueOf(num).substring(1)).reverse().toString();
        return Integer.valueOf("-" + reversedStr);
    }

    public static void main(String[] args) {
        System.out.println(reverseNegative(-123)); // Output: -321
    }
}
