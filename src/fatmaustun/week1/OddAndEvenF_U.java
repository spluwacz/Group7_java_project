package fatmaustun.week1;

public class OddAndEvenF_U {
    public static void main(String[] args) {
        int number = 11;
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
