import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean count = true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                count = false;
            }
        }
        if(count){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a prime Number");
        }
    }
}
