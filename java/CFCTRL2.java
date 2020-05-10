import java.math.BigInteger;
import java.util.Scanner;

public class CFCTRL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        //int count = 1;
        BigInteger count = new BigInteger("1");
        if (z >= 1 && z <= 100) {
            while (z > 0) {
                int a = sc.nextInt();
                if (a >= 1 && a <= 100) {
                    while (a > 0) {
                        count = count.multiply(BigInteger.valueOf(a));
                        a--;
                    }
                    System.out.println(count);
                    count = BigInteger.valueOf(1);
                    z--;
                }
            }
        }
    }
}
