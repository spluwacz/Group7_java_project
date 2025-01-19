package fatmaustun.week2;

public class FinRa {
    public static void main(String[] args) {

        int num=30;

        for(int i = 1; i <= 30 ; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else {
                System.out.println(i);
            }
        }
    }
}
