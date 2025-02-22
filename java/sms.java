import java.util.Scanner;

class student{
    int rollno;
    String name;
    int[] marks=new int[5];
    student(int[] m,int r,String n){
        rollno=r;
        name=n;
        marks=m;
    }
    void get(){
        System.out.println();
        System.out.println("name of student is: "+name);
        System.out.println("roll no of student is: "+rollno);
        System.out.println("marks of student is--->>>>");
        for(int i=0;i<5;i++){
            System.out.println("marks in "+(i+1)+" subject is: "+marks[i]);
        }
    }

}




public class sms {
    public static void main(String[] args) {
        int[] m=new int[5];
        int r;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name: ");
        name=sc.nextLine();
        System.out.println("enter rollno: ");
        r=sc.nextInt();
        System.out.println("enter marks--> ");
        for(int i=0;i<5;i++)
        {
            System.out.println("enter marks in "+(i+1)+" subject: ");
            m[i]=sc.nextInt();
        }

        student obj[]=new student[5];//array of objects 
        obj[0]=new student(m,r,name);
        // obj[0].get();
        obj[1]=obj[0];
        obj[1].get();
       sc.close();
    }
}
