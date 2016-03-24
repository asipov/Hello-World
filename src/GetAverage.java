import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str=sc.nextLine().split("\\s");
        float a =Float.parseFloat(str[0]);
        float b =Float.parseFloat(str[1]);
        float c =Float.parseFloat(str[2]);

        System.out.printf("Sum: %.2f",averageOfTreeNumbers(a,b,c));
    }
    public  static double averageOfTreeNumbers(float numa,float numb,float numc){
        double result=0d;
        return result=(double) ((numa+numb+numc)/3) ;

    }
}

