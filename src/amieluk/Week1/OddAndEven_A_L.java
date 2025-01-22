package amieluk.Week1;

public class OddAndEven_A_L {
    public static void main(String[] args) {

        int number = 7;
        String result = oddEven(number);
        System.out.println(result);
    }

    public static String oddEven(int number) {
        if (number % 2 == 0) {
            return number + " is even.";
        } else {
            return number + " is odd.";
        }
    }
}

