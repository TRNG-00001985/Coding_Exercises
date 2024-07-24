import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int number = sc.nextInt();
        if((number&1)==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}
