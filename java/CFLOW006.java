import java.util.Scanner;

public class CFLOW006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int a,b;
        int count = 0;
        while (z > 0) {
            a = sc.nextInt();
            while (a > 0) {
                b = a % 10;
                count = count + b;
                a = a / 10;
            }
            System.out.println(count);
            count=0;
            z--;
        }
    }
}
