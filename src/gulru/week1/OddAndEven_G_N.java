package gulru.week1;

public class OddAndEven_G_N {public static void main(String[] args) {
    // did this as an extra so different numbers can be entered into console, instead of calling method
    //System.out.println("enter num: ");
    //Scanner scanner = new Scanner(System.in);
    // int num = scanner.nextInt();

    // System.out.println(oddOrEven(num));
    //scanner.close();

    //calling in main method
    oddOrEven(30);

}

    //created public access so i can access from anywhere, static
    // modifier because i want to access without creating an object
    public static void oddOrEven(int num) {                             // method takes int argument with variable name num1 as we num for scanner
        if (num % 2 == 0) {
            //im going to check if a number can be divided by 2 with a remainder of 0
            System.out.println("your number " + num + " Even");         // if it is it will return even
        } else {                                                     // if not only option is to return odd
            System.out.println("your number " + num + " Odd");
        }

    }


}

