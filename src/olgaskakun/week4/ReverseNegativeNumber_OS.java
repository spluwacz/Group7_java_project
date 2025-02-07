package olgaskakun.week4;

public class ReverseNegativeNumber_OS {
    /*2.Numbers -- Reverse negative number write
    a return method that can reverse a negative number
   and return it as a int
    */
    public static void main(String[] args) {
        int num = -123456;
        System.out.println("Reversed number is: " + reverseNegativeNumber(num)); //Output
    }
    public static int reverseNegativeNumber(int num) {
        // if the number is negative, make it positive for reversing
        if (num < 0) {
            num = -num; //make the number positive
        }
        int reversedNum = 0;
        // reverse digits of the number
        while (num > 0) {
            reversedNum = reversedNum * 10 + num % 10;
            num /= 10;

        }
        //Since the original number was negative,
        // need to make the reversed number negative
        return -reversedNum;

    }
}
