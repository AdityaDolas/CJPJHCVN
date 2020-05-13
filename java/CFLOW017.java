import java.util.Scanner;
import java.util.TreeSet;

public class CFLOW017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        TreeSet ts = new TreeSet();
        if (1 <= z && z <= 1000) {
            while (z > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                ts.add(a);
                ts.add(b);
                ts.add(c);
                int result = ts.toArray().length - 2;
                System.out.println(ts.toArray()[result]);
                ts.clear();
                z--;
            }
        }
    }
}
