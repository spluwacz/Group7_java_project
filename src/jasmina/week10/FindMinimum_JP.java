package jasmina.week10;



public class FindMinimum_JP {

        public static void main(String[] args) {

            int[] numbers = {10, 5, 9, 1, 25, 57};
            int min = findMin(numbers);
            System.out.println("Minimum number = " + min);

        }

        public static int findMin(int[] arr) {

            int min = arr[0];

            for(int each : arr){
                if(each < min){
                    min = each;

                }

            }

            return min;


        }
    }



