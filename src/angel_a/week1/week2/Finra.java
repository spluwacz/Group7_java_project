package angel_a.week1.week2;

public class Finra {

    public static void main(String[] args) {

        /*Write a function that prints out the numbers from 1 to 30
        but for numbers that are a multiple of 3, print "FIN" instead of the number,
         and for numbers that are a multiple of 5, print "RA" instead of the number.
          For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.

         */
        int num=10;// first we declare a number - they are 4 posiible outcomes,just number
                  // by 3, by 5 , or both

        boolean byNum3= num %3==0;
        boolean byNum5= num %5==0;

        if(byNum3 && byNum5 ){
            System.out.println("FINRA");
        }else if(byNum3){
            System.out.println("FIN");
        }else if(byNum5){
            System.out.println("RA");

        }else {
            System.out.println(num);
        }
    }


}
