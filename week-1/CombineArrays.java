import java.util.Scanner;

public class CombineArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1_length = sc.nextInt();
        int arr2_length = sc.nextInt();
        int[] arr1 = new int[arr1_length];
        int[] arr2 = new int[arr2_length];
        for(int i=0;i<arr1_length;i++){
            arr1[i] = sc.nextInt(); 
        }
        for(int i=0;i<arr2_length;i++){
            arr2[i] = sc.nextInt();
        }
        int[] combined_arr = new int[arr1_length+arr2_length];
        int index = 0;
        for(int num: arr1){
            combined_arr[index++] = num;
        }
        for(int num:arr2){
            combined_arr[index++] = num;
        }
        for(int num:combined_arr){
            System.out.print(num+" ");
            
        }
    }
    
}
