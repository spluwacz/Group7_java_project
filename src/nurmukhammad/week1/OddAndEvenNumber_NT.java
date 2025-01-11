package nurmukhammad.week1;

import java.util.Scanner;

public class OddAndEvenNumber_NT {
    public static void main(String[] args) {

        System.out.println("enter num: ");
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(oddOrEven(num));

        scanner.close();
    }

    public static String oddOrEven (int num1){
        if (num1 % 2 == 0){
            return "Even";
        }else {
            return "Odd";
        }
    }

}
