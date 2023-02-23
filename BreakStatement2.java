//Program prints the number which is divisible by 10 using break statement.
import java.util.*;
public class BreakStatement2{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        while(n>0){
            if(n%10==0){
                System.out.println(n);
                break;
            }
            n--;
        }
     }
}
