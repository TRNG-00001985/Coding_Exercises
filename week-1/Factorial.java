import java.util.Scanner;

public class Factorial {
    public static int Facto(int num){
        int result = 1;
        if(num==0){
            return result;
        }
        for(int i=1;i<=num;i++){
            result = result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(Facto(number));
    }
    
}
