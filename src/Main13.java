import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int cem=0;
        for ( int i=1; i<=n; i++)
            cem+=i;
        System.out.println(cem);


    }
}
