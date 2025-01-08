import java.util.Scanner;

public class vowel_counter {
    public static void main(String[] args) {
        short cv=0,cc=0;
    Scanner sc =new Scanner(System.in);
    System.out.println("enter a String");
    String str=sc.nextLine();
    for(short i=0;i<str.length();i++){
        if(str.charAt(i)=='a'||str.charAt(i)=='i'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='I'){
            cv++;

        }
        else{
            cc++;
        }
       
    }
    int sl=str.length();
    System.out.println("no of vowel : "+cv);
    System.out.println("no of consonant : "+sl);
    sc.close();
    }
}
