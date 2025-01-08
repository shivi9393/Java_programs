import java.util.Scanner;

public class tic_tac_toe {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Which you want to choose player1: (X/0)");
        char p1=sc.next().charAt(1);
        char p2;

        if(p1=='X'){
            p2='0';
        }
        else{
            p2='X';
        }

        for(byte i=1;i<=9;i++){
            System.out.println("enter player where you want to add your char");
            arr[i][j]=sc.nextInt();
            
        }

        
    }
}
