import java.util.*;
public class GreaterorLesser {
    public static int[] GreaterLesser(int num1,int num2,int num3){
        int [] numbers = new int[2];
        if(num1>num2 && num1>num3){                 
            // if the num1 is greater than num2 and num 3 then this we will find smaller one by using if condition
            if(num2<num3){
                numbers[0] = num1;
                numbers[1] = num2;
            }
            else{
                numbers[0] = num1;
                numbers[1] = num3;
            }
        }
        else if(num2>num1 && num2>num3){
            // if the num2 is greater than num1 and num 3 then this we will find smaller one by using if condition
            if(num1<num3){
                numbers[0] = num2;
                numbers[1] = num1;
            }
            else{
                numbers[0] = num2;
                numbers[1] = num3;
            }
        }
        else{
            // if the num3 is greater than num1 and num2 then this we will find smaller one by using if condition
            if(num1<num3){
                numbers[0] = num3;
                numbers[1] = num1;
            }
            else{
                numbers[0] = num3;
                numbers[1] = num2;
            }
        }
        return numbers;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int[] arr = GreaterLesser(num1,num2,num3);
        System.out.println("Largest :"+arr[0]);
        System.out.println("Smallest :"+arr[1]);
    }
}