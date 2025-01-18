import java.util.*;
public class factorial {
    public static int fact(int x){
if(x==1){
    return 1;
}
else{
    return (x*fact(x-1)) ;

}
    }
    public static void main(String[] args) {
        int num;
        char d;
        int res;
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("enter a number: ");
            num=sc.nextInt();
              res=fact(num);
              System.out.println("the answer is: "+res);

            System.out.println("Do you want to enetr another number: ");
            d=sc.next().charAt(0);
            if(d=='n'){
                break;
            }
        }
        sc.close();
    


    }
}
