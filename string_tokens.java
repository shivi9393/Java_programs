import java.util.Scanner;
import java.util.StringTokenizer;

public class string_tokens {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your String: ");
        String p=sc.nextLine();
        System.out.println("enter token: ");
        String tkn=sc.nextLine();
        StringTokenizer st=new StringTokenizer(p,tkn);
        String[] tok=new String[st.countTokens()];
        System.out.println("your array of tokens is:");
        while(st.hasMoreTokens()){
            Short i=0;
            tok[i]=st.nextToken();
            System.out.println(tok[i]);
            i++;
        }
        sc.close();
    }
}
