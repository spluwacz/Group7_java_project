package amieluk.Week2;

public class FinRa {
    public static void main(String[] args) {

      //Write a function that prints out the numbers from 1 to 30 but for numbers that are
        //        a multiple of 3, print "FIN" instead of the number, and for numbers that are a multiple
        //            of 5, print "RA" instead of the number. For numbers that are a multiple of both 3 and 5,
        //            print "FINRA" instead of the number.


            String result = "";

            for(int i=1; i <= 30; i++) {
                if(i % 5==0 && i %3 ==0)
                    result += "FINRA ";
                else if(i%5 == 0)
                    result += "RA ";
                else if(i%3==0)
                    result+="FIN ";
                else
                    result += i+" ";
            }
            System.out.println(result);
        }
    }

