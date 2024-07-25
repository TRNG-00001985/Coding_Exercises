import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        int[][] transposed_matrix = new int[columns][rows];
        for(int i=0;i<rows;i++){
            for(int j=0 ; j<columns;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0 ; j<columns;j++){
                transposed_matrix[j][i] = matrix[i][j];
            }
        }
        for(int i=0;i<columns;i++){
            for(int j=0 ; j<rows;j++){
                System.out.print(transposed_matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
