package amieluk.Week3;

public class NumberSwap_AL {
    public static void main(String[] args) {

        // Swap two numbers without using a third variable.

        int x = 10;
        int y = 20;

        System.out.println("Before Swapping :: x=" + x + ", y=" + y);

        //logic for swapping
        x= x+y; //10+20 = 30
        y = x-y;//30-20=10
        x = x-y; //30-10=20
        System.out.println("After Swapping :: x=" + x + ", y=" + y);


    }
}
