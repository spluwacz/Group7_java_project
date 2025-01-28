package olgaskakun.week1;

public class OddAndEvenNumber_OS {
    public static void main(String[] args) {

        System.out.println(oddOrEven(27));

    }


    public static String oddOrEven(int num1) {
        if (num1 % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}