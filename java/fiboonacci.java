import java.util.Scanner;

public class fiboonacci {
      static int intA;
     int b;
    fiboonacci(){
        intA=0;
        b=1;
    }
    //ame class main same class ka object declare ho sakta 
    //static method ko agar class ke bahar access karna hai toh use class name 
    //for non static use object
    public static void main(String[] args){
     int c;

        Scanner sc =new Scanner(System.in);
        System.out.println("enter number you want to print: ");
        byte n=sc.nextByte();
        fiboonacci obj=new fiboonacci();

System.out.println(fiboonacci.intA);
        System.out.println(obj.b);
        for(int i=2;i<=n;i++){
            c=intA+obj.b;
            intA=obj.b;obj.b=c;
            System.out.println(c);

        }
sc.close();

    }
}
