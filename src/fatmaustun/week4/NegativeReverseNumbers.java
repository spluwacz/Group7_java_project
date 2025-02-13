package fatmaustun.week4;

public class NegativeReverseNumbers {
    public static void main(String[] args) {
        int num = -123;
        int reversedNum = reverseNum(num);
        System.out.println("Reversed Number: " + reversedNum);
    }

    public static int reverseNum(int num) {
        String str = new StringBuilder("" + num).reverse().toString();
        if (num < 0) { // For example, "231-"
            str = "-" + str.substring(0, str.length() - 1);
        }
        return Integer.valueOf(str);

    }


}
