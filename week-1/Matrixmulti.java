import java.util.*;
public class Matrixmulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int [][] arr1 = new int[row][column];
        int [][] arr2 = new int[row][column];
        int [][] sum_arr = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr1[i][j] = sc.nextInt();
            }
        } 
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                sum_arr[i][j] = arr1[i][j] * arr2[i][j];
            }
        } 
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(sum_arr[i][j]+" ");
            }
            System.out.println();
        } 
        
    }
    
}
