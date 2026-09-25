import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       double mebleg= sc.nextDouble();
       double faiz= sc.nextDouble();
       double netice= mebleg * faiz / 100;
       System.out.println(netice);
    }
}
