import java.util.Scanner;
public class Main15 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int hasil=1;
        for (int i=1; i<=n; i++)
            hasil=hasil*i;
        System.out.println(hasil);
    }
}
