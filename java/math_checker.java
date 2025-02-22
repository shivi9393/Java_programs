public class math_checker {
    public static void main(String[] args) {
        int a =10;
        int b=20;
    
        System.out.println("enter a for addition");
        System.out.println("enter b for subtraction");
        System.out.println("enter c for multipication");
        System.out.println("enter d for division");
        System.out.println("enter e for modulus");
;

        switch (args[0]) {
            case "a":{
                int sum=a+b;
                int inpt=30;
                // System.out.println("sum of two numbers is:"+sum);
                if(inpt==sum){
                    System.out.println("correct");
                }   
                else{
                    System.out.println("incorrect");
                }
                break;
            }
            case "b":{
                int sub=a-b;
                int inpt=-10;
                if(inpt==sub){
                    System.out.println("correct");
                }
                else{
                    System.out.println("incorrect");
                }
                // System.out.println("subtraction of two numbers is:"+sub);
                break;
            }
            case "c":{
                int mul=a*b;
                int inpt = 200;
                if(inpt==mul){
                    System.out.println("correct");
                }   
                else{
                    System.out.println("incorrect");
                }

                // System.out.println("multipication of two numbers is:"+mul);
                break;
            }
            case "d":{
                int c=20;
                float div=c/3.00f;//ifone value is float then divison will return float value
                float inpt=2.00f;
                if(inpt==div){
                    System.out.println("correct the answer is:"+div);
                }
                else{
                    System.out.println("incorrect the sum should be: "+div);
                }
                // System.out.println("division of two numbers is:"+div);
                break;
            }
            case "e":{
                int mod=b%a;
                int inpt=2;
                if(inpt==mod){
                    System.out.println("correct");
                }
                else{
                    System.out.println("incorrect");
                }
                // System.out.println("modulus of two numbers is:"+mod);
                break;
            }
        
                
    
            
        }
     


    }
}
