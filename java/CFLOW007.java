import java.util.Scanner;

public class CFLOW007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int result = 0;
        while (z > 0) {
            int a = sc.nextInt();
            while (a > 0) {
                int b = a % 10;
                result = (result * 10) + b;
                a = a / 10;
            }
            System.out.println(result);
            result = 0;
            z--;
        }
    }
}
