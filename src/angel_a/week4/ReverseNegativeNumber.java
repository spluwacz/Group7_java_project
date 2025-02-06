package angel_a.week4;

public class ReverseNegativeNumber {

   public static int reverseNegative(int number ){
 // If the number is negative
        if(number <0){
       // Convert the number to positive, reverse its digits, and return it
            int reverse=0;
            int absNumber= Math.abs(number);// Get the absolute value of the number

            while (absNumber!=0){
                int digit= absNumber %10;// Get the last digit
                reverse= reverse * 10 +digit;// Add the digit to the reversed number
                absNumber/=10;// remove the last digit
            }
            return  reverse;// Return the reversed number (now positive )
        }
         // if the number is not negative, return it as is
        return number;

    }

    public static void main(String[] args) {
        int number=-123456;
        int reversed= reverseNegative(number);
        System.out.println("Reversed Negative Number: "+reversed);// Output 654321

    }
}
