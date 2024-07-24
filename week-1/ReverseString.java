import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder reverse_str = new StringBuilder(str);
        System.out.println(reverse_str.reverse());
    }
    
}
