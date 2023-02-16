import java.util.*;
public class SumOfNaturalNumbers  
{  
public static void main(String[] args)   
{  
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number:");
   int n=sc.nextInt();
   int sum=0; 
//executes until the condition returns true  
for(int i = 1; i <= n; ++i)  
{  
//adding the value of i into sum variable  
sum = sum + i;  

}  
//prints the sum   
System.out.println("Sum of First 10 Natural Numbers is = " + sum);
}  
}  
