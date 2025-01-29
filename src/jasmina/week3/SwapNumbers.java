package jasmina.week3;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("--------------------");

        a = a + b; //30
        b = a - b; //10
        a = a - b; //20

        System.out.println("After swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
