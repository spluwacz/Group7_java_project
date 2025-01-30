package saltanat.week1;

public class OddAndEvenNumber_ST {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i <= 10; i+=2) {
            sumEven += i;
        }
        for (int i = 1; i <= 10; i+=2) {
            sumOdd += i;
        }
        /*
        for (int i = 0; i <= 10; i++) {
            if (i%2==0){
            sumEven += i;
            }else{
            sumOdd +=i;
         */
        System.out.println("Sum of even: " + sumEven);
        System.out.println("Sum of odd: " + sumOdd);





    }
}

