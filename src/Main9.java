import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bal= sc.nextInt();
        int x = bal/10;
        switch(x) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            case 4:
                System.out.println("F");
                break;
            case 3:
                System.out.println("G");
                break;
            case 2:
                System.out.println("H");
                break;
            case 1:
                System.out.println("I");
                break;
            default:
                System.out.println("K");
                break;
        }


    }
}
