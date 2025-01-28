package dansverdlov.week3;

public class NumberSwap_DS {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("Original Value of a = " + a + "\nOriginal Value of b = " + b);

        a = a + b ; // this turns 'a' into 15 ( 5 + 10 )
        b = a - b ; // 'b' is now 5 ( 15 - 10 )
        a = a - b ; // finally, 'a' becomes 10 , completing the number swap.

        System.out.println("------------------------");

        System.out.println("New Value of a = " + a + "\nNew Value of b = " + b);
    }
}
