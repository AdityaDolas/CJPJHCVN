import java.util.Scanner;

public class CTLG{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int p1=0,p2=0,a=0,b=0,c=0,d=0,result=0;
        while(z>0){
            p1=sc.nextInt();
            p2=sc.nextInt();
            a=a+p1;
            b=b+p2;
            if(a>b && (a-b)>result){
                result= a-b;
                d=1;
            }else if(b>a && (b-a)>result){
                result=b-a;
                d=2;
            }
            z--;
        }
        System.out.println(d+" "+result);
    }
}
