import java.util.Scanner;

class calcu{
    public 
    int n1,n2;
    int arg;
    calcu(int n1,int n2,int arg){
        this.n1=n1;
        this.n2=n2;
        this.arg=arg;
    }
    int add(){
        return n1+n2;
    }
    int sub(){
        if(n2>n1) return n2-n1;
        return n1-n2;
    }
    int mul(){
        if(n1==0||n2==0) return 0;
        return n1*n2;
    }
    int div(){
        return n1/n2;
    }
    int mod(){
        return n1%n2;
    }
    int equal(){
        switch (arg) {
            case 1:
                int res1=add();
                return res1;
                // break;
        case 2:
        int res=sub();
                return res;
        case 3:
        int res3=mul();
        return res3;
        case 4:
        int res4=div();
            return res4;
        case 5:
        int res5=mod();
        return res5;


    }
    return 0;
}
    
}
class test  {
    int g,res;
    test(int g,int res){
        this.g=g;
        this.res=res;
    }
    void comparison(){
        if(g==res){
            System.out.println("correct answer");
        }
        else{
            System.out.println("wrong answer correct answer is: "+res);
        }
    }
    
}


public class inheri_test{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("----------------welcome to my calculator------------->");
        System.out.println("enter first number: ");
        int a=sc.nextInt();
        System.out.println("enter second number: ");
        int b=sc.nextInt();
        System.out.println("press 1 for add");
        System.out.println("press 2 for sub");
        System.out.println("press 3 for mul");
        System.out.println("press 4 for div");
        System.out.println("press 5 for mod");
         byte arg=sc.nextByte();
        calcu obj=new calcu(a,b,arg);
        int res=obj.equal();
        System.out.println("enter your guess: ");
        int guess=sc.nextInt();
        test obj1=new test(guess, res);
        obj1.comparison();


       
       
       
    }
}
