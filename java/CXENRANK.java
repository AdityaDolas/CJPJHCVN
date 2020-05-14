import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            long temp = u + v;
            temp = ((temp + 1) * (temp + 2)) / 2;
            System.out.println(temp - v);
        }
    }
}