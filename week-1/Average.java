import java.util.Scanner;

public class Average {
    public static int Average_of_array(int[] arr, int length){
        // Average is calculating by adding the total values is divided by number of values
        int sum = 0;
        for(int i=0;i<length;i++){
            sum += arr[i];
        }
        return sum/length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0;i<length;i++){
            arr[i] = sc.nextInt();
        } 
        System.out.println(Average_of_array(arr, length));
    }
}
