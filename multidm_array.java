import java.util.*;
public class multidm_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row,column;
        row = 2;
        column =3;
        int arr[][]=new int[row][column];
        for(int j=0;j<row;j++){
            for(int i=0;i<column;i++){
                System.out.println("arr["+j+"]"+"["+i+"] = ");
                arr[j][i]=sc.nextInt();
            }
        }

      

        for(int j=0;j<row;j++){
            for(int i=0;i<column;i++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
