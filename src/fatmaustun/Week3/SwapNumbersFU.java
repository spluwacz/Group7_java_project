package fatmaustun.Week3;

public class SwapNumbersFU {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        //This step combines a and b and stores the result in a.
        a = a + b;

        //The new value of a (which is the sum of the original a and b) subtracts b to get the original value of a
        // which is then stored in b.
        b = a - b;

        //Finally, the new value of a (which is the sum of the original a and b) subtracts the new b (which is the original a)
        // to get the original b, which is then stored in a.
        a = a - b;


        //After swapping:
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
