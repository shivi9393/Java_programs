import java.util.Scanner;
public class freq_vowel{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        int countv=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='e'){
                countv++;
            }
        }
        System.out.println("number of vowels in entered string are: "+countv);
        sc.close();
    }
}