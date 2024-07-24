import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // since next returns a string so charAt extracta the first element.
        char c  = sc.next().charAt(0);
        int index = str.indexOf(c);
        System.out.println(index);
    }
    
}
