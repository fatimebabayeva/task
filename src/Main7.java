import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>0) {
            System.out.println("musbet");
        } else if (a<0) {
            System.out.println("menfo");
        } else {
            System.out.println("sifir");
        }
    }
}
