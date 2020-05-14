import java.util.Scanner;

public class CFLOW008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt(), a;
        while (z-- > 0) {
            a = sc.nextInt();
            if (a < 10) {
                System.out.println("What an obedient servant you are!");
            } else {
                System.out.println("-1");
            }
        }
    }
}
