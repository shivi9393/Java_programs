public class jagged_array {
    public static void main(String[] args) {
        String[][] arr=new String[4][];
        arr[0]=new String[1];
        arr[1]=new String[2];
        arr[2]=new String[3];
        arr[3]=new String[4];

        arr[0][0]="A";
        arr[1][0]="B";
        arr[1][1]="C";
        arr[2][0]="D";
        arr[2][1]="E";
        arr[2][2]="F";
        arr[3][0]="G";
        arr[3][1]="H";
        arr[3][2]="I";
        arr[3][3]="J";

        System.out.println(arr[0][0]);
        System.out.print(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.print(arr[2][0]);
        System.out.print(arr[2][1]);
        System.out.println(arr[2][2]);
        System.out.print(arr[3][0]);
        System.out.print(arr[3][1]);
        System.out.print(arr[3][2]);
        System.out.println(arr[3][3]);



    }

}
