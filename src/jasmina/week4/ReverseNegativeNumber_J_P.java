package jasmina.week4;

public class ReverseNegativeNumber_J_P {

    public static void main(String[] args) {

        int num = -4321;
        System.out.println("Reversed number: " + reverseNegativeNumber(num));
    }


        public static int reverseNegativeNumber(int num) {

            num = -num;
            int reversed = 0;


            while (num > 0) {
                int digit = num % 10;
                reversed = (reversed * 10) + digit;
                num = num / 10;
            }
            return -reversed;



        }

    }

