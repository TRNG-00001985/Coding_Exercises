import java.util.Scanner;

public class StringPalindrome {
    public static String Palindrome(String str){
        int end  = str.length()-1;
        for(int i=0;i<(end+1)/2;i++){
            if(str.charAt(i) != str.charAt(end)) {
                return "Not a palindrome";
            }
            end--;
        }
        return "Palindrome String";
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Palindrome(str));
        
    }
}
