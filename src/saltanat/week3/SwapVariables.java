package saltanat.week3;

public class SwapVariables {
    public static void main(String[] args) {
        //
        int num1 = 20; //
        int num2 = 5;//num2+num1=25

        // To swap the values we can use temporary variable,
        // but in the task requirements it says to swap values without third variable,
        //that why we will use arithmetic operators.

        num2=num2+num1; //25
        num1=num2-num1;//5
        num2=num2-num1;//20

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


    }
}
