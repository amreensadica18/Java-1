// Sum of all numbers until the input is positive.
import java.util.Scanner;
public class LoopControl {    
public static void main(String[] args) {  
int n,sum=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the numbers:");
 
    while(true){
        n = sc.nextInt();
        if(n < 0){
            break;
        }
        sum+=n;
       
    }
     System.out.println("Sum is:" +sum);
}    
}
