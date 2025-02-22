import java.util.Scanner;

class student_data{
    
    byte marks;
    String name;
public
student_data(byte m,String n){
    marks=m;
    name=n;

}//use of constuctor eliminates the chancesof getting garbage value

void printf(){
    System.out.println("name:"+name);
    System.out.println("marks:"+marks);
}
}

public class marks {
    public static void main(String[] args) {
    byte marks;
    String name;
    Scanner sc =new Scanner(System.in);
    System.out.println("enter name");
    name=sc.nextLine();
    System.out.println("enter marks: ");
    marks=sc.nextByte();
    student_data obj=new student_data(marks, name);
    System.out.println("you details: ");
    obj.printf();
sc.close();

    }
}
