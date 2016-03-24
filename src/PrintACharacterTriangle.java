import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int number =sc.nextInt();
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <=number ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print((char)(j+97)+" ");
            }
            System.out.println();
        }
        for (int i=(number-1); i > 0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print((char)(j+97)+" ");
            }
            System.out.println();
        }

    }
}
