import java.util.Scanner;

public class matrix_multiplication {
    public static void main(String[] args) {
        int sum=0;
        int[][] arr1=new int[4][4];
        int[][] arr2=new int[4][4];
        int[][] arr3=new int[4][4];
      

        Scanner sc =new Scanner(System.in);
        System.out.println("enter a first 4X4 matrix: ");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter a Second 4X4 matrix: ");
     
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("resultant matrix: ");

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                sum+=(arr1[i][k]*arr2[k][i]);
                    arr3[i][j]=sum;
                }
            }

        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                 System.out.println(arr3[i][j]);
            }
        }
     
     



    }
}
