public class digits_reccurssion {
    public static void digit(int n1){
        if(n1<10){
            System.out.println(n1);
            return;
         }
         digit(n1/10);
            System.out.println(n1%10);
         
    }
    
    public static void main(String[] args) {
    digit(4334);
    }
}