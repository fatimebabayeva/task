import java.util.Scanner;
public class Main17 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        int c=0;
        while (n!=0) {
            c++;
        n = s.nextInt();
        }
        System.out.println(c);
    }

}
