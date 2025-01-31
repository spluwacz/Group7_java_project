package busraovali;

public class swap_numbers {
    public static void main(String[] args) {
        int num1=20;
        int num2=15;

        num2= num1+num2;
        num1=num2-num1;
        num2=num2-num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
