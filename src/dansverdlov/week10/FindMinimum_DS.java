package dansverdlov.week10;

public class FindMinimum_DS {
    public static void main(String[] args) {
        int[] numbers = {10, 3, 8, 2, 44};
        System.out.println("Minimum number: " + findMin(numbers));
    }

    public static int findMin(int[] arr) {
        int min = arr[0]; // initialize the first number in the array as the minimum

        //loop through the array , and if a number is less than the declared min, then that number becomes the min.
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        //return min number
        return min;
    }
}