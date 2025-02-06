package krystian.week4;

public class ReverseNegativeNumber_K_T {

//    2.Numbers -- Reverse negative number
//    write a return method that can reverse a negative number
//    and return it as a int
public static void main(String[] args) {

    reversedNumber(123);


}





public static void reversedNumber(int num) {

    if(num < 0){
        num = -num;//change negative to positive
        String originalNum = Integer.toString(num);//convert int to string

        String reversedNum = new StringBuilder(originalNum).reverse().toString(); // I did all this in one line normally I would have to create a string builder object convert to it and then back to string

        num = Integer.parseInt(reversedNum);
        System.out.println(num);

    }
    else if(num > 0){
        String originalNum = Integer.toString(num);//convert int to string

        String reversedNum = new StringBuilder(originalNum).reverse().toString(); // I did all this in one line normally I would have to create a string builder object convert to it and then back to string

        num = Integer.parseInt(reversedNum); // assigned num and converted string to int

        num = -num;//change positive to negative, this time at the end so it doesnt give errors



        System.out.println(num);





    }




    }







}
