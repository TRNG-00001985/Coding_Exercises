import java.util.*;
public class ArraySum {
     /*For finding the sum of the array 
     First we need to declare a variable for storing the sum and
      then we need to traverse the array for each traversal add the array element to the variable declared before to store the sum.  
      */
    public static int Sum_of_Array(int[] arr,int n){
        int sum = 0;
        for(int i=0;i< n ;i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        int[] arr = new int[size]; 
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Sum_of_Array(arr,size));
    }
}
