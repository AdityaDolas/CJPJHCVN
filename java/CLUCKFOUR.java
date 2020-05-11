import java.util.Scanner;

public class CLUCKFOUR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int count = 0;
        while (z>0){
            int a = sc.nextInt();
            while (a>0){
                int b = a % 10;
                if(b==4){
                    count++;
                }
                a=a/10;
            }
            System.out.println(count);
            count=0;
            z--;
        }
    }
}
