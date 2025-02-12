package amieluk.week4;

public class ReverseNegativeNumber_AL {

    public static void main(String[] args) {
        int num = -321;
        System.out.println("Reversed number: " + reverseNegativeNumber(num));
    }


    public static int reverseNegativeNumber(int num) {
        // Make the number positive
        num = -num;  // this makes the negative number positive

        int reversed = 0;  // This will hold the reversed number

        // Reverse the digits of the number
        while (num > 0) {
            // Get the last digit of num, by using modulus % for the remainder
            int digit = num % 10;

            // Add the digit to the reversed number
            reversed = (reversed * 10) + digit;

            // Remove the last digit from num
            num = num / 10;
        }

        // Return the reversed number as negative
        return -reversed;  // The number was originally negative, so we negate it back
    }
}
