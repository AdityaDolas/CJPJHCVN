import java.util.Scanner;

public class INTEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result=0;
        while (a>0){
            int c = sc.nextInt();
            if(c%b==0){
                result++;
            }
            a--;
        }
        System.out.println(result);
    }
}
