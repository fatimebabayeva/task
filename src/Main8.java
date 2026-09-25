import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if (a>0 && a< 12) {
            System.out.println("usaq");
        } else if (a>13 && a< 17) {
            System.out.println("yeniyetme");
        } else {
            System.out.println("yetkin");
        }
    }
}
