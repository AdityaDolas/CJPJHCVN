import java.util.Scanner;

public class CFLOW001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a>0){
            int b = sc.nextInt();
            int c = sc.nextInt();
            int result = b+c;
            System.out.println(result);
            a--;
        }
    }
}
