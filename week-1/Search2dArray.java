import java.util.Scanner;

public class Search2dArray {
    public static boolean searchArray(int[][] arr,int target,int row,int column){
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(target==arr[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        System.out.println(searchArray(arr, target, row, column));
    }
    
}
