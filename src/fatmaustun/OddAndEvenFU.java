package fatmaustun;

public class OddAndEvenFU {
    public static void main(String[] args) {

        int number = 7;
        int number2 =5;
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
