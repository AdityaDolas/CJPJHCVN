import java.util.Scanner;

public class ATMHS08TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();


        if ((n1+0.5) < n2 && n1 % 5 == 0) {
            System.out.printf("%.2f", (n2 - n1) - 0.50);
        } else {
            System.out.printf("%.2f", n2);
        }
    }
}
