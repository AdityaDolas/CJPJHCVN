import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet ts = new TreeSet();
        int z = sc.nextInt();
        while (z > 0) {

            int a = sc.nextInt();

            ts.add(a);

            z--;
        }
        System.out.println(ts.last());
    }
}