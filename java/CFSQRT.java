import java.util.Scanner;

public class CFSQRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        while (z>0){
            int a = sc.nextInt();
            int result = (int) Math.sqrt(a);
            System.out.println(result);
            z--;
        }
    }
}
