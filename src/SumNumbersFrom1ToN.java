import java.util.Scanner;

public class SumNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int result=0;
        int number= Integer.parseInt(console.nextLine()) ;
        for (int i = 0; i <=number; i++) {
            result +=i;
        }
        System.out.println(result);
    }
}
