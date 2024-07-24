import java.util.Scanner;

public class containsDuplicate {
    public static boolean containsDup(int[] arr , int length){
        for (int idx = 0; idx < arr.length; idx++) {
        for(int j=0;j<length;j++){
            if(idx!=j){
                if(arr[idx]==arr[j]){
                    return true;
                }
            }
        }
    }
    return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0;i<length;i++){
            arr[i] = sc.nextInt();
        }
        System.err.println(containsDup(arr,length));
    }
    
}
