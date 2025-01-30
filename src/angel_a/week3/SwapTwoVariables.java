package angel_a.week3;

public class SwapTwoVariables {

    public static void main(String[] args) {

        int a = 5;// Creating first variable
        int b = 10;// Creating second variable

        System.out.println("Original Value");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;  // 15
        b = a - b;  // 5
        a = a - b;  //10

        System.out.println("------------------------");

        System.out.println("New Value");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


