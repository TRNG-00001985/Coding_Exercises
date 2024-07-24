import java.util.*;
public class CombineStrings {
    /*We can combine the strings by using concat method
    *Also we can concatnate two strings using '+' operator.
    *We can concat strings by using StringBuilder.
    */
    public static String combine(String str1,String str2){
        String result = str1.concat(str2);
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(combine(str1,str2));
    }
}