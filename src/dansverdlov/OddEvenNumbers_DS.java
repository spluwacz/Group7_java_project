package dansverdlov;

public class OddEvenNumbers_DS {

    public static void main(String[] args) {

        System.out.println(oddOrEven(5));

    }


    public static String oddOrEven(int num1) {
        if (num1 % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}