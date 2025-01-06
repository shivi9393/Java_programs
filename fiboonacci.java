import java.util.Scanner;

public class fiboonacci {
    public static void main(String[] args){
        int a=0,b=1,c;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number you want to print: ");
        int n=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;b=c;
            System.out.println(c);

sc.close();
        }
    }
}
