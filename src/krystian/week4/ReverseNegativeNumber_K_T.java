package krystian.week4;

public class ReverseNegativeNumber_K_T {

//    2.Numbers -- Reverse negative number
//    write a return method that can reverse a negative number
//    and return it as a int
public static void main(String[] args) {

    //reversedNumber(-632);

    System.out.println("reverseNum(-132) = " + reverseNum(-132));


}





public static void reversedNumber(int num) {

    if(num < 0){
        num = -num;//change negative to positive
        String originalNum = Integer.toString(num);//convert int to string

        String reversedNum = new StringBuilder(originalNum).reverse().toString(); // I did all this in one line normally I would have to create a string builder object convert to it and then back to string

        num = Integer.parseInt(reversedNum);
        num = -num;//change positive to negative
        System.out.println(num);

    } else if(num > 0){
        System.out.println("please enter negative number");





    }




    }


    public static int reverseNum(int  num) {
        String str = new StringBuilder(""+num).reverse().toString();
        if(num < 0) { //231-
            str = "-"+str.substring(0, str.length()-1);
        }
        return Integer.valueOf(str);
    }




}
