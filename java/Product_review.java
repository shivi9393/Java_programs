import java.util.Scanner;


//this is a very very basic review system what it will do is when you input the review it will check for good keys and bad j=keys if any of them is found it will change the review rating according to the entered keyword

// update1 put the counter for the more detiled review so that if there is  multiple keyword it would give A++ (excelent) A(good) B++(average) B(poor) acc to the given input

public class Product_review {
   public static void main(String[] args) {
        String r1,r2;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the review about first product: ");
       r1= sc.nextLine();
       System.out.println("enter the review about second product: ");
       r2=sc.nextLine();
    statement_check obj=new statement_check(r1,r2);
    obj.out();
    sc.close();
   } 
}

class statement_check{
    public
    String r1, r2;
    String rat1,rat2;
    int count_g1=0,count_b1=0,count_g2=0,count_b2=0;

    statement_check(String r1,String r2){
        this.r1=r1;
        this.r2=r2;
    };
  

     void checkker(){
        String[] Good_Keys={"good","best","nice","value for money","solid","great","loved","unbreakable"};
        String[] Bad_Keys={"bad","worst","waste","not expected this","not worth","not durable","light"};
        for (String s : Good_Keys) {
            if (r1.contains(s)) { 
             count_g1++;
                
            }
            if(r2.contains(s)){
                count_g2++;
            }
        }
        for (String k : Bad_Keys) {
            if (r1.contains(k)) { 
                count_b1++;
                
            }
            if(r2.contains(k)){
                count_b2++;
            }
        }

     
    }

    void set_result_s1(){
        if(count_g1>2){
            rat1="A++";
        }
        else if(count_g1>0){
            rat1="A";
        }
        else if(count_b1>2){
            rat1="B";
        }
        else if(count_b1<2){
            rat1="B++";
        }
    }

    void set_result_s2(){

        if(count_g2>2){
            rat2="A++";
        }
        else if(count_g2>0){
            rat2="A";
        }
        else if(count_b2>2){
            rat2="B";
        }
        else if(count_b2<2){
            rat2="B++";
        }
    }

    void out(){
        checkker();  
        set_result_s1();
        set_result_s2();
        System.out.println("The Rating of First Product is"+rat1);
        System.out.println("The Rating of Second Product is"+rat2);
    }
       
    }
