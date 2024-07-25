import java.util.*;
public class SubArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] arr = new int[length];
        for(int i=0;i<length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                for(int k =i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}