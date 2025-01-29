package nurmukhammad.week3;

public class NumberSwap_NT {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("Original Value");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("------------------------");

        System.out.println("New Value");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
