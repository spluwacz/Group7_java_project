package krystian.week1;

import java.util.Scanner;

public class OddAndEven_K_T {

    public static void main(String[] args) {
        // did this as an extra so different numbers can be entered into console, instead of calling method
        System.out.println("enter num: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(oddOrEven(num));
        scanner.close();

        //calling in main method
        System.out.println(oddOrEven(2));
    }

                                                //created public access so i can access from anywhere, static
                                                // modifier because i want to access without creating an object
    public static String oddOrEven(int num1) {  // method takes int argument with variable name num1 as we num for scanner
        if (num1 % 2 == 0) {     //im going to check if a number can be divided by 2 with a remainder of 0
            return "Even";         // if it is it will return even
        } else {                  // if not only option is to return odd
            return "Odd";
        }

    }


}
