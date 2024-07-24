import java.util.Scanner;

public class MaxMin {
    public static void  Get_max_min(int[] arr,int length){
            int max = arr[0];
            int min = arr[0];
            for(int i=0;i<length;i++){
                if(max<arr[i]){
                    max = arr[i];
                }
                else if(min>arr[i]){
                    min = arr[i];
                }
            }
            System.out.println("Max :"+max);
            System.out.println("Min :"+min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr= new int[length];
        for(int i=0;i<length;i++){
            arr[i] = sc.nextInt();
        }
        Get_max_min(arr, length);
        
    }
    
}
