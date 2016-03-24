
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args) {

        System.out.println("Write the number you want to convert to Ghetto numeral system:");
        Scanner console = new Scanner(System.in);
        Integer number = console.nextInt();
        String numb = Integer.toString(number);
        int[] digits = new int[numb.length()];
        for(int i = 0; i<numb.length(); ++i){
            digits[i] = Integer.parseInt(numb.substring(i, i+1));
        }
        List<String> ghetto = new ArrayList<>(Arrays.asList("Gee", "Bro", "Zuz", "Ma", "Duh", "Yo", "Dis", "Hood", "Jam", "Mack"));
        for (int i = 0; i <digits.length; i++) {
            System.out.print(ghetto.get(digits[i]));
        }
        System.out.println();
    }
}
