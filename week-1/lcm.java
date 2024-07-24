import java.util.Scanner;

public class lcm {
    public static int LCM(int a, int b){
        if(a==0 || b==0){
            return 0;
        }
        return (a*b)/gcd(a,b);
    }
    public static int gcd(int a , int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = LCM(a,b);
        System.out.println(result);
    }
}
