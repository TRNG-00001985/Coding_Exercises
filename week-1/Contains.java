import java.util.Scanner;

public class Contains {
    public static boolean contain(int[] arr, int length,int element){
        for(int num:arr){
            if(num==element){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0;i<length;i++){
            arr[i]= sc.nextInt();
        }
        int element = sc.nextInt();
        System.out.println(contain(arr, length,element));
    }
    
}
