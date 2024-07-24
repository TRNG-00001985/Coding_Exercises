import java.util.Scanner;

public class Arraysequal {
    public static boolean CheckEqual(int[] arr1,int[] arr2){
            if(arr1.length!=arr2.length){
                return false;
            }
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    return false;
                }
            }
            return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr1 = new int[length];
        for(int i=0;i<length;i++){
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[length];
        for(int i=0;i<length;i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(CheckEqual(arr1, arr2));
    }
    
}
