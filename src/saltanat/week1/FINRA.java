package saltanat.week1;

public class FINRA {

   // FINRA:
    //Write a function that prints out the numbers
    // from 1 to 30 but for numbers that are
    // a multiple of 3, print "FIN" instead of the
    // number, and for numbers that are a multiple of 5,
    // print "RA" instead of the number.
    // For numbers that are a multiple of both 3 and 5,
    // print "FINRA" instead of the number. ***

    public static void main(String[] args) {

        int num = 30;

            boolean byDiv3= num % 3== 0;
            boolean byDiv5= num % 5 == 0;

            if (byDiv3 && byDiv5){
                System.out.println("FINRA");
            }else if (byDiv3){
                System.out.println("FIN");
            }else if (byDiv5){
                System.out.println("RA");
            }else{
                System.out.println(num);
            }
        }
}


