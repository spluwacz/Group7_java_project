package jasmina.week12;

public class UniqueIntegers_JP {

    public static int[] uniqueIntegers(int n) {
        int[] result = new int[n];
        int sum = 0;

        // The array with unique integers
        for (int i = 0; i < n -1; i++) {
            result[i] = i;
            sum += i;
        }

        // set the last element to the negative sum of the previous elements
        result [n-1] = -sum;
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] zeroSumArray = uniqueIntegers(n);

        for (int num : zeroSumArray) {
            System.out.print(num + " ");
        }
    }
}
